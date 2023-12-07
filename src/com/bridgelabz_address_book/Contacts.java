
package com.bridgelabz_address_book;


/*
 *@Desc:Contacts class is containing firstname,lastname,address,city,state,zip,phone number and email.
 *Used get set method to get the data and the set the data
 **/
public class Contacts {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private String phoneNumber;
    private String email;

    /*
    * Contacts constructor is initializing a data.
     */
    public Contacts(String firstName, String lastName, String address, String city, String state, int zipcode, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Get Methods to get the values for first name
    public String getFirstName() {
        return firstName;
    }

    //Set methods to set a values
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getLastName is for getting a last name
    public String getLastName() {
        return lastName;
    }

    // setLastName is for getting a last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //getAddress is to get the address
    public String getAddress() {
        return address;
    }

    // setAddress is setting the address
    public void setAddress(String address) {
        this.address = address;
    }

    //getCity is to get the city
    public String getCity() {
        return city;
    }

    //setCity is to set the city name
    public void setCity(String city) {
        this.city = city;
    }
    //getState is to get the state name
    public String getState() {
        return state;
    }
    //setState is to set the zipcode
    public void setState(String state) {
        this.state = state;
    }
    //getZipcode is to get the Zipcode
    public int getZipcode() {
        return zipcode;
    }
    //setZipcode is to set the zipcode
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    //getPhoneNumber to get the phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //setPhoneNumber is to set the phoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //getEmail to get the email address
    public String getEmail() {
        return email;
    }
    //setEmail is to set the email address
    public void setEmail(String email) {
        this.email = email;
    }
}
