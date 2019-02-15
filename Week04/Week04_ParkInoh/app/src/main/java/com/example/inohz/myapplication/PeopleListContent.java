package com.example.inohz.myapplication;

public class PeopleListContent {
    int face;
    String userName;
    String userState;

    public PeopleListContent(int face, String userName, String userState) {
        this.face = face;
        this.userName = userName;
        this.userState = userState;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
