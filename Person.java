package collections;
import java.util.*;

public class Person {
	private String name;
	private List<Hobby> hobbylist = new ArrayList<>();

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
					
    public String toString() {
    	return getClass().getSimpleName() + "[name=" + name + "] " + this.hobbylist + "]" ;
    }
    
    public String hobbiesToString() {
    	return getClass().getSimpleName() + "[hobbies=" + this.hobbylist + "]";
    }

	public static void main (String[] args) {
		
		Hobby h = new Hobby("fotbal", 3, new Adress("stefancelmare"));
		Hobby t = new Hobby("baschet", 2, new Adress("ghencea"));
		Hobby c = new Hobby("citit", 5, new Adress("universitate"));
		Hobby o = new Hobby("filme", 1, new Adress("cinema"));
		Person p1 = new Person("Cristi");
		Person p2 = new Person("Andreea");
		Person p3 = new Person("Marina");
		Person p4 = new Person("Elena");
		Person p5 = new Person("Andrei");

		p1.hobbylist.add(c);
		p1.hobbylist.add(h);
		p2.hobbylist.add(t);
		p2.hobbylist.add(c);
		p3.hobbylist.add(h);
		p3.hobbylist.add(o);
		p4.hobbylist.add(c);
		p4.hobbylist.add(o);
		p5.hobbylist.add(h);
		p5.hobbylist.add(t);	
		
		//System.out.println(p.toString());
		//System.out.println(p1.toString());
		//System.out.println(p2.toString());
		//System.out.println(p3.toString());
		//System.out.println(p4.toString());
		
		Map<Person, List<Hobby>> map = new HashMap<>();
		List<Person> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		map.put(p5, p5.hobbylist);
		map.put(p1, p1.hobbylist);
		map.put(p2, p2.hobbylist);
		map.put(p3, p3.hobbylist);
		map.put(p4, p4.hobbylist);
		
		map.keySet().forEach(name -> System.out.println(name));

		
		System.out.println("Introduceti numele.");
		Scanner reader = new Scanner(System.in);
		String numele = reader.next();
		String z = "";
		reader.close();
		for (Person p : list) {
			z = p.name;
			if (z.equals(numele)) {
				System.out.println(p.hobbiesToString());
			}
		}
	}
}
