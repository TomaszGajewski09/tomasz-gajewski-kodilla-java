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

    /*@Test
    public void testSaveInvoiceWithItems() {
        // Tworzenie produktów
        Product product1 = new Product();
        product1.setName("Product 1");
        productDao.save(product1);

        Product product2 = new Product();
        product2.setName("Product 2");
        productDao.save(product2);

        // Tworzenie faktury
        Invoice invoice = new Invoice();
        invoice.setNumber("INV-001");

        // Tworzenie pozycji
        List<Item> items = new ArrayList<>();

        Item item1 = new Item();
        item1.setPrice(new BigDecimal("10.0"));
        item1.setQuantity(2);
        item1.setProduct(product1);
        item1.setInvoice(invoice);
        items.add(item1);

        Item item2 = new Item();
        item2.setPrice(new BigDecimal("15.0"));
        item2.setQuantity(1);
        item2.setProduct(product2);
        item2.setInvoice(invoice);
        items.add(item2);

        invoice.setItems(items);

        // Zapis faktury
        invoiceDao.save(invoice);

        // Sprawdzenie, czy faktura i powiązane pozycje zostały poprawnie zapisane w bazie danych
//        assert invoice.getId() != null;
//        assert item1.getId() != null;
//        assert item2.getId() != null;
    }
*/
}
