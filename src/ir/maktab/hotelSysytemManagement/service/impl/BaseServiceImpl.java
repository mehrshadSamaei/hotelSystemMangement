package ir.maktab.hotelSysytemManagement.service.impl;

import ir.maktab.hotelSysytemManagement.entity.BaseDomain;
import ir.maktab.hotelSysytemManagement.repository.BaseRepository;
import ir.maktab.hotelSysytemManagement.service.BaseService;

import java.io.Serializable;

public abstract class BaseServiceImpl<T extends BaseDomain<ID>, ID extends Serializable,
        R extends BaseRepository<T, ID>> implements BaseService<T, ID> {

    protected R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    public BaseServiceImpl() {
    }
}

