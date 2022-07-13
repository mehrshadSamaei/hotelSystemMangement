package ir.maktab.hotelSysytemManagement.App;

import ir.maktab.hotelSysytemManagement.util.ApplicationContext;

import java.io.IOException;

public class AppHotelSystemManagement {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ApplicationContext();
        context.getMenu().welcome();
//        context.getMenu().select();
//        context.getMenu().chooses();
        boolean flag = true;
        getResultOptionAndFillCustomerInformation(context);

//        while (flag) {
//            int num = context.getScInt().nextInt();
//            switch (num) {
//                case 1:
//                    context.getMenu().enterCounter();
//                    int countDinner = context.getScInt().nextInt();
//                    int dinnerPrice = new Dinner(new BasicHotel()).price() * countDinner;
//                    FileWriter fileWriter = DataBaseFileText.getFileWriter();
//                    fileWriter.write(dinnerPrice + " are your dinner price ");
//                    fileWriter.close();
//                    break;
//                case 2:
//                    context.getMenu().enterCounter();
//                    int countConfrece = context.getScInt().nextInt();
//                    int confrencePrice = new Confrence(new BasicHotel()).price() * countConfrece;
//                    FileWriter fileWriter1 = DataBaseFileText.getFileWriter();
//                    fileWriter1.write(confrencePrice + "are your confrence price");
//                    fileWriter1.close();
//                    break;
//                case 3:
//                    context.getMenu().enterCounter();
//                    int countRoom = context.getScInt().nextInt();
//                    int roomPrice = new Room(new BasicHotel()).price() * countRoom;
//                    FileWriter fileWriter2 = DataBaseFileText.getFileWriter();
//                    fileWriter2.write(roomPrice + "are your room price");
//                    break;
//                case 4:
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("enter correct num");
//            }
//        }
    }

    private static void getResultOptionAndFillCustomerInformation(ApplicationContext context) throws IOException {
        context.getMenu().addCustomer();
        context.getMenu().addOption();
        context.getMenu().showOption();
        try {
            int num = context.getScInt().nextInt();
            if (num == 1) {
                ApplicationContext.costumerService.save(ApplicationContext.costumerService.addCustomer());
                System.out.println("add customer");
                getResultOptionAndFillCustomerInformation(context);
            } else if (num == 2) {
                ApplicationContext.optionService.save(ApplicationContext.optionService.addOptional());
                System.out.println("add optional ");
                getResultOptionAndFillCustomerInformation(context);
            } else if (num == 3) {
                ApplicationContext.optionService.showOptional();
                getResultOptionAndFillCustomerInformation(context);
            }
        } catch (Exception e) {
            System.out.println("enter correct num");
        }
    }
}
