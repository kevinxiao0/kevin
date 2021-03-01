package com.geek;

import java.lang.reflect.Field;

public class app {

    public static void main(String[] args) throws NoSuchFieldException {
        dog d = new dog("ggg", 3);
        d.getAge();
        d.getName();
        System.out.println(d.toString());

        Class clazz = d.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Field field = clazz.getField("ooo");

    }

}
