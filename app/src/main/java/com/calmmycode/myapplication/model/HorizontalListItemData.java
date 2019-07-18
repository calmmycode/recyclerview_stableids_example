package com.calmmycode.myapplication.model;

public class HorizontalListItemData {
    private int numberInRow;
    private int rowNumber;

    public HorizontalListItemData(int rowNumber, int numberInRow) {
        this.rowNumber = rowNumber;
        this.numberInRow = numberInRow;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getNumberInRow() {
        return numberInRow;
    }
}
