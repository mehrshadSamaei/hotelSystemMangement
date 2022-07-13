package ir.maktab.hotelSysytemManagement.entity;

import java.io.Serializable;

public class Option extends BaseDomain<Long> implements Serializable {
    private String option;
    private int price;
    private Long customerId;


    public Option(long id, String option, int price, Long customerId) {
        this.option = option;
        this.price = price;
        this.customerId = customerId;
    }

    public Option() {
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Option{" +
                "option='" + option + '\'' +
                ", price=" + price +
                ", customerId=" + customerId +
                '}';
    }
}
