package com.shbm.www.abusbookingapp;

import java.util.ArrayList;
import java.util.Date;

/**
 * class that will handle a individual single or group booking of one or more customers
 */
public class IndividualBooking {

    private long booking_id;//unique id of the booking
    private boolean single_booking;
    private CustomerClass main_customer;//the person in-charge of the booking
    private ArrayList<CustomerClass> booking_customer_list;//list of customers in the booking
    private Date preferred_date;//date they would prefer to leave at
    private String preferred_time;//time they would prefer to leave at
    private String destination;//the destination of the individual booking

    ///////constructor/////
    public IndividualBooking(long booking_id, boolean single_booking, CustomerClass main_customer, ArrayList<CustomerClass> booking_customer_list, Date preferred_date, String preferred_time) {
        this.booking_id = booking_id;
        this.main_customer = main_customer;
        this.booking_customer_list = booking_customer_list;
        this.preferred_date = preferred_date;
        this.preferred_time = preferred_time;
    }
    ///////end///////

    ///////getter///////
    public long getBooking_id() {
        return booking_id;
    }

    public CustomerClass getMain_customer() {
        return main_customer;
    }

    public ArrayList<CustomerClass> getBooking_customer_list() {
        return booking_customer_list;
    }

    public Date getPreferred_date() {
        return preferred_date;
    }

    public String getPreferred_time() {
        return preferred_time;
    }

    public String getDestination() {
        return destination;
    }
    ///////end/////////

    /**
     * add a ArrayList of customers to the already create booking
     * @param local_customer_list list of customers to be added
     * @return true for successful booking
     */
    boolean addToIndividualBooking(ArrayList<CustomerClass> local_customer_list) {
        booking_customer_list.addAll(local_customer_list);
        return true;
    }

    /**
     * add a single customer to the already create booking
     * @param customer customer to be added
     * @return true for successful booking
     */
    boolean addToIndividualBooking(CustomerClass customer) {
        booking_customer_list.add(customer);
        return true;
    }

    /**
     * delete a customer (CustomerClass) from the individual booking
     * @return the CustomerClass object that is removed
     * @param customer_id id of customer to be deleted
     */
    CustomerClass removefromIndividualBooking(long customer_id) {
        CustomerClass customer = null;
        if(booking_customer_list.size()==0) throw new NullPointerException();//add a better exception
        else {
            for (CustomerClass i : booking_customer_list) {
                if (i.getCustomer_id() == customer_id) {
                    customer = i;
                    booking_customer_list.remove(i);
                    return customer;
                }
            }
        }
        return  customer;
    }
}
