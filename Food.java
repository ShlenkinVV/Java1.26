package com.company;

public class Food {

    public void prepare(Cookable c, String str) {
        c.cook(str);
    }

    Cookable cookable = new Cookable() {
        @Override
        public void cook(String str) {
            System.out.println("Готовится блюдо:  "+ str);
        }
    };
}
