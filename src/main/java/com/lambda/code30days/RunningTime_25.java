package com.lambda.code30days;

public class RunningTime_25 {

    public static int findNumOfRepetitions(String s, char c){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(findNumOfRepetitions("qpiewurqwqpiewurqwqpiewqpiewqpiewuqpiewurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdkqpiewurqwqpiewqpiewqpiewuqpiewurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdkqpiewurqwqpiewqpiewqpiewuqpiewurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdkqpiewurqwqpiewqpiewqpiewuqpiewurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavlavnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavlavnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavlavnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavqpiewqpiewqpiewuqpiewurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavrqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavurqwnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklavnerqwerbqwkjehvjsdyfiuw4ehrjkbsdklav",'s'));
        long endTime = System.currentTimeMillis();
        long during = endTime-startTime;

        System.out.println("Test: " + during);

    }
}
