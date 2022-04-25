package com.company;

public class MinMax <T extends Comparable<T>> {
    private T[] array;
    private T max;
    private T min;

    public MinMax(T[] array) {
        this.array = array.clone();
    }

    public T getMax(){
        max=array[0];
        for (int i=0; i<array.length; i++)
            if (array[i].compareTo(max)>0)
                max=array[i];
        return max;
    }

    public T getMin(){
        min=array[0];
        for (int i=0; i<array.length; i++)
            if (array[i].compareTo(min)<0)
                min=array[i];
        return min;
    }

}
