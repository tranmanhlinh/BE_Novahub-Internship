package com.linhtran;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle() {
        super();
    }
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.radius *= percent/100.0;
    }
}
