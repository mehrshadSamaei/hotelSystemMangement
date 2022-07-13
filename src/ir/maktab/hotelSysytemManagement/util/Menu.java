package ir.maktab.hotelSysytemManagement.util;

public class Menu {
    public void welcome() {
        System.out.println("welcome to 5 star hotel");
    }

    public void select() {
        System.out.println("Choose according to the customer's opinion");
    }

    public void chooses() {
        System.out.println("dinner/1 , conference/2 , room/3 , exit/4");
    }

    public void enterCounter() {
        System.out.println("enter counter");
    }

    public void enterCustomerField() {
        System.out.println("enter firstname");
        System.out.println("enter lastname");
    }

    public void addCustomer() {
        System.out.println("1/add customer");
    }

    public void addOption() {
        System.out.println("2/add option");
    }

    public void showOption() {
        System.out.println("3/show all option");
    }
}
