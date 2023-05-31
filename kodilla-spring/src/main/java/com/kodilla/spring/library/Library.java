package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public final class Library {

    private final List<String> books = new ArrayList<>();

    @Autowired // Wstrzykiwanie zależności do właściwości klasy
    private LibraryDbController libraryDbController;

    // Wstrzykiwanie zależności przez konstruktor
    /*

    @Autowired
    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }
    public Library() {
        // do nothing
    }*/


    // Wstrzykiwanie zależności przy pomocy metody
    /*@Autowired
    public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }*/



    public void saveToDb() {
        libraryDbController.saveDate();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
