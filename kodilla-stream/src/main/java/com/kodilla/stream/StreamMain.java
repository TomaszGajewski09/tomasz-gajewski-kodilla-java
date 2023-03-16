package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Beautifying texts with lambdas");
        poemBeautifier.beautify("HI!", "*_*", (text, beautifier) -> beautifier + text + beautifier);
        poemBeautifier.beautify("Nice to meet you", "**", (text, beautifier) -> beautifier + text + beautifier);
        poemBeautifier.beautify("xyz", "abc", (text, beautifier) -> beautifier.toLowerCase() + text.toUpperCase() + beautifier.toLowerCase());
        poemBeautifier.beautify("What is the length of this word?", "Don't know", (text, beautifier) -> text.length() + text + text.length());

    }
}
