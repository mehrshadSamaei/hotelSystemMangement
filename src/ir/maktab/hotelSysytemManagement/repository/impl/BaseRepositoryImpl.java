package ir.maktab.hotelSysytemManagement.repository.impl;

import ir.maktab.hotelSysytemManagement.entity.BaseDomain;
import ir.maktab.hotelSysytemManagement.repository.BaseRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Formatter;
import java.util.Scanner;

public abstract class BaseRepositoryImpl<T extends BaseDomain<ID>,
        ID extends Serializable> implements BaseRepository<T, ID> {
    protected File file;
    protected Scanner scanner;
    protected String path;
    protected FileWriter writer;
    protected Formatter formatter;


    @Override
    public long getSimpleId() throws FileNotFoundException {
        file = new File(filePaThAddress());
        scanner = new Scanner(file);
        Long id = 0l;
        while (scanner.hasNextLine()) {
            id = Long.parseLong(scanner.nextLine().split(" ")[0]);
        }
        return ++id;
    }
}
