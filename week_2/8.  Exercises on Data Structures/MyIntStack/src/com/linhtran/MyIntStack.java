package com.linhtran;

public class MyIntStack {
    private int[] contents;
    private int tos;  // Top of the stack

    // constructors
    public MyIntStack() {
        contents = new int[2];
        tos = -1;
    }

    //If the stack is full, resize stack's size twice.
    public void push(int element) {
        if (tos == contents.length - 1) {
            resize(contents.length * 2);
        }
        contents[++tos] = element;
    }

    public int pop() {
        if (tos < contents.length/4) {
            resize(contents.length / 2);
        }
        return contents[tos--];
    }

    public int peek() {
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }

    //Resize the capacity of contents to 'newLength'
    private void resize(int newLength) {
        int[] newContents = new int[newLength];
        for(int i=0; i <= tos; i++) {
            newContents[i] = contents[i];
        }
        contents = newContents;
    }
}