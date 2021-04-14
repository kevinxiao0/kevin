package com.lambda.code30days;

public abstract class abstraction_animal_13 {
    // refer to 12 animal
    // public int age;
    private int age;

    public abstraction_animal_13(int age) {
        this.age = age;
        System.out.println("An animal has been creatd!");
    }

    //absteact
    public abstract void eat();

    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        abstract_dog_13 d = new abstract_dog_13();
        abstract_cat_13 c = new abstract_cat_13();

        d.eat();
        c.eat();

        d.sleep();
        c.sleep();

        //Casting
        Object dog = new abstract_dog_13();
        abstract_dog_13 realDog = (abstract_dog_13) dog;
        realDog.ruff();
        ((abstract_dog_13) dog).ruff();

        Object str = "str";

        String realStr = (String) str;
        realStr.toUpperCase();




    }

}
