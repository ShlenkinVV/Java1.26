package com.company;

public class UserAnon {

    private String login, password;         //Анонимный класс


    public UserAnon(String login, String password){
        this.login=login;
        this.password=password;
    }

    Printable printToLog = new Printable() {
        @Override
        public void print() {
            System.out.println("Пользователь с логином: "+login+" и паролем: "+password+" отправил запрос!");
        }
    };

}
