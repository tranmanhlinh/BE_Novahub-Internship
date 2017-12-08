package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    Customer customer = new Customer(12345, "linh", 'm');
    Account account1 = new Account(123, customer);
    Account account2 = new Account(456, customer, 123.45);

    @Test
    public void getId(){
        assertEquals(123, account1.getId());
        assertEquals(456, account2.getId());
    }

    @Test
    public void getCustomer(){
        assertEquals(customer, account1.getCustomer());
        assertEquals(customer, account2.getCustomer());
    }

    @Test
    public void setGetBalance(){
        assertEquals(123.45, account2.getBalance(), 0.0001);
        assertEquals(0, account1.getBalance(), 0.00001);
        account1.setBalance(345.67);
        assertEquals(345.67, account1.getBalance(), 0.00001);
    }

    @Test
    public void testToString(){
        String expected = "linh(12345) balance=$123.45";
        assertTrue(expected.equals(account2.toString()));
    }

    @Test
    public void getCustomerName(){
        assertTrue("linh".equals(account1.getCustomerName()));
    }

    @Test
    public void deposit(){
        Account newAccount = account1.deposit(100);
        newAccount = account1.deposit(-200);
        assertEquals(100, newAccount.getBalance(), 0.0001);
        assertEquals(100, account1.getBalance(), 0.0001);

    }

    @Test
    public void withdraw(){
        Account newAccount = account2.withdraw(100);
        newAccount = account2.withdraw(100);
        assertEquals(23.45, newAccount.getBalance(), 0.00001);
        assertEquals(23.45, account2.getBalance(), 0.00001);
    }

}