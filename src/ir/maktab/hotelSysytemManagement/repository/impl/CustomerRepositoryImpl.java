package ir.maktab.hotelSysytemManagement.repository.impl;

import ir.maktab.hotelSysytemManagement.entity.Customer;
import ir.maktab.hotelSysytemManagement.entity.Option;
import ir.maktab.hotelSysytemManagement.repository.CustomerRepository;
import ir.maktab.hotelSysytemManagement.util.ApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer, Long> implements CustomerRepository {

    ApplicationContext context;


    @Override
    public void save(Customer customer) throws IOException {
        if (file == null) {
            file = new File(filePaThAddress());
        }
        if (writer == null) {
            writer = new FileWriter(file, true);
        }
        if (formatter == null) {
            formatter = new Formatter(writer);
        }
        formatter.format("%s %s %s", getSimpleId(), customer.getfName(),
                customer.getlName() + "\n");
        formatter.close();
    }

    @Override
    public Customer findById(Long id) throws FileNotFoundException {
        Customer customer;
        if (file == null) {
            file = new File(filePaThAddress());
        }
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            customer = new Customer(scanner.nextLong(), scanner.nextLine(), scanner.nextLine());
            if (Objects.equals(customer.getId(), id)) {
                return customer;
            }
        }
        System.out.println("Costumer not found!!!");
        return null;
    }

    @Override
    public List<Option> findAll() throws FileNotFoundException {
        return null;
    }

    @Override
    public String filePaThAddress() {
        if (path == null) {
            path = "C:\\Users\\mehrs\\Desktop\\Mehrshad_Samaei_HW10\\Project\\src\\ir\\maktab" +
                    "\\hotelSysytemManagement\\App\\customer.txt";
        }
        return this.path;
    }


    @Override
    public boolean exist(Long id) throws FileNotFoundException {
        Customer customer;
        if (file == null) {
            file = new File(filePaThAddress());
        }
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            customer = new Customer(scanner.nextLong(), scanner.next(), scanner.next());
            if (customer.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
