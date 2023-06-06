package com.kodilla.patterns.strategy;

public sealed interface BuyPredictor permits AgressivePredictor, BalancedPredictor, ConservativePredictor {

    String predictWhatToBuy();
}