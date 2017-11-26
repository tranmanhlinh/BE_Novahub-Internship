package com.linhtran;

public class MyIntStack {
    private int[] contents;
    private int tos;  // Top of the stack

    // constructors
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public void push(int element) {
        contents[++tos] = element;
    }

    public int pop() {
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

    private void resize(int[] contents, int factor) {
        int[] newContents = new int[contents.length*factor];
        for(int i=0; i < contents.length; i++) {
            newContents[i] = contents[i];
            
        }
    }
}