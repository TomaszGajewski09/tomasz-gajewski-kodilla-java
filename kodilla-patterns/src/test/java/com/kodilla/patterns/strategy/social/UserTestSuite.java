package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        Millenials millenials = new Millenials("adam89", new TwitterPublisher());
        YGeneration yGeneration = new YGeneration("jacob93", new SnapchatPublisher());
        ZGeneration zGeneration = new ZGeneration("paul3", new FacebookPublisher());

        //When
        String Mshare = millenials.sharePost();
        String Yshare = yGeneration.sharePost();
        String Zshare = zGeneration.sharePost();

        //Then

        assertEquals("Your post has been shared on Twitter", Mshare);
        assertEquals("Your post has been shared on Snapchat", Yshare);
        assertEquals("Your post has been shared on Facebook", Zshare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        Millenials millenials = new Millenials("adam89", new TwitterPublisher());
        YGeneration yGeneration = new YGeneration("jacob93", new SnapchatPublisher());
        ZGeneration zGeneration = new ZGeneration("paul3", new FacebookPublisher());

        //When

        millenials.setSocialPublisher(new FacebookPublisher());
        yGeneration.setSocialPublisher(new TwitterPublisher());
        String Mshare = millenials.sharePost();
        String Yshare = yGeneration.sharePost();
        String Zshare = zGeneration.sharePost();

        //Then

        assertEquals("Your post has been shared on Facebook", Mshare);
        assertEquals("Your post has been shared on Twitter", Yshare);
        assertEquals("Your post has been shared on Facebook", Zshare);
    }

}
