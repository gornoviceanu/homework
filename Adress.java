package collections;

public class Adress implements Interfata{
	private String name;

	public Adress(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [adress=" + name + "]";
	}
}
