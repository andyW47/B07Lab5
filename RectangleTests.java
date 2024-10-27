package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTests {

	@Test
	void testIsSquare() {
		Point a = new Point(0,0);
		Point b = new Point(0,4);
		Point c = new Point(4,0);
		Point d = new Point(4,4);
		Rectangle r = new Rectangle(a, b, c, d);
		assertTrue(r.isSquare());
	}
	void testIsSquare2() {
		Point a = new Point(0,0);
		Point b = new Point(0,3);
		Point c = new Point(4,0);
		Point d = new Point(4,3);
		Rectangle r = new Rectangle(a, b, c, d);
		assertFalse(r.isSquare());
	}
	void testPerimeter() {
		Point a = new Point(0,0);
		Point b = new Point(0,3);
		Point c = new Point(4,0);
		Point d = new Point(4,3);
		Rectangle r = new Rectangle(a, b, c, d);
		assertEquals(r.perimeter(), 14);
	}
	void testIsParallel1() {
		Point a = new Point(0,0);
		Point b = new Point(0,4);
		Point c = new Point(4,0);
		Point d = new Point(4,4);
		Rectangle r = new Rectangle(a, b, c, d);
		assertTrue(r.isParallel());
	}
	void testIsParallel2() {
		Point a = new Point(0,0);
		Point b = new Point(0,3);
		Point c = new Point(5,0);
		Point d = new Point(4,3);
		Rectangle r = new Rectangle(a, b, c, d);
		assertFalse(r.isParallel());
	}

}
