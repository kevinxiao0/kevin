package com.lambda.code30days;

public class array2d_book_11 {

    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    public array2d_book_11(String title, int pageCount, int ISBN) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }


    public String getTitle() {
        return title;
    }
    public int getPageCount() {
        return pageCount;
    }
    public int getISBN() {
        return ISBN;
    }
    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }
    public int getDayCheckedOut() {
        return dayCheckedOut;
    }


    public void setIsCheckedOut(boolean newIsCheckedOut,int currentDayCheckedOut) {
        this.isCheckedOut =newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    public void setDayCheckedOut(int day){
        this.dayCheckedOut=day;
    }

}
