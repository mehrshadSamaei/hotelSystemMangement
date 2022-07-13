package ir.maktab.hotelSysytemManagement.service;

import ir.maktab.hotelSysytemManagement.entity.Option;

import java.io.FileNotFoundException;

public interface OptionService extends BaseService<Option, Long> {
    Option addOptional() throws FileNotFoundException;

    void showOptional();
}
