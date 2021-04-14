package com.lambda.code30days;

public class NonEmptyBST_22<D extends Comparable> implements Tree_22{

    D data;
    Tree_22<D> left;
    Tree_22<D> right;

    public NonEmptyBST_22 (D element){
        data = element;
        left = new EmptyBST_22<D>();
        right = new EmptyBST_22<D>();
    }



    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1+ left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(Comparable element) {
        return false;
    }

    @Override
    public NonEmptyBST_22 add(Comparable element) {
        return null;
    }
}
