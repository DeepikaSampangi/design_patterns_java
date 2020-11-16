package com.deepikasampangi;

public class Main {

    public static void main(String[] args) {
        User user = new User("Deepika", 24);
        user.name = "Deepika";
        System.out.println(user.name);
        user.sayHello();

        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2020();
    }
}