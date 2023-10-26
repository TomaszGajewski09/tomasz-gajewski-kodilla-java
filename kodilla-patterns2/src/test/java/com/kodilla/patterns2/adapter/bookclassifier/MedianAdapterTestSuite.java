package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> testBooks = new HashSet<>();
        testBooks.add(new Book("autor1", "title1", 2020, "423132"));
        testBooks.add(new Book("autor2", "title2", 2019, "345324"));
        testBooks.add(new Book("autor3", "title3", 2018, "765434"));
        testBooks.add(new Book("autor4", "title4", 2014, "753413"));
        testBooks.add(new Book("autor5", "title5", 2022, "132645"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(testBooks);
        //Then
        assertEquals(2019, result);
    }
}
