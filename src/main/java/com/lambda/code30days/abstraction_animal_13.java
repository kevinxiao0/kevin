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
        abstract_dog_12 d = new abstract_dog_12();
        abstract_cat_12 c = new abstract_cat_12();

        d.eat();
        c.eat();

        d.sleep();
        c.sleep();

    }

}
