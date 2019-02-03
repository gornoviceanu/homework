package quizz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	

	@Test
	void testCalculatePerimeterRectangle() {
		double a = 10;
		double b = 7;
		Rectangle dreptunghi = new Rectangle(a, b);
		double p = dreptunghi.calculatePerimeter();
		assertEquals (34, p);		
	}
	
	@Test
	void testCalculatePerimeterSquare() {
		double a = 10;
		Square patrat = new Square(a);
		double p = patrat.calculatePerimeter();
		assertEquals (40, p);
	}
	
	@Test
	void testCalculatePerimeterCircle() {
		double a = 3;
		Circle cerc = new Circle(a);
		double p = cerc.calculatePerimeter();
		assertEquals (18.84, p);
	}
	
	@Test
	void testCalculatePerimeterTriangle() {
		double a = 3;
		double b = 5;
		double c = 4;
		Triangle triunghi = new Triangle(a, b, c);
		double p = triunghi.calculatePerimeter();
		assertEquals (12, p);
	}
	
	@Test
	void testCalculateSurfaceRectangle() {
		double a = 10;
		double b = 5;
		Rectangle dreptunghi = new Rectangle(a, b);
		double s = dreptunghi.calculateSurface();
		assertEquals(50, s);
	}
	
	@Test
	void testCalculateSurfaceSquare() {
		double a = 10;
		Square patrat = new Square(a);
		double s = patrat.calculateSurface();
		assertEquals(100, s);
	}
	
	@Test
	void testCalculateSurfaceCircle() {
		double a = 10;
		Circle cerc = new Circle(a);
		double s = cerc.calculateSurface();
		assertEquals(314, s);
	}
	
	@Test
	void testCalculateSurfaceTriangle() {
		double a = 5;
		double b = 4;
		double c = 3;
		Triangle triunghi = new Triangle(a, b, c);
		double s = triunghi.calculateSurface();
		assertEquals(6, s);
	}

}
