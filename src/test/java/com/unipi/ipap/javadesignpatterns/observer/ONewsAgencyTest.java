package com.unipi.ipap.javadesignpatterns.observer;

import com.unipi.ipap.javadesignpatterns.observer.agencyobserver.ONewsAgency;
import com.unipi.ipap.javadesignpatterns.observer.agencyobserver.ONewsChannel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ONewsAgencyTest {

    @Test
    void testNewsAgencyObservable() {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        assertEquals("news", observer.getNews());
    }
}
