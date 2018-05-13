package com.juanpabloprado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.juanpabloprado.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Juan");
		customer.setLastName("Prado");
		customers.add(customer);
		
		return customers;
	}
}

