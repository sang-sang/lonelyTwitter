package ca.ualberta.cs.lonelytwitter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TweetListTest {

    @Test
    public void AddTweet(){

        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
    @Test
    public void DeleteTweet(){

        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);

        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    @Test
    public void GetTweet(){

        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);

        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
    }
}
