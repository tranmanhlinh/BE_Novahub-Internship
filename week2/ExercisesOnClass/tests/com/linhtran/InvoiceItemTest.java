package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class InvoiceItemTest {
    InvoiceItem invoiceItem = new InvoiceItem("a12345", "For food", 10, 2.5);

    @Test
    public void getId() {
        assertTrue("a12345".equals(invoiceItem.getId()));
    }

    @Test
    public void getDesc() {
        assertTrue("For food".equals(invoiceItem.getDesc()));
    }

    @Test
    public void getQty(){
        assertEquals(10, invoiceItem.getQty());
    }

    @Test
    public void getSetUnitPrice(){
        assertEquals(2.5, invoiceItem.getUnitPrice(), 0.001);
        invoiceItem.setUnitPrice(4.3);
        assertEquals(4.3, invoiceItem.getUnitPrice(), 0.001);
    }

    @Test
    public void getTotal() {
        assertEquals(25, invoiceItem.getTotal(), 0.001);
    }

    @Test
    public void testToString(){
        assertTrue("InvoiceItem [id = a12345, desc = For food, unitPrice = 2.5]".equals(invoiceItem.toString()));
    }

}