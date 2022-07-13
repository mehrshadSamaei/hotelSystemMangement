package ir.maktab.hotelSysytemManagement.repository;

import ir.maktab.hotelSysytemManagement.entity.Customer;

import java.io.FileNotFoundException;

public interface CustomerRepository extends BaseRepository<Customer, Long> {
    boolean exist(Long id) throws FileNotFoundException;
}
