package com.calmmycode.myapplication.model;

import java.util.ArrayList;

public class HorizontalListData extends BaseData {

    private ArrayList<HorizontalListItemData> list = new ArrayList<>();

    @Override
    public int getType() {
        return TYPE_HORIZONTAL_LIST;
    }

    public ArrayList<HorizontalListItemData> getList() {
        return list;
    }
}
