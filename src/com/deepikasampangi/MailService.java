package com.deepikasampangi;

public class MailService {
    public void sendEmail(){
        connect(1);
        authenticate();
//        send email
        disconnect();
    }
// making the below methods private as they dont have to be used outside of this class - Abstracting them
    private void connect(int timeout){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
