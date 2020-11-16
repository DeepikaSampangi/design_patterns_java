package com.deepikasampangi;

public class Account {
    public float balance;
    private float private_balance;

    public void deposit(float amount){
        if (amount>0)
            this.private_balance += amount;
    }

    public void withraw(float amount){
        if (private_balance>0)
            private_balance -=amount;
    }

    public void setPrivate_balance(float private_balance){
        if (private_balance > 0)
            this.private_balance = private_balance;
    }

    public float getPrivate_balance(){
        return private_balance;
    }
}
