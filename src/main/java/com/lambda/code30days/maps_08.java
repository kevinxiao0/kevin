package com.lambda.code30days;

import java.util.HashMap;
import java.util.Map;

public class maps_08 {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("Mon", "one");
        dictionary.put("Tues", "two");
        dictionary.put("Wed", "three");
        dictionary.put("Thu", "fou");

        System.out.println(dictionary.get("one"));

        System.out.println(dictionary.keySet());

        System.out.println(dictionary.values());

        System.out.println(dictionary.size());


        Map<String, Boolean> shoppingList = new HashMap<>();

        shoppingList.put("ham", true);
        shoppingList.put("bread", false);
        shoppingList.put("oreos", Boolean.TRUE);

        System.out.println(shoppingList.get("ham"));

        System.out.println(shoppingList.keySet());
        System.out.println(shoppingList.values());

        System.out.println(shoppingList.toString());

        shoppingList.remove("bread");
        shoppingList.replace("ham",false);

        System.out.println(shoppingList.toString());

        shoppingList.clear();

        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());



    }


}
