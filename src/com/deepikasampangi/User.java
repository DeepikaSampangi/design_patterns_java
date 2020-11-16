package com.deepikasampangi;

public class User {
    //    fields (attributes)
    public String name;

    public User(String name, int age){
        this.name = name;

    }
    //    Methods
    public void sayHello(){
        System.out.println("- Hey There this is "+name);
    }

}