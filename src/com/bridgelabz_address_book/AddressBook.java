package com.bridgelabz_address_book;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    private List<Contacts> Contactlist =new ArrayList<>();

    // addContactsFromUserInput To take a user input for contacts.

    public void addContactsFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter Email Id:");
        String email = scanner.nextLine();

        System.out.println("Enter Zip:");
        int zipcode = scanner.nextInt();

        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.next();

        Contacts newContact = new Contacts(firstName, lastName, address, city, state, zipcode, phoneNumber, email);
        addContacts(newContact);
    }
    // addContacts method to add the items in the arraylist.
    private void addContacts(Contacts contacts) {
        Contactlist.add(contacts);
    }

    //showContacts method is used to display
    private void showContacts()
    {
        for(Contacts contacts : Contactlist)
        {
            System.out.println(contacts.getFirstName()+ " "+contacts.getLastName()+" "+contacts.getAddress()+" "+contacts.getCity()+" "+contacts.getState()+" "+contacts.getZipcode()+" "+contacts.getPhoneNumber()+" "+contacts.getEmail());

        }
    }

    public static void main(String[] args)

    {
        System.out.println("Welcome to Address Book Java Functionality ");
        System.out.println("Added contacts with the firstname,lastname,address,city,state,zip,phone number and email");
        AddressBook s1 = new AddressBook();
        //Called a method addContactsFromUserInput
        s1.addContactsFromUserInput();
        //called a method showContacts
        s1.showContacts();
    }

}
