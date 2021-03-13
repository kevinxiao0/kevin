package com.lambda.code30days;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays_07 {

    public static void printArray(int[] array){
        System.out.println("############");

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Array is "+i+ ":" +array[i]);
        }

        System.out.println("############");
    }

    public static void printArray(String[] array){
        System.out.println("############");

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Array is "+i+ ":" +array[i]);
        }

        System.out.println("############");
    }

    public static void printArray() {
        System.out.println("false");
    }


    public static void main(String[] args) {

        int[] intArray1 = new int[4];
        int[] intArray2 = {1,2,3,4};
        String[] stringArray1 = {"bannas", "apple", "pears"};

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(stringArray1));

        intArray1[0]=1;
        intArray1[2]=3;
        System.out.println(Arrays.toString(intArray1));

        printArray(intArray1);
        printArray(stringArray1);
        printArray();

        for (String s : stringArray1){
            System.out.println(s);
        }

        System.out.println(
                Array.get(stringArray1, 1)
        );





    }
}
