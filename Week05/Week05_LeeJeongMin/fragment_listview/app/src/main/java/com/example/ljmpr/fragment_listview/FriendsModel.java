package com.example.ljmpr.fragment_listview;

public class FriendsModel {

    private int imgDrawable;
    private String nameString;
    private String balloonString;

    public int getImg_friends() {
        return this.imgDrawable;
    }

    public void setImg_friends(int img_friends) {
        imgDrawable = img_friends;
    }

    public String getName() {
        return this.nameString;
    }

    public void setName(String name) {
        this.nameString = name;
    }

    public String getBalloon() {
        return this.balloonString;
    }

    public void setBalloon(String balloon) {
        this.balloonString = balloon;
    }
}
