package ir.maktab.hotelSysytemManagement.service.impl;

import ir.maktab.hotelSysytemManagement.entity.Customer;
import ir.maktab.hotelSysytemManagement.repository.CustomerRepository;
import ir.maktab.hotelSysytemManagement.service.CustomerService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CustomerServiceImpl extends BaseServiceImpl<Customer, Long, CustomerRepository> implements CustomerService {
    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }

//    ApplicationContext context;

    @Override
    public void save(Customer customer) {
        try {
            repository.save(customer);
        } catch (IOException e) {
            System.out.println("not save customer!");
        }
    }

    @Override
    public Customer fineById(Long aLong) throws FileNotFoundException {

        return repository.findById(aLong);
    }

    @Override
    public Customer addCustomer() {
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);
        try {
            customer.setId(repository.getSimpleId());
        } catch (FileNotFoundException e) {
            System.out.println("not found id!!!");
        }
        System.out.println("enter first name:");
        String fName = sc.next();
        customer.setfName(fName);
        System.out.println("enter last name:");
        String lName = sc.next();
        customer.setlName(lName);
        return customer;
    }

    @Override
    public boolean exists(Long id) {
        try {
            return repository.exist(id);
        } catch (FileNotFoundException e) {
            System.out.println("not found id");
            return false;
        }
    }
}
