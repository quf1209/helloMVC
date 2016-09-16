package service;
import java.util.HashMap;
//map을 만들어서 id를 저장하고 해당되는 내용을 리턴해준다.
import java.util.Map;
import model.Customer;

public class CustomerService {
	
	private Map<String, Customer> customers;

	public CustomerService() {
		customers = new HashMap<String, Customer>();
		addCustomer(new Customer("id001", "Alice", "alice.hansung.ac.kr"));
		addCustomer(new Customer("id002", "Bob", "Bob.hansung.ac.kr"));
		addCustomer(new Customer("id003", "Charlie", "Charlie.hansung.ac.kr"));
		addCustomer(new Customer("id004", "David", "David.hansung.ac.kr"));
		addCustomer(new Customer("id005", "Trudy", "Trudy.hansung.ac.kr"));
		
		
	}
	
	public void addCustomer(Customer customer)
	{
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id)
	{
		if(id!=null)
			return(customers.get(id.toLowerCase()));
		else
			return null;
	}

}
