package com.company;

public class User {
    String login;
    String password;
    String email;
    int age;

//    public User(){
//        login = "konan";
//        password = "maslo";
//        email = "konan@wp.pl";
//        age = 24;
//    }

    public User(String login, String password, String email, int age){
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

}
