package quizz;
import java.util.*;

public class Square implements Shapes {
	List<Square> listSq = new ArrayList<>();
	private double perimeter;
	private double surface;
	private double latura;

	public Square(double a) {
		this.latura = a;		
	}
	
	public Square() {
		
	}
	
	@Override
	public void addShape() {
		System.out.println("Introduceti latura: ");
		Scanner reader = new Scanner (System.in);
		double a = reader.nextDouble();
		Square patrat = new Square(a);
		for (Square s : listSq) {
			if (s.latura == a) {
				patrat = null;
				System.out.println("Similar shape is already on the list. ");
			} else {listSq.add(patrat);}
		}
	}
	
	@Override
	public double calculatePerimeter() {
		this.perimeter = 4 * this.latura;
		return this.perimeter;
	}
	
	@Override
	public double calculateSurface() {
		this.surface = this.latura * this.latura;
		return this.surface;
	}
	
	@Override
	public double totalPerimeter() {
		double totalP = 0;
		for (Square s : listSq) {
			totalP = totalP + s.calculatePerimeter();
		}
		return totalP;
	}
	
	@Override
	public double totalSurface() {
		double totalS = 0;
		for (Square s : listSq) {
			totalS = totalS + s.calculateSurface();
		}
		return totalS;
	}
	
}
