package com.company;

import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {        //Первое задание

        User usr1 = new User("Vova", "1234");
        usr1.createQuery();

        User.Query query = usr1.new Query();
        query.printToLog();

        User.Query query1 = new User("Denis", "0000").new Query();
        query1.printToLog();


        UserLocal userLocal = new UserLocal("Igor", "777");
        userLocal.createQuery();


        UserStatic userStatic = new UserStatic("Ivan", "8800");
        userStatic.createQuery();


        UserAnon userAnon = new UserAnon("Oleg", "007");
        userAnon.printToLog.print();

        Food food = new Food();                         //пятое задание
        food.prepare(food.cookable, "Макароны");

        Generics<String, Integer, Double> generics = new Generics<String, Integer, Double>("Привет", 5, 15.00);
        generics.print();                               // шестое задание


        String [][] arr1 = {
                {"a", "b"},
                {"c", "d"}
        };

        Integer [][] arr2 = {
                { 50, 36},
                {20, 30 }
        };

        Matrix<String> matrix1 = new Matrix<>(arr1);
        Matrix<Integer> matrix2 = new Matrix<>(arr2);

        matrix1.print();
        matrix2.print();

        Integer []arr = {52, 36, 1, 250};                   //восьмое задание
        MinMax<Integer> minMax = new MinMax<>(arr);
        Integer max = minMax.getMax();
        Integer min = minMax.getMin();
        System.out.println("Максимальный элемент: "+max);
        System.out.println("Минимальный элемент: "+min);


        System.out.println("Калькулятор");
       Calc.sum(5,20.3);                            //девятое задание
       Calc.multiply(3.3, 15);


    }


}




