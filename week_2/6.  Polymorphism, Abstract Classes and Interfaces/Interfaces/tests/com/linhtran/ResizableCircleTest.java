package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResizableCircleTest {
    ResizableCircle resizableCircle = new ResizableCircle(100.0);
    ResizableCircle resizableCircle2 = new ResizableCircle();

    @Test
    public void resize() {
        resizableCircle.resize(88);
        resizableCircle2.resize(300);
        assertEquals(Math.PI*88*88, resizableCircle.getArea(), 0.0001);
        assertEquals(Math.PI*3*2, resizableCircle2.getPerimeter(), 0.0001);
    }
}