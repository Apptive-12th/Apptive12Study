package com.example.myapplication;

import android.graphics.drawable.Drawable;

public class ListViewItem {

    private Drawable iconDrawable1;
    private Drawable iconDrawable2;
    private Drawable iconDrawable3;
    private String titleStr1;
    private String titleStr2;
    private String titleStr3;





    public void setIcon1(Drawable icon1){
        iconDrawable1 = icon1;
    }
    public void setIcon2(Drawable icon2){
        iconDrawable2 = icon2;
    }
    public void setIcon3(Drawable icon3){
        iconDrawable3 = icon3;
    }
    public void setTitle1(String title1) { titleStr1= title1;}
    public void setTitle2(String title2) { titleStr2= title2;}
    public void setTitle3(String title3) { titleStr3= title3;}



    public Drawable getIcon1(){
        return this.iconDrawable1;
    }
    public Drawable getIcon2(){
        return this.iconDrawable2;
    }
    public Drawable getIcon3(){
        return this.iconDrawable3;
    }
    public String getTitle1(){ return this.titleStr1;}
    public String getTitle2(){ return this.titleStr2;}
    public String getTitle3(){ return this.titleStr3;}



}
