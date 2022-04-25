package com.company;

public class Calc {

    public static <T extends Number, V extends Number> void sum(T a, V b){
        double res;
        res = a.doubleValue() + b.doubleValue();
        System.out.println(a + " + " + b + " = " + res);
    }

    public static <T extends Number, V extends Number> void multiply(T a, V b){
        double res;
        res= a.doubleValue()*b.doubleValue();
        System.out.println(a + " * " + b + " = " + res);
    }

    public static <T extends Number, V extends Number> void divide(T a, V b){
        double res;
        res= a.doubleValue()/b.doubleValue();
        System.out.println(a + " / " + b + " = " + res);
    }

    public static <T extends Number, V extends Number> void subtraction(T a, V b){
        double res;
        res= a.doubleValue()-b.doubleValue();
      System.out.println(a + " - " + b + " = " + res);
    }

}
