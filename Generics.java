package com.company;

import java.io.Serializable;

public class Generics <T extends java.lang.Comparable<String>, V extends Serializable, K extends Number>{
    private T t;
    private V v;
    private K k;

    public Generics(T t, V v, K k){
        this.t=t;
        this.v=v;
        this.k=k;
    }

    public T getT() {  return t;   }

    public V getV() {  return v;   }

    public K getK() {  return k;   }

    public void print(){
        System.out.println(" Тип T: " + t.getClass().getName());
        System.out.println(" Тип V: " + v.getClass().getName());
        System.out.println(" Тип K: " + k.getClass().getName());
    }

}

