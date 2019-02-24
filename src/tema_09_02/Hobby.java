package tema_09_02;
import java.util.*;

public class Hobby {
	private String name;
	private int frecventa;
	private List<Adress> adresslist = new ArrayList<>();


	public Hobby(String name, int frecventa, Adress adress) {
		super();
		this.name = name;
		this.frecventa = frecventa;
		this.adresslist.add(adress);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {	
		return this.getClass().getSimpleName() + " [name=" + name + "] [frecventa=" + frecventa + "] [adress=" + this.adresslist.toString() + "]";
	}	
}
