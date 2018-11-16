package com.shbm.www.abusbookingapp;

/**
 * class with the the details of a bus entity
 */
public class BusClass {

    private String bus_number;//number of the bus , *required
    private int bus_capacity;//capacity of the bus excluding the drivers seat , *required
    private String drivers_name;//name of the bus driver
    private String conductors_name;//name of the conductor
    private String preferred_route;//the route the bus usually follows , *required
    private long drivers_contact_number;//contact number of the driver
    private Integer bus_color;//colour of the bus in hexadecimal

    ////////constructor/////////
    public BusClass(String bus_number, int bus_capacity, String preferred_route) {//either put essential details
        this.bus_number = bus_number;
        this.bus_capacity = bus_capacity;
        this.preferred_route = preferred_route;

    }

    public BusClass(String bus_number, int bus_capacity, String preferred_route, long drivers_contact_number) {//or put the details and contact number of driver
        this(bus_number, bus_capacity, preferred_route);
        this.drivers_contact_number = drivers_contact_number;
    }

    public BusClass(String bus_number, int bus_capacity, String drivers_name, String conductors_name, String preferred_route, long drivers_contact_number, String bus_color) {//or put all the details
        this(bus_number, bus_capacity, preferred_route);
        this.drivers_name = drivers_name;
        this.conductors_name = conductors_name;
        this.drivers_contact_number = drivers_contact_number;
        this.bus_color = Integer.parseInt(bus_color, 16);
    }
    ///////end////////

    ///////getter///////
    public String getBus_number() {
        return bus_number;
    }

    public int getBus_capacity() {
        return bus_capacity;
    }

    public String getDrivers_name() {
        return drivers_name;
    }

    public String getConductors_name() {
        return conductors_name;
    }

    public String getPreferred_route() {
        return preferred_route;
    }

    public long getDrivers_contact_number() {
        return drivers_contact_number;
    }

    public Integer getBus_color() {
        return bus_color;
    }
    ///////end///////

    //////setter//////
    public void setDrivers_name(String drivers_name) {
        this.drivers_name = drivers_name;
    }

    public void setConductors_name(String conductors_name) {
        this.conductors_name = conductors_name;
    }

    public void setDrivers_contact_number(long drivers_contact_number) {
        this.drivers_contact_number = drivers_contact_number;
    }
    //////end///////
}
