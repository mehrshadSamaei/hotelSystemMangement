package ir.maktab.hotelSysytemManagement.service.dto.price;

public class Confrence extends BaseDecorate {

    public Confrence(Hotel hotel) {
        super(hotel);
    }

    @Override
    public int price() {
        return this.hotel.price() + 1000;
    }
}
