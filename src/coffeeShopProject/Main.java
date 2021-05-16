package coffeeShopProject;


import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import adapters.MernisServiceAdapter;


public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		
		customerManager.save(new Customer(1, "Beste", "Töre", 1998, "00000000000"));
		
		

	}

}
