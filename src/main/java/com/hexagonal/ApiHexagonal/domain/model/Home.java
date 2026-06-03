package com.hexagonal.ApiHexagonal.domain.model;

import com.hexagonal.ApiHexagonal.domain.model.enums.StatusHome;

import java.util.List;
import java.util.UUID;

public class Home {

    private UUID id;

    private StatusHome statusHome;

    private Address address;

    private List<Rooms> rooms;

    private List<BillHouse> bills;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setStatusHome(StatusHome statusHome) {
        this.statusHome = statusHome;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setRooms(List<Rooms> rooms) {
        this.rooms = rooms;
    }

    public void setBills(List<BillHouse> bills) {
        this.bills = bills;
    }

    public UUID getId() {
        return id;
    }

    public StatusHome getStatusHome() {
        return statusHome;
    }

    public Address getAddress() {
        return address;
    }

    public List<Rooms> getRooms() {
        return rooms;
    }

    public List<BillHouse> getBills() {
        return bills;
    }
}
