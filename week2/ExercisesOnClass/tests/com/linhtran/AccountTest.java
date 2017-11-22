package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    Account account1 = new Account("12345", "tranmanhlinh");
    Account account2 = new Account("54321", "Forest", 2000);
    @Test
    public void getId(){
        assertTrue("12345".equals(account1.getId()));
    }

    @Test
    public void getName(){
        assertTrue("tranmanhlinh".equals(account1.getName()));
    }

    @Test
    public void getBalance() {
        assertEquals(0, account1.getBalance());
        assertEquals(2000, account2.getBalance());
    }

    @Test
    public void credit() {
        assertEquals(3000, account2.credit(1000));
    }

    @Test
    public void debit(){
        assertEquals(1000, account2.debit(1000));
        assertEquals(1000, account2.debit(5000));
    }

    @Test
    public void transferTo() {
        int newBalance = account2.transferTo(account1, 500);
        newBalance = account2.transferTo(account1, 3000);
        assertEquals(1500, newBalance);
        assertEquals(500, account1.getBalance());
    }

    @Test
    public void testToString(){
        String expected = "Account[id=12345" +", name=tranmanhlinh" +", balance=0]";
        assertTrue(expected.equals(account1.toString()));
    }

}