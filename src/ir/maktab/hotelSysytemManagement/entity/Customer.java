package ir.maktab.hotelSysytemManagement.entity;

import java.io.Serializable;

public class Customer extends BaseDomain<Long> implements Serializable {
    private String fName;
    private String lName;

    public Customer(Long id, String fName, String lName) {
        super(id);
        this.fName = fName;
        this.lName = lName;
    }

    public Customer() {
    }

    //    private String address;
//    private String mobileNum;
//    private Gender gender;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getMobileNum() {
//        return mobileNum;
//    }
//
//    public void setMobileNum(String mobileNum) {
//        this.mobileNum = mobileNum;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
