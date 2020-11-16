package com.deepikasampangi;

import com.deepikasampangi.memento.Editor;
import com.deepikasampangi.memento.History;

public class Main {

    public static void main(String[] args) {
        User user = new User("Deepika", 24);
        user.name = "Deepika";
        System.out.println(user.name);
        user.sayHello();
//  Interface Example
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

//    Encapsulation Example
        account();

//        abstraction example
        mail();

//        Inheritance Example
        buttons();

//        polymorphisim exmaple
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());

//        Memento Pattern
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());


        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }

//  Interface Example
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2020();
    }

//    Encapsulation Example
    public static void account(){
        Account account = new Account();
        account.balance = -1;
//        account.private_balance = -1; cant access as its private
        account.setPrivate_balance(-1);

        account.deposit(10);
        account.withraw(5);
        System.out.println("Account balance is "+account.getPrivate_balance());
    }

// Abstraction example
    public static void mail(){
        MailService mailService = new MailService();
        mailService.sendEmail();
    }


// Inheritance example
    public static void buttons(){
//        Textbox
//        Button
//        CheckBox

//        enable()
//        focus()
//        setPosition()
        TextBox textBox = new TextBox();
        textBox.enable();
    }

//    Polymorphism
    public static void drawUIControl(UIControl control){
        control.draw();
    }

}