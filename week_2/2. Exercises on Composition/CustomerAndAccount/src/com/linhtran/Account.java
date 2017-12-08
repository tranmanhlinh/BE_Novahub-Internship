package com.linhtran;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString()+ " " +
                "balance=$" + balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amout){
        if(amout > 0){
            this.balance += amout;
        } else {
            System.out.println("The amount must ve larger than 0.");
        }
        return this;
    }

    public Account withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Amount withdrawn exceeds the current balance.");
        } else {
            this.balance -= amount;
        }

        return this;
    }


}
