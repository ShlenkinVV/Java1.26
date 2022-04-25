package com.company;

public class Matrix<T> {
    private T[][] array;

    Matrix(T[][] array){
        this.array=array.clone();
    }

    public void print(){
        for (int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(" " + array[i][j] + " ");
            System.out.println();
        }
    }
}
