package com.deepikasampangi;

public class Main {

    public static void main(String[] args) {
        User user = new User("Deepika", 24);
        user.name = "Deepika";
        System.out.println(user.name);
        user.sayHello();

        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());
        account();
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2020();
    }

    public static void account(){
        Account account = new Account();
        account.balance = -1;
//        account.private_balance = -1; cant access as its private
        account.setPrivate_balance(-1);

        account.deposit(10);
        account.withraw(5);
        System.out.println("Account balance is "+account.getPrivate_balance());
    }
}