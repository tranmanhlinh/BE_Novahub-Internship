package linhtran;

import com.linhtran.Circle;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CircleTest {
    Circle circle1 = new Circle();
    Circle circle2 = new Circle(2.0);
    Circle circle3 = new Circle(3, "gray", false);
    @Test
    public void setGetRadius() {
        assertEquals(1.0, circle1.getRadius(), 0.0001);
        assertEquals(2.0, circle2.getRadius(), 0.0001);
        assertEquals(3.0, circle3.getRadius(), 0.0001);
        circle1.setRadius(6);
        assertEquals(6, circle1.getRadius(), 0.0001);
        try {
            circle1.setRadius(-7);
            assertEquals(5, circle1.getRadius(), 0.0001);
        } catch (Exception e){
            assertEquals(6, circle1.getRadius(), 0.0001);
        }
    }


    @Test
    public void getArea() {
        double expected = 3*3*Math.PI;
        assertEquals(expected, circle3.getArea(), 0.0001);
    }

    @Test
    public void getPerimeter() {
        double expected = 6*Math.PI;
        assertEquals(expected, circle3.getPerimeter(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "A circle with radius=3.0, " +
                "which is a subclass of " +
                "A shape with color of gray and not filled.";
        assertEquals(expected, circle3.toString());
    }

}