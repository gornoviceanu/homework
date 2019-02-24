package tema_09_02;

public class Adress implements Interface{
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
