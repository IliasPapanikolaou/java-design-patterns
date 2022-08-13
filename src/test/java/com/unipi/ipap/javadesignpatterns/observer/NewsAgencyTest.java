package com.unipi.ipap.javadesignpatterns.observer;

import com.unipi.ipap.javadesignpatterns.observer.agencyobserver.NewsAgency;
import com.unipi.ipap.javadesignpatterns.observer.agencyobserver.NewsChannel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsAgencyTest {

    @Test
    void testNewsAgencyObservable() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        assertEquals("news", observer.getNews());
    }

}
