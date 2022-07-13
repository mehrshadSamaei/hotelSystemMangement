package ir.maktab.hotelSysytemManagement.service.dto.price;

public class Room extends BaseDecorate {
    public Room(Hotel hotel) {
        super(hotel);
    }

    @Override
    public int price() {
        return this.hotel.price() + 300;
    }
}
