package com.unipi.ipap.javadesignpatterns.observer.agencyobserver;

import java.util.Observable;

/**
 * Implementation With Observer
 */

public class ONewsAgency extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
