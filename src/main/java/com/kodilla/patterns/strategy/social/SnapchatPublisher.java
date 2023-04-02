package com.kodilla.patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher{
    @Override
    public String publish() {
        return "[SNAPCHAT] Post sucesfully posted";
    }
}
