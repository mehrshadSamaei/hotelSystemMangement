package ir.maktab.hotelSysytemManagement.service.impl;

import ir.maktab.hotelSysytemManagement.entity.Option;
import ir.maktab.hotelSysytemManagement.repository.OptionRepository;
import ir.maktab.hotelSysytemManagement.service.OptionService;
import ir.maktab.hotelSysytemManagement.util.ApplicationContext;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionServiceImpl extends BaseServiceImpl<Option, Long, OptionRepository> implements OptionService {
    ApplicationContext context;

    public OptionServiceImpl(OptionRepository repository) {
        super(repository);
    }

    @Override
    public void save(Option option) throws IOException {
        repository.save(option);
    }

    @Override
    public Option fineById(Long aLong) {
        return null;
    }

    @Override
    public Option addOptional() throws FileNotFoundException {


        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scLong = new Scanner(System.in);
        Option option = new Option();
        try {
            option.setId(repository.getSimpleId());
        } catch (Exception e) {
            System.out.println("not found id!!!");
        }
        System.out.println("enter the option");
        String optionFiled = sc.next();
        option.setOption(optionFiled);
        System.out.println("price");
        int price = scInt.nextInt();
        option.setPrice(price);
        System.out.println("enter customer id:");
        Long customerId = 0L;
//        do {
        customerId = scLong.nextLong();
        if (!ApplicationContext.costumerService.exists(customerId)) {
            System.out.println("costumer does not exists!");
        } else {
            option.setCustomerId(customerId);
        }
//        } while (ApplicationContext.costumerService.exists(customerId));
//        option.setCustomerId(customerId);
        return option;
    }


    @Override
    public void showOptional() {
        Scanner scLong = new Scanner(System.in);
//        long id = scLong.nextLong();
        int totalprice = 0;
        List<Option> optionList = new ArrayList<>();
        do {
            System.out.println("enter costumer's ID:");
            long id = scLong.nextLong();
            if (!ApplicationContext.costumerService.exists(id)) {
                System.out.println("costumer does not exists!!!");
            } else {
                try {
                    optionList = repository.findAll();
                } catch (Exception e) {
                    System.out.println("not found option!!!");
                }
                for (Option option : optionList) {
                    if (option.getCustomerId() == id) {
                        System.out.println(option);
                        totalprice += option.getPrice();
                    }
                }
                System.out.println("total price = " + totalprice);
                break;
            }
        } while (true);
    }
}
