package ir.maktab.hotelSysytemManagement.repository;

import ir.maktab.hotelSysytemManagement.entity.BaseDomain;
import ir.maktab.hotelSysytemManagement.entity.Option;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface BaseRepository<T extends BaseDomain<ID>, ID extends Serializable> {
    void save(T t) throws IOException;

    T findById(ID id) throws FileNotFoundException;

    List<Option> findAll() throws FileNotFoundException;

    String filePaThAddress() throws FileNotFoundException;

    long getSimpleId() throws FileNotFoundException;


}
