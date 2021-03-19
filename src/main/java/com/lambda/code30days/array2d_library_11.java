package com.lambda.code30days;

import java.util.HashMap;
import java.util.Map;

public class array2d_library_11 {

    Map<String, array2d_book_11> bookCollection = new HashMap<String, array2d_book_11>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    //Constructor
    public array2d_library_11(Map<String, array2d_book_11> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public array2d_library_11(Map<String, array2d_book_11> bookCollection,
                              int lengthOfCheckOutPeriod,
                              double initialLateFee,
                              double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    //getter
    public int getCurrentDay() {
        return currentDay;
    }

    public Map<String, array2d_book_11> getBookCollection() {
        return bookCollection;
    }

    public array2d_book_11 getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckOutPeriod() {
        return lengthOfCheckOutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    //setter

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    //instance method

    public void checkOutBook(String title) {
        array2d_book_11 book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckenOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You Just checked out" + title + ". Its due on day "
                    + (getCurrentDay() - getLengthOfCheckOutPeriod()) + ".");
        }

    }

    public void returnBook(String title) {
        array2d_book_11 book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() - getLengthOfCheckOutPeriod());
        if (daysLate > 0) {
            System.out.println("You own the library $"
                    + (getInitialLateFee() + daysLate * getFeePerLateDay())
                    + " because you book is " + daysLate + " days over due.");
        } else {
            System.out.println("Book returned, thank you");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckenOut(array2d_book_11 book) {
        System.out.println("Sorry, this book" + book.getTitle() + " is already checkout"
                + " it should be back on day "
                + (book.getDayCheckedOut() + getLengthOfCheckOutPeriod()) + ".");
    }


    public static void main(String[] args) {
        Map<String, array2d_book_11> bookCollection = new HashMap<>();

        array2d_book_11 harry = new array2d_book_11("HarryPotter", 999, 123);

        bookCollection.put("HarryPotter", harry);

        array2d_library_11 lib = new array2d_library_11(bookCollection);

        lib.checkOutBook("HarryPotter");

        lib.nextDay();
        lib.nextDay();

        lib.checkOutBook("HarryPotter");
        lib.setDay(17);

        lib.returnBook("HarryPotter");
        lib.checkOutBook("HarryPotter");

    }

}
