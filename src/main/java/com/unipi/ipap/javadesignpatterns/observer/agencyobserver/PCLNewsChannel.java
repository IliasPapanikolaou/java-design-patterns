package com.unipi.ipap.javadesignpatterns.observer.agencyobserver;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

    private String news;

    public PCLNewsChannel() {
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews(String.valueOf(evt.getNewValue()));
    }
}
