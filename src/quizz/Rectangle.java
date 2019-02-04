package quizz;
import java.util.*;

public class Rectangle implements Shapes {
	List<Rectangle> listR = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double latime;
	private double lungime;

	public Rectangle(double a, double b) {
		this.latime = a;
		this.lungime = b;		
	}
	
	public Rectangle() {
		
	}
	
	@Override
    public void addShape() {
		System.out.println("Introduceti latimea si lungimea. ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		Rectangle dreptunghi = new Rectangle (a, b);
		for (Rectangle r : listR) {
			if (r.latime == a || r.lungime == b) {
				dreptunghi = null;
				System.out.println("Similar shape is already on the list. ");
			} else { listR.add(dreptunghi);}				
		}     
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = this.latime * 2 + this.lungime * 2;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = this.latime * this.lungime;
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Rectangle r : listR) {
			totalP = totalP + r.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for(Rectangle r : listR) {
			totalS = totalS + r.calculateSurface();
		}
		return totalS;
	}
	
}
