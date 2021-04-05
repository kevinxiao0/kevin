package com.lambda.code30days;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class importsPackages_14 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);
        System.out.println(cal.getTime());
//        String format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format.format(cal.getTime());
        System.out.println(formatted);

        abstraction_animal_13 a = new abstraction_animal_13(11) {
            @Override
            public void eat() {
                System.out.println("11");
            }
        };

    }




}
