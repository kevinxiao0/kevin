package com.lambda.code30days;

public class exception_16 {

    public static void main(String[] args) {
        int [] intArray = new int[10];

        try{
            System.out.println(intArray[10]);
//        }catch (Exception e){
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Error " + a);
        }
//        finally {
//            System.out.println("end");
//        }

    }



}
