package com.example.clothingshop;

public class ModelClass {

    private int imageResource;
    private String title;
    private String body;
    private String shortDesc;

    public ModelClass(int imageResource, String title, String body,String shortDesc) {
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
        this.shortDesc = shortDesc;
    }

    public int getImageResource() {

        return imageResource;
    }

    public String getTitle() {

        return title;
    }

    public String getBody() {

        return body;
    }
    public String getShortDesc() {
        return shortDesc;
    }

}
