package com.example.qht6.week05_assignment;

public class OptionList_Model {

    int Icon;
    String contents;

    public OptionList_Model(int Icon, String contents) {
        this.Icon = Icon;
        this.contents = contents;
    }

    public int getTitle() {
        return Icon;
    }

    public void setTitle(int name) {
        this.Icon = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String balloon) {
        this.contents = balloon;
    }
}
