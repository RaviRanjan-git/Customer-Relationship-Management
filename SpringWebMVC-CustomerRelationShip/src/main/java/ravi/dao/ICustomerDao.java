package ravi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ravi.model.Customer;
//@Repository
public interface ICustomerDao extends CrudRepository<Customer, Integer> {

}
