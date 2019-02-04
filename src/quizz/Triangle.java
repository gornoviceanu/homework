package quizz;
import java.util.*;

public class Triangle implements Shapes {
	List<Triangle> listTr = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double latura1;
	private double latura2;
	private double latura3;

	public Triangle(double a, double b, double c) {
		this.latura1 = a;
		this.latura2 = b;
		this.latura3 = c;
	}
	
	public Triangle() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Introduceti dimensiunile laturilor: ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		Triangle triunghi = new Triangle (a, b, c);
		for (Triangle t : listTr) {
			if (t.latura1 == a || t.latura1 == b || t.latura1 == c || t.latura2 == a || t.latura2 == b || t.latura2 == c || t.latura3 == a || t.latura3 == b || t.latura3 ==c) {
				triunghi = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listTr.add(triunghi);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = this.latura1 + this.latura2 + this.latura3;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		//bad design, am zis ca o metoda ori modfica starea unui obiect, aici surface, ori returneaza ceva, in cazul asta tot surface, dar nu amandoua deodata
		double p = this.perimeter / 2;
		this.surface = Math.sqrt(p * (p - this.latura1) * (p - this.latura2) * (p - this.latura3));
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Triangle t : listTr) {
			totalP = totalP + t.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Triangle t : listTr) {
			totalS = totalS + t.calculateSurface();
		}
		return totalS;
	}
	
}
