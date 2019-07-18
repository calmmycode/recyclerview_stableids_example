package com.calmmycode.myapplication.model;

public class TitleData extends BaseData {
    private String title;

    public TitleData(String title) {
        this.title = title;
    }

    @Override
    public int getType() {
        return TYPE_TITLE;
    }

    public String getTitle() {
        return title;
    }
}
