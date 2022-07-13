package ir.maktab.hotelSysytemManagement.service.dto.price;

public class Dinner extends BaseDecorate {

    public Dinner(Hotel hotel) {
        super(hotel);
    }

    @Override
    public int price() {
        return this.hotel.price() + 120;
    }
}
