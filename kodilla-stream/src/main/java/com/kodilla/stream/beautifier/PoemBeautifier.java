package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, String beautifier, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(text,beautifier));
    }
}
