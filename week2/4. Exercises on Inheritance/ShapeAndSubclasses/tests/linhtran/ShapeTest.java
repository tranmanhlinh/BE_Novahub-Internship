package linhtran;

import com.linhtran.Shape;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ShapeTest {
    Shape shape1 = new Shape();
    Shape shape2 = new Shape("yellow", false);

    @Test
    public void setGetColor() {
        assertEquals("green", shape1.getColor());
        assertEquals("yellow", shape2.getColor());
        shape1.setColor("red");
        assertEquals("red", shape1.getColor());
    }


    @Test
    public void setGetIsFilled() {
        assertEquals(true, shape1.isFilled());
        assertEquals(false, shape2.isFilled());
        shape2.setFilled(true);
        assertEquals(true, shape2.isFilled());
    }


    @Test
    public void testToString() {
        String expected = "A shape with color of yellow and not filled.";
        assertEquals(expected, shape2.toString());
        expected = "A shape with color of green and filled.";
        assertEquals(expected, shape1.toString());

    }

}