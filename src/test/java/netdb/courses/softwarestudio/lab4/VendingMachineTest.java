package netdb.courses.softwarestudio.lab4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	private VendingMachine vm;
	
	@Before
	public void setup(){
		vm = new VendingMachineImpl();
	}
	
	@After
	public void tearDown(){
		vm = null;
	}
	
	@Test
	public void itShouldReturnCorrectDrinkDescription(){
		Drink drink = new Drink("Cola");
		vm.addDrink(drink);
		Assert.assertEquals(drink.toString(), vm.getDrinksDescription()[0]);
	}
	
	@Test
	public void itShouldReturnCorrectDrinkCount() {
		Drink drink = new Drink("Cola");
		vm.addDrink(drink);
		drink = new Drink("Juice");
		vm.addDrink(drink);
		drink = new Drink("Cola");
		vm.addDrink(drink);
		
		Assert.assertEquals(3, vm.getDrinkCount());
	}
	
	@Test
	public void itShouldReturnCorrectDrinkFlavorCount() {
		Drink drink = new Drink("Cola");
		vm.addDrink(drink);
		drink = new Drink("Juice");
		vm.addDrink(drink);
		drink = new Drink("Cola");
		vm.addDrink(drink);
		
		Assert.assertEquals(2, vm.getDrinkFlavorCount());
	}
}