package ir.maktab.hotelSysytemManagement.repository.impl;

import ir.maktab.hotelSysytemManagement.entity.Option;
import ir.maktab.hotelSysytemManagement.repository.OptionRepository;
import ir.maktab.hotelSysytemManagement.util.ApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class OpionRepositoryImpl extends BaseRepositoryImpl<Option, Long> implements OptionRepository {
    ApplicationContext context;

    @Override
    public void save(Option option) throws IOException {
        if (file == null) {
            file = new File("C:\\Users\\mehrs\\Desktop\\Mehrshad_Samaei_HW10" +
                    "\\Project\\src\\ir\\maktab\\hotelSysytemManagement\\App\\option.txt");
        }
        if (writer == null) {
            writer = new FileWriter(file, true);
        }
        if (formatter == null) {
            formatter = new Formatter(writer);
        }
        formatter.format("%s %s %s %s", option.getId(), option.getOption(),
                option.getPrice(), option.getCustomerId() + "\n");
        formatter.close();
    }

    @Override
    public Option findById(Long aLong) throws FileNotFoundException {
        Option option;
        if (file == null) {
            file = new File(filePaThAddress());
        }
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            option = new Option(scanner.nextLong(), scanner.next(), scanner.nextInt(), scanner.nextLong());
            if (option.getId() != null) {
                return option;
            }
        }
        return null;
    }

    @Override
    public List<Option> findAll() throws FileNotFoundException {
        Option option;
        List<Option> optionList = new ArrayList<>();
        if (file == null) {
            file = new File(filePaThAddress());
        }
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            option = new Option(scanner.nextLong(), scanner.next(), scanner.nextInt(), scanner.nextLong());
            optionList.add(option);
        }
        return optionList;
    }

    @Override
    public String filePaThAddress() throws FileNotFoundException {
        if (path == null) {
            path = "C:\\Users\\mehrs\\Desktop\\Mehrshad_Samaei_HW10\\Project\\src\\ir" +
                    "\\maktab\\hotelSysytemManagement\\App\\option.txt";
        }
        return this.path;
    }
}
