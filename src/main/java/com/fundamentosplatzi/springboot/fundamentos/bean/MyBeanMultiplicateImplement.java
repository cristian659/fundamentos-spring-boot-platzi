package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanMultiplicateImplement implements MyBeanMultiplicate{

    private MyOperationMultiplicate myOperationMultiplicate;

    public MyBeanMultiplicateImplement(MyOperationMultiplicate myOperationMultiplicate) {
        this.myOperationMultiplicate = myOperationMultiplicate;
    }

    @Override
    public void printWithMultiplicate() {
        int numero = 5;
        System.out.println(myOperationMultiplicate.multi(numero));
        System.out.println("este es un bean inyectado por mi donde se multiplica");


    }
}
