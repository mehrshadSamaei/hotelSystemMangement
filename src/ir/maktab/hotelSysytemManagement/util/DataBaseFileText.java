package ir.maktab.hotelSysytemManagement.util;

import java.io.FileWriter;
import java.io.IOException;

public class DataBaseFileText {
//  static FileReader fileReader;

    static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter("C:\\Users\\mehrs\\Desktop\\Mehrshad_Samaei_HW10\\DataBase.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            fileReader = new FileReader("C:\\Users\\mehrs\\Desktop\\Mehrshad_Samaei_HW10\\DataBase.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    private DataBaseFileText() throws IOException {
    }
//    public FileReader getFileReader() {
//            return fileReader;
//    }

    public static FileWriter getFileWriter() {
        return fileWriter;
    }
}
