package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        //Given

        Library library = new Library("Library");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2011, 1, 11));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2012, 2, 12));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2013, 3, 13));
        Book book4 = new Book("Title4", "Author4", LocalDate.of(2014, 4, 14));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Book book5 = new Book("Title5", "Author5", LocalDate.of(2015, 5, 15));

        Library librarySC = library.shallowCopy();
        librarySC.setName("libraryShallowCopy");
        librarySC.getBooks().add(book5);


        Library libraryDC = library.deepCopy();
        libraryDC.setName("libraryDeepCopy");

        //When
        libraryDC.getBooks().remove(book5);

        //Then
        System.out.println(library);
        System.out.println(librarySC);
        System.out.println(libraryDC);

        assertSame(5,library.getBooks().size());
        assertSame(5,librarySC.getBooks().size());
        assertSame(4,libraryDC.getBooks().size());
    }
}
