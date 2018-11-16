package com.shbm.www.abusbookingapp;

/**
 * a class that puts together the information of a single booking of a single app user into a ticket
 * different users have different tickets for a single BusBooking and IndividualBooking
 */
public class TicketClass {

    private CustomerClass customer;//the customer to whom the ticket belongs
    private BusBooking customer_booking;//the booking under which the customer is provided a seat , the bus timing etc all are handeled
    private boolean payment_completed;//if the customer has completed his/her payment
    private boolean seat_alloted;//if the customer has been alloted his/her seat
    private boolean CONFIRMED;//true if seat is confirmed and ticket can be displayed

    ///////constructor////////
    public TicketClass(CustomerClass customer, BusBooking customer_booking, boolean payment_completed, boolean seat_alloted) {
        this.customer = customer;
        this.customer_booking = customer_booking;
        this.payment_completed = payment_completed;
        this.seat_alloted = seat_alloted;
    }

    public TicketClass(CustomerClass customer, BusBooking customer_booking) {
        this.customer = customer;
        this.customer_booking = customer_booking;
    }

    public TicketClass(CustomerClass customer, BusBooking customer_booking, boolean seat_alloted) {
        this.customer = customer;
        this.customer_booking = customer_booking;
        this.seat_alloted = seat_alloted;
    }

    public TicketClass(CustomerClass customer, boolean payment_completed, BusBooking customer_booking) {
        this.customer = customer;
        this.customer_booking = customer_booking;
        this.payment_completed = payment_completed;
    }
    ////////end/////////

    /**
     * to display the deatils of the ticket of a single customer
     * @return The details in String format
     */
    String displayTicketDetails() {
        return  "Name: \t"+getCustomer().getCustomer_name()+"\n"+
                "Bus Number: \t"+getCustomer_booking().getBus().getBus_number()+"\n"+
                "Booking Day: \t"+getCustomer_booking().getDeparturedate().toString()+"\n"+
                "Booking Time: \t"+getCustomer_booking().getDeparture_time()+"\n"+
                "Payment Confirmed: \t"+isPayment_completed()+"\n";
    }

    ///////getter///////
    public CustomerClass getCustomer() {
        return customer;
    }

    public BusBooking getCustomer_booking() {
        return customer_booking;
    }

    public boolean isPayment_completed() {
        return payment_completed;
    }

    public boolean isSeat_alloted() {
        return seat_alloted;
    }

    public boolean isCONFIRMED() {
        return CONFIRMED;
    }
    ////////end/////////

    ////////setter//////
    public void setPayment_completed(boolean payment_completed) {
        this.payment_completed = payment_completed;
    }

    public void setSeat_alloted(boolean seat_alloted) {
        this.seat_alloted = seat_alloted;
    }

    public void setCONFIRMED(boolean CONFIRMED) {
        this.CONFIRMED = CONFIRMED;
    }
    /////////end/////////
}
