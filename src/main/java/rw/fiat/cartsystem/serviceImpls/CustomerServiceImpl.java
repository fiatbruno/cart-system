package rw.fiat.cartsystem.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.fiat.cartsystem.exceptions.ResourceNotFoundException;
import rw.fiat.cartsystem.models.Customer;
import rw.fiat.cartsystem.repositories.ICustomerRepository;
import rw.fiat.cartsystem.services.ICustomerService;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer signup(Customer customer) {
        // Implement the logic to sign up a customer
        // Example:
        return customerRepository.save(customer);
    }

    @Override
    public boolean authenticate(String email, String password) {
        // Implement the logic to authenticate a customer
        // Example:
        Customer customer = customerRepository.findByEmail(email).orElse(null);
        return customer != null && customer.getPassword().equals(password);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id.toString()));
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(UUID id, Customer customer) {
        Customer existingCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id.toString()));

        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhoneNumber(customer.getPhoneNumber());
        existingCustomer.setPassword(customer.getPassword());

        return customerRepository.save(existingCustomer);
    }

    @Override
    public void deleteCustomer(UUID id) {
        customerRepository.deleteById(id);
    }

    // Add other methods related to customer management
}

