package com.shbm.www.abusbookingapp;

/**
 * class specifying a customer entity
 */
public class CustomerClass {

    private long customer_id;//unique id of the customer
    private String customer_name;//name of the customer , *has to be provided
    private String customer_branch;//branch of the customer, use enum , *has to be provided
    private int customer_year;//1 2 3 or 4, 5 for other, will use enum later , *has to be provided
    private String customer_residence;//where the customer lives
    private long customer_number;//contact number of customer , *has to be provided
    private String customer_email;//email of customer

    ///////constructors///////
    public CustomerClass(String customer_name, String customer_branch, int customer_year, long customer_number, long customer_id) {//constructor to handle the details
        this.customer_name = customer_name;
        this.customer_branch = customer_branch;
        this.customer_year = customer_year;
        this.customer_number = customer_number;
    }

    public CustomerClass(String customer_name, String customer_branch, int customer_year, long customer_number, String customer_residence, long customer_id) {//residence is not always provided
        this(customer_name, customer_branch, customer_year, customer_number, customer_id);
        this.customer_residence = customer_residence;
    }

    public CustomerClass(String customer_name, String customer_branch, long customer_number, int customer_year, String customer_email, long customer_id) {//email is not always provided
        this(customer_name, customer_branch, customer_year, customer_number, customer_id);
        this.customer_email = customer_email;
    }

    public CustomerClass(String customer_name, String customer_branch, int customer_year, long customer_number, String customer_residence, String customer_email, long customer_id) {//residence is not always provided
        this(customer_name, customer_branch, customer_year, customer_number, customer_id);
        this.customer_residence = customer_residence;
        this.customer_email = customer_email;
    }
    //////end/////////

    //////getter//////
    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_branch() {
        return customer_branch;
    }

    public int getCustomer_year() {
        return customer_year;
    }

    public String getCustomer_residence() {
        return customer_residence;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public long getCustomer_number() {
        return customer_number;
    }

    public long getCustomer_id() {
        return customer_id;
    }
    ///////end///////

    ///////setter///////
    public void setCustomer_residence(String customer_residence) {
        this.customer_residence = customer_residence;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
    ///////end///////
}
