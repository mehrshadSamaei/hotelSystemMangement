package ir.maktab.hotelSysytemManagement.entity;

import java.io.Serializable;

public abstract class BaseDomain<ID extends Serializable> {

    private ID id;

    public BaseDomain(ID id) {
        this.id = id;
    }

    public BaseDomain() {
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
