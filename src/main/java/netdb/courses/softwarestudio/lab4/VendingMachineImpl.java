package netdb.courses.softwarestudio.lab4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
	
	private List<Drink> drinks = new ArrayList<Drink>();
	private int flavorCount = 0;
	
	@Override
	public void addDrink(Drink drink) {
		// check flavor
		// note that the list will use equals() to check quality
		if (!drinks.contains(drink))
			flavorCount++;
		
		drinks.add(drink);
	}

	@Override
	public int getDrinkCount() {
		return drinks.size();
	}

	@Override
	public int getDrinkFlavorCount() {
		return flavorCount;
	}

	@Override
	public String[] getDrinksDescription() {
		String[] descriptions = new String[drinks.size()];
		for (int i = 0; i < drinks.size(); i++)
			descriptions[i] = drinks.get(i).toString();
		return descriptions;
	}

}
