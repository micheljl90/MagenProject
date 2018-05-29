package com.example.hp1.myapplication;

public class Pc {
    private long id;
    private String title;
    private int imageId;

    public Pc(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {

        return title;
    }

    public int getImageId() {
        return imageId;
    }


}
