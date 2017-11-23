package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class InvoiceTest {
    Customer customer = new Customer(123456, "tran", 10);
    Invoice invoice = new Invoice(120188, customer, 95.5);
    @Test
    public void getId(){
        assertEquals(120188, invoice.getId() );
    }

    @Test
    public void setGetCustomer(){
        assertTrue(customer.equals(invoice.getCustomer()));
        Customer customer2 = new Customer(23456, "linh", 12);
        invoice.setCustomer(customer2);
        assertTrue(customer2.equals(invoice.getCustomer()));
    }


    @Test
    public void getAmount(){
        assertEquals(95.5, invoice.getAmount(), 0.0001);
        invoice.setAmount(150);
        assertEquals(150, invoice.getAmount(), 0.0001);
    }


    @Test
    public void getCustomerName(){
        assertTrue("tran".equals(invoice.getCustomerName()));
    }

    @Test
    public void getAmountAfterDiscount(){
        assertEquals(85.95, invoice.getAmountAfterDiscount(), 0.00001);
    }

}