package com.company;

public class UserStatic {
    private static String login, password;         //Внутренний класс


    public UserStatic(String login, String password){
        this.login=login;
        this.password=password;
    }

    public static class Query{
        public  void printToLog(){
            System.out.println("Пользователь с логином: "+ login+" и паролем: "+password+" отправил запрос!");
        }
    }

    public void createQuery(){
        UserStatic.Query query = new UserStatic.Query();
        query.printToLog();
    }

}
