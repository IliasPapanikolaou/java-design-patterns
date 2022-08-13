package com.unipi.ipap.javadesignpatterns.observer;

import com.unipi.ipap.javadesignpatterns.observer.agencyobserver.PCLNewsAgency;
import com.unipi.ipap.javadesignpatterns.observer.agencyobserver.PCLNewsChannel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PCLNewsAgencyTest {

    @Test
    void testNewsAgencyObservable() {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");

        assertEquals("news", observer.getNews() );
    }
}
