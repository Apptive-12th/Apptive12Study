package com.example.qht6.week05_assignment;

public class FriendList_Model {

    int imageresource;
    String name;
    String balloon;

    public FriendList_Model(int imagesource, String name, String balloon) {
        this.imageresource = imagesource;
        this.name = name;
        this.balloon = balloon;
    }


    public int getImageresource() {
        return imageresource;
    }

    public void setImageresource(int imageresource) {
        this.imageresource = imageresource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalloon() {
        return balloon;
    }

    public void setBalloon(String balloon) {
        this.balloon = balloon;
    }
}
