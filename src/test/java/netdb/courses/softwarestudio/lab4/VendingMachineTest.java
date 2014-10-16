package netdb.courses.softwarestudio.lab4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	private VendingMachine vm;
	
	@Before
	public void setup(){
		// TODO new your Vending Machine and assign it to vm
	}
	
	@After
	public void tearDown(){
		vm = null;
	}
	
	@Test
	public void itShouldReturnCorrectDrinkDescription(){
		Drink drink = new Drink("Cola");
		vm.addDrink(drink);
		Assert.assertEquals("Cola", vm.getDrinksDescription()[0]);
	}
	
	// TODO Implement other test cases
}