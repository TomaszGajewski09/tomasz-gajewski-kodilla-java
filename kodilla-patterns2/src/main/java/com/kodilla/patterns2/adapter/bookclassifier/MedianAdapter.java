package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        for (Book bookA : bookSet) {
            com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book bookConverted = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(
                    bookA.getAuthor(),
                    bookA.getTitle(),
                    bookA.getPublicationYear());
            books.put(new BookSignature(bookA.getSignature()), bookConverted);
        }
        return medianPublicationYear(books);
    }
}
