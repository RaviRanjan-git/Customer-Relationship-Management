package ravi.service;
import java.util.List;

import ravi.model.Customer;

public interface ICustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(Integer customerId);
	public void deleteCustomer(Integer customerId);
}
