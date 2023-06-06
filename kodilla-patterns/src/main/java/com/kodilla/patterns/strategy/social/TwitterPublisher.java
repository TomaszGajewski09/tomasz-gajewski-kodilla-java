package com.kodilla.patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Your post has been shared on Twitter";
    }
}
