package com.kodilla.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven");
        User john = new ZGeneration("John");
        User herman = new YGeneration("Herman");

        //When
        String stevenShouldPost = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldPost);
        String johnShouldPost = john.sharePost();
        System.out.println("John should: " + johnShouldPost);
        String hermanShouldPost = herman.sharePost();
        System.out.println("Herman should: " + hermanShouldPost);

        //Then
        assertEquals("[FACEBOOK] Post sucesfully posted", stevenShouldPost);
        assertEquals("[TWITTER] Post sucesfully posted", johnShouldPost);
        assertEquals("[SNAPCHAT] Post sucesfully posted", hermanShouldPost);
    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven");

        //When
        String stevenShouldPost = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldPost);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenShouldPost = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldPost);

        //Then
        assertEquals("[TWITTER] Post sucesfully posted", stevenShouldPost);
    }
}
