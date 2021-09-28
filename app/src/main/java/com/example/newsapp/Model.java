package com.example.newsapp;

public class Model {

    String header, image, link;

    public Model() {
    }

    public Model(String header, String image, String link) {
        this.header = header;
        this.image = image;
        this.link = link;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
