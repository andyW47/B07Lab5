import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCircumference() {
        Circle circle = new Circle(new Point(0, 0), 5);
        double expectedCircumference = 2 * Math.PI * 5;
        assertEquals(expectedCircumference, circle.circumference(), 0.001);
    }

    @Test
    void testArea() {
        Circle circle = new Circle(new Point(0, 0), 5);
        double expectedArea = Math.PI * Math.pow(5, 2);
        assertEquals(expectedArea, circle.calculateArea(), 0.001);
    }

    @Test
    void testZeroRadiusCircumference() {
        Circle circle = new Circle(new Point(0, 0), 0);
        double expectedCircumference = 0;
        assertEquals(expectedCircumference, circle.circumference(), 0.001);
    }

    @Test
    void testZeroRadiusArea() {
        Circle circle = new Circle(new Point(0, 0), 0);
        double expectedArea = 0;
        assertEquals(expectedArea, circle.calculateArea(), 0.001);
    }

}
