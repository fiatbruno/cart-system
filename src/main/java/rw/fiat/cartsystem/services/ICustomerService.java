package rw.fiat.cartsystem.services;

import rw.fiat.cartsystem.models.Customer;

import java.util.List;
import java.util.UUID;

public interface ICustomerService {
    Customer signup(Customer customer);
    boolean authenticate(String email, String password);

    List<Customer> getAllCustomers();

    Customer getCustomerById(UUID id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(UUID id, Customer customer);

    void deleteCustomer(UUID id);
    // Add other methods related to customer management
}
