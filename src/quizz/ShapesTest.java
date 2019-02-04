package quizz;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapesTest {

	@Test //metodele de test trebuie sa fie intotdeauna publice
	public void testCalculatePerimeterRectangle() {
		double a = 10;
		double b = 7;
		Rectangle dreptunghi = new Rectangle(a, b);
		double p = dreptunghi.calculatePerimeter();
		assertEquals(34, p, 0.01);		
	}
	
	@Test
	public void testCalculatePerimeterSquare() {
		double a = 10;
		Square patrat = new Square(a);
		double p = patrat.calculatePerimeter();
		assertEquals (40, p, 0.01);
	}
	
	@Test
	public void testCalculatePerimeterCircle() {
		double a = 3;
		Circle cerc = new Circle(a);
		double p = cerc.calculatePerimeter();
		assertEquals (18.84, p, 0.01);
	}
	
	@Test
	public void testCalculatePerimeterTriangle() {
		double a = 3;
		double b = 5;
		double c = 4;
		Triangle triunghi = new Triangle(a, b, c);
		double p = triunghi.calculatePerimeter();
		assertEquals (12, p, 0.01);
	}
	
	@Test
	public void testCalculateSurfaceRectangle() {
		double a = 10;
		double b = 5;
		Rectangle dreptunghi = new Rectangle(a, b);
		double s = dreptunghi.calculateSurface();
		assertEquals(50, s, 0.01);
	}
	
	@Test
	public void testCalculateSurfaceSquare() {
		double a = 10;
		Square patrat = new Square(a);
		double s = patrat.calculateSurface();
		assertEquals(100, s, 0.01);
	}
	
	@Test
	public void testCalculateSurfaceCircle() {
		double a = 10;
		Circle cerc = new Circle(a);
		double s = cerc.calculateSurface();
		assertEquals(314, s, 0.01);
	}
	
	@Test
	public void testCalculateSurfaceTriangle() {
		double a = 5;
		double b = 4;
		double c = 3;
		Triangle triunghi = new Triangle(a, b, c);
		double s = triunghi.calculateSurface();
		assertEquals(6, s, 0.01);
	}

}
