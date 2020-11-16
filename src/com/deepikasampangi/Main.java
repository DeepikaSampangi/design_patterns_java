package com.deepikasampangi;

public class Main {

    public static void main(String[] args) {
        User user = new User("Deepika");
        user.name = "Deepika";
        System.out.println(user.name);
        user.sayHello();
    }
}