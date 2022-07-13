package ir.maktab.hotelSysytemManagement.service.dto.price;

public abstract class BaseDecorate implements Hotel {
    protected Hotel hotel;

    public BaseDecorate(Hotel hotel) {
        this.hotel = hotel;
    }
}
