package com.shbm.www.abusbookingapp;

import java.util.ArrayList;
import java.util.Date;

/**
 * class that will handle a single bus booking
 */
public class BusBooking {

    private BusClass bus;//the bus that is booked
    private ArrayList<IndividualBooking> individual_booking_list;//list of individual group bookings
    private Date departure_date;//day the bus will depart
    private String departure_time;//morning/noon
    private int bus_fare;//fare of that particular booking
    private int book_count;//seats filled

    BusBooking(BusClass bus, Date departure_date, String departure_time, int bus_fare) {//constructor, handles all of the setting
        this.bus = bus;
        individual_booking_list = new ArrayList<>();
        this.departure_date = departure_date;
        this.bus_fare = bus_fare;
        book_count = 0;
    }

    //////getter//////
    public BusClass getBus() {
        return bus;
    }

    public ArrayList<IndividualBooking> getIndividual_booking_list() {
        return individual_booking_list;
    }

    public Date getDeparturedate() {
        return departure_date;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public int getBus_fare() {
        return bus_fare;
    }

    public int getBook_count() {
        return book_count;
    }
    //////end///////

    ///////setter///////
    public void setBus(BusClass bus) {
        this.bus = bus;
    }

    public void setDeparturedate(Date departure_date) {
        this.departure_date = departure_date;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public void setBus_fare(int bus_fare) {
        this.bus_fare = bus_fare;
    }
    //////end///////

    /**
     * add customers to the bus
     * @param booking a single booking
     * @return true if successful addition
     */
    boolean addBooking(IndividualBooking booking) {
        if (booking.getBooking_customer_list().size() + book_count > bus.getBus_capacity()) {
            throw new StackOverflowError();//add better exception
        } else {
            individual_booking_list.add(booking);
            book_count = book_count + booking.getBooking_customer_list().size();
            return true;
        }
    }

    /**
     * remove a single group booking
     * @param booking_id the id of the booking to remove
     * @return the IndividualBooking object that is removed
     */
    IndividualBooking removeBooking(long booking_id) {
        IndividualBooking booking = null;
        if(individual_booking_list.size() == 0)
            throw new NullPointerException();//use custom exception
        for(IndividualBooking i : individual_booking_list) {
            if(i.getBooking_id() == booking_id) {
                booking = i;
                individual_booking_list.remove(i);
                return booking;
            }
        }
        return booking;
    }
}
