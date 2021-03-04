package com.lambda.exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IceCreamShop {

    public static void main(String[] args) {

        int m = 4;
        int[] arr = new int[]{2,2,4,3};

//        int[] indexes = new int[]{-1, -1};
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < arr.length; i++) {
//            int cost = arr[i];
//            int diff = m- cost;
//            if (diff < 0){
//                continue;
//            }
//            Integer index = map.get(diff);
//            if (index == null) {
//                map.put(cost, i + 1);
//            }
//            else {
//                indexes = new int[]{map.get(diff), i + 1};
//                break;
//            }
//        }

        int [] indexes = new int[] {0,0};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            int cost = arr[i];
            int diff = m-arr[i];

            if (diff<0){continue;}

            Integer index = map.get(diff);
            if(index==null){
                map.put(diff, i+1);
            }else {
                indexes = new int[]{map.get(diff), i+1};
            }
        }

        for (int i = 0; i <indexes.length ; i++) {
            System.out.println(indexes[i]);
        }
    }


}