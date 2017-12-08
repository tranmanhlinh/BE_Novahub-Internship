package com.linhtran;

import static org.junit.Assert.*;

public class MyIntStackTest {
    MyIntStack myIntStack = new MyIntStack();
    @org.junit.Test
    public void pushPopPeek() {
        myIntStack.push(2);
        myIntStack.push(3);
        myIntStack.push(4);
        myIntStack.push(5);
        myIntStack.push(6);
        assertEquals(6, myIntStack.pop());
        assertEquals(5, myIntStack.peek());
        assertEquals(5, myIntStack.pop());
        assertEquals(4, myIntStack.pop());
        assertEquals(3, myIntStack.pop());
        assertEquals(2, myIntStack.pop());

    }

    @org.junit.Test
    public void isEmpty() {
        assertEquals(true, myIntStack.isEmpty());
        myIntStack.push(1);
        assertEquals(false, myIntStack.isEmpty());
    }

    @org.junit.Test
    public void isFull() {
        myIntStack.push(1);
        myIntStack.push(2);
        assertEquals(true, myIntStack.isFull());
        myIntStack.push(3);
        assertEquals(false, myIntStack.isFull());
    }

}