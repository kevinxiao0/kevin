package com.lambda.code30days;

public class inheritance_animal_12 {

//    public int age;
    private int age;

    public inheritance_animal_12 (int age){
        this.age=age;
        System.out.println("An animal has been creatd!");
    }

    public void eat(){
        System.out.println("An animal is eating");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main (String [] args){
        inheritance_animal_12 a = new inheritance_animal_12(5);
        inheritance_dog_12 d = new inheritance_dog_12();
        inheritance_cat_12 c = new inheritance_cat_12();

        d.ruff();
        c.meow();

        System.out.println(d.getAge());

        a.setAge(20);
        System.out.println(a.getAge());

        a.eat();
        d.eat();
        c.eat();

        d.run();
        c.prance();

        inheritance_animal_12 o = new inheritance_dog_12();

        //only super to child
//        inheritance_dog_12 od = new inheritance_animal_12(5);


    }

}
