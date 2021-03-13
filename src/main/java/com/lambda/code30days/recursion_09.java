package com.lambda.code30days;

public class recursion_09 {

    //f(f(f(x))))

    public static int Summation(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + Summation(n - 1);
        }
    }

    public static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }



    public static int Exponentitation(int n, int p) {
        if (p <= 0) {
            return 1;
        } else {
            return n*Exponentitation(n,p-1);
        }

    }


    public static void main(String[] args) {


        System.out.println(Summation(5));
        System.out.println(Factorial(5));
        System.out.println(Exponentitation(5,3));

    }
}
