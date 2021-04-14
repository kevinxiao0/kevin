package com.lambda.code30days;

public class EmptyBST_22<D extends Comparable> implements Tree_22 {

    public EmptyBST_22(){

    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(Comparable element) {
        return false;
    }

    @Override
    public NonEmptyBST_22 add(Comparable element) {
        return new NonEmptyBST_22<D>((D) element);
    }
}
