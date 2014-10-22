package netdb.courses.softwarestudio.lab4;

public class Drink {
	
	private static int nextId = 1;
	
	private String name;
	private int id;
	
	public Drink(String name) {
		this.name = name;
		this.id = nextId++;
	}

	@Override
	public String toString() {
		return name + ", " + id;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Drink))
			return false;

		Drink drink = (Drink) object;
		return this.name.equals(drink.name);
	}
}