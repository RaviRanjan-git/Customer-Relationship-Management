package ravi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ravi.dao.ICustomerDao;
import ravi.model.Customer;

import java.util.List;


@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao repo;

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		repo.save(customer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		Optional<Customer> optional = repo.findById(customerId);
		return optional.get();
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		repo.deleteById(customerId);
	}
}
