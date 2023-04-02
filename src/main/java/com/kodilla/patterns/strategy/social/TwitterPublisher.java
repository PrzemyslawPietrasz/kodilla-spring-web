package com.kodilla.patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher{
    @Override
    public String publish() {
        return "[TWITTER] Post sucesfully posted";
    }
}
