package com.calmmycode.myapplication.model;

public abstract class BaseData {
    public static final int TYPE_TITLE = 1;
    public static final int TYPE_HORIZONTAL_LIST = 2;

    public abstract int getType();
}
