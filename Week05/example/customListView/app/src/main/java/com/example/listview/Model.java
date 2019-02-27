package com.example.listview;

public class Model {

    int img;
    String name;
    String balloon;

    public Model(int img, String name, String balloon) {
        this.img = img;
        this.name = name;
        this.balloon = balloon;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
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
