package com.driver.Service;

import com.driver.Repositary.HotelManagementRepository;
import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelManagementService {

    HotelManagementRepository hotelManagementRepoaitory = new HotelManagementRepository();
    public String addHotel(Hotel hotel) {
        return hotelManagementRepoaitory.addHotel(hotel);
    }

    public Integer addUser(User user) {
        return hotelManagementRepoaitory.addUser(user);
    }

    public String getHotelWithMostFacilities() {
        return hotelManagementRepoaitory.getHotelWithMostFacilities();
    }

    public int bookARoom(Booking booking) {
        return hotelManagementRepoaitory.bookARoom(booking);
    }

    public int getBookings(Integer aadharCard) {
        return hotelManagementRepoaitory.getBookings(aadharCard);
    }

    public Hotel updateFacilities(List <Facility> newFacilities , String hotelName) {
        return hotelManagementRepoaitory.updateFacilities(newFacilities , hotelName);
    }
}