package ir.maktab.hotelSysytemManagement.service;

import ir.maktab.hotelSysytemManagement.entity.Customer;

public interface CustomerService extends BaseService<Customer, Long> {
    Customer addCustomer();

    boolean exists(Long id);

}
