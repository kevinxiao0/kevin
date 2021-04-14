package com.lambda.code30days;

public interface Tree_22<D extends Comparable> {

    public boolean isEmpty();
    public int cardinality();
    public boolean member(D element);
    public NonEmptyBST_22<D> add(D element);
}
