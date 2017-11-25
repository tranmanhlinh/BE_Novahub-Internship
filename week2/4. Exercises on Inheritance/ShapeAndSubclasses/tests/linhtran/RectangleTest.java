package linhtran;

import com.linhtran.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle(3.5, 5.5);
    Rectangle rectangle3 = new Rectangle(13, 17, "black", true);
    @Test
    public void setGetLength() {
        assertEquals(1, rectangle1.getLength(), 0.0001);
        rectangle2.setLength(4.5);
        assertEquals(4.5, rectangle2.getLength(), 0.0001);
        try {
            rectangle3.setLength(0);
            assertEquals(3,2);
        } catch (Exception e){
            assertEquals(13, rectangle3.getLength(), 0.0001);
        }
    }

    @Test
    public void setGetWidth(){
        assertEquals(17, rectangle3.getWidth(), 0.0001);
        rectangle1.setWidth(4);
        assertEquals(4, rectangle1.getWidth(), 0.001);
        try {
            rectangle2.setWidth(0);
            assertEquals(3,2);
        } catch (Exception e){
            assertEquals(5.5, rectangle2.getWidth(), 0.0001);
        }
    }


    @Test
    public void getArea() {
        assertEquals(13*17, rectangle3.getArea(), 0.0001);
    }

    @Test
    public void getPerimeter() {
        double expected = (3.5 + 5.5) * 2;
        assertEquals(expected, rectangle2.getPerimeter(), 0.001);
    }

    @Test
    public void testToString() {
        String expected = "A rectangle with width=17.0 and length=13.0, "+
                "which is a subclass of A shape with color of black and filled.";
        assertEquals(expected, rectangle3.toString());
    }

}