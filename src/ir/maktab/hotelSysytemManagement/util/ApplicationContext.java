package ir.maktab.hotelSysytemManagement.util;

import ir.maktab.hotelSysytemManagement.repository.impl.CustomerRepositoryImpl;
import ir.maktab.hotelSysytemManagement.repository.impl.OpionRepositoryImpl;
import ir.maktab.hotelSysytemManagement.service.CustomerService;
import ir.maktab.hotelSysytemManagement.service.OptionService;
import ir.maktab.hotelSysytemManagement.service.impl.CustomerServiceImpl;
import ir.maktab.hotelSysytemManagement.service.impl.OptionServiceImpl;

import java.util.Scanner;

public class ApplicationContext {
    public static CustomerService costumerService = new CustomerServiceImpl(new CustomerRepositoryImpl());
    public static OptionService optionService = new OptionServiceImpl(new OpionRepositoryImpl());
    private Menu menu = new Menu();
    private Scanner scInt = new Scanner(System.in);
    private Scanner scStr = new Scanner(System.in);
//    private CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
//    private CustomerServiceImpl customerService = new CustomerServiceImpl(customerRepository);
//    private OpionRepositoryImpl opionRepository = new OpionRepositoryImpl() ;
//    private OptionServiceImpl optionService = new OptionServiceImpl(opionRepository);

//    public OpionRepositoryImpl getOpionRepository() {
//        return opionRepository;
//    }
//
//    public OptionServiceImpl getOptionService() {
//        return optionService;
//    }

    //    private Dinner dinner;
//    private Room room;
//    private Confrence confrence;
//    private BasicHotel basicHotel;

//    public Dinner getDinner(BasicHotel basicHotel) {
//        return dinner;
//    }
//
//    public Room getRoom() {
//        return room;
//    }
//
//    public Confrence getConfrence(BasicHotel basicHotel) {
//        return confrence;
//    }
//
//    public BasicHotel getBasicHotel() {
//        return basicHotel;
//    }
//
//    public DataBaseFileText getDataBaseFileText() {
//        return dataBaseFileText;
//    }

//    public CustomerRepositoryImpl getCustomerRepository() {
//        if(customerRepository == null){
//            customerRepository = new CustomerRepositoryImpl();
//        }
//        return customerRepository;
//    }
//    public CustomerServiceImpl getCustomerService() {
//        if(customerService == null){
//            customerService = new CustomerServiceImpl(customerRepository);
//        }
//        return customerService;
//    }

    public Menu getMenu() {
        if (menu == null) {
            Menu menu = new Menu();
        }
        return menu;
    }

    public Scanner getScInt() {
        if (scInt == null) {
            scInt = new Scanner(System.in);
        }
        return scInt;
    }

    public Scanner getScStr() {
        if (scStr == null) {
            scStr = new Scanner(System.in);
        }
        return scStr;
    }
}
