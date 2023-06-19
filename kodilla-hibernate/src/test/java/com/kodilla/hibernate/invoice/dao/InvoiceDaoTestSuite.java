package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    ProductDao productDao;

    @Test
    @Transactional
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal("10.00"), 2, new BigDecimal("7.50"));
        Item item2 = new Item(new BigDecimal("15.00"), 5, new BigDecimal("10.00"));

        Product product = new Product("Product 1");
        productDao.save(product);
        int productId = product.getId();

        product.getItems().add(item1);
        product.getItems().add(item2);

        item1.setProduct(product);
        item2.setProduct(product);


        Invoice invoice = new Invoice("INV-01");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);


        //When

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
//        try {
//            productDao.deleteById(productId);
//            invoiceDao.deleteById(invoiceId);
//        } catch (Exception e) {
//
//        }
    }

}
