package ir.maktab.hotelSysytemManagement.service;

import ir.maktab.hotelSysytemManagement.entity.BaseDomain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public interface BaseService<T extends BaseDomain<ID>, ID extends Serializable> {
    void save(T t) throws IOException;

    T fineById(ID id) throws FileNotFoundException;

}
