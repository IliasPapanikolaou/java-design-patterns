package com.unipi.ipap.javadesignpatterns.observer.agencyobserver;

public class NewsChannel implements Channel{

    private String news;

    public NewsChannel() {
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object obj) {
        this.setNews(String.valueOf(obj));
    }

}
