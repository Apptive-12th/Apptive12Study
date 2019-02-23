package com.example.hw4;

public class profilemodel {
    int imgResource; // int형 : 숫자인데 R.drawable.~~에 접근하기위해
    //R.id
    //R.drawable.
    //R.           이것들이 반환형 int
    String name;
    String balloon;
//getter and setter 알트 인서트
    public int getImgResource() {
        return imgResource;
    }

    public profilemodel(int imgResource, String name, String balloon) {
        this.imgResource = imgResource;
        this.name = name;
        this.balloon = balloon;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
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
