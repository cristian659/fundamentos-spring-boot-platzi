package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyOperationMultiplicateImplement implements  MyOperationMultiplicate{
    @Override
    public int multi(int numero) {
        return numero*5;
    }
}
