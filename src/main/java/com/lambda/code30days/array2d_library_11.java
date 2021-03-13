package com.lambda.code30days;

import java.util.HashMap;
import java.util.Map;

public class array2d_library_11 {

    Map<String, array2d_book_11> bookCollection = new HashMap<String, array2d_book_11>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public array2d_library_11(Map<String, array2d_book_11> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public array2d_library_11(Map<String, array2d_book_11> bookCollection, int lengthOfCheckOutPeriod,
                              double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }




    public static void main(String[] args) {

    }

}
