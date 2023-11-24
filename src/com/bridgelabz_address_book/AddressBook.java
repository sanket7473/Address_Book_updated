package com.bridgelabz_address_book;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/*
* @desc:This class is used to do Operations on address book doing operations like add,modify,show,delete the contact lists.
* AddressBook class is containing addContactsFromUserInput() modifyContactByName() and removeContacts() methods.
* addContactsFromUserInput(): is adding contacts, modifyContactByName():searchinng the first name and last name name and modifying it
removeContacts() is to delete a contacts .
**/

public class AddressBook {
    //created a arraylist to store a object of class
    private static List<Contacts> Contactlist = new ArrayList<>();

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
    private void addContacts(Contacts contact) {
        Contactlist.add(contact);
    }

    //modifyContactByName() method is used to search first and last name and edit the contact
    public void modifyContactByName(String firstName, String lastName) {
        Scanner scanner = new Scanner(System.in);
        for (Contacts contact : Contactlist) {
            //It will check for valid firstname and lastname
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                System.out.println("Enter New Address:");
                String address = scanner.nextLine();

                System.out.println("Enter New City:");
                String city = scanner.nextLine();

                System.out.println("Enter New State:");
                String state = scanner.nextLine();

                System.out.println("Enter New Email Id:");
                String email = scanner.nextLine();

                System.out.println("Enter New Zip:");
                int zipcode = scanner.nextInt();

                System.out.println("Enter New Phone Number:");
                String phoneNumber = scanner.next();

                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setEmail(email);
                contact.setZipcode(zipcode);
                contact.setPhoneNumber(phoneNumber);

                System.out.println("Contact modified successfully.");
                showContacts();

            } else {
                System.out.println("Contact not found.");
            }
        }

    }
    //removeContacts() is used to remove from list.
    public void removeContacts(String firstName1) {
        Iterator<Contacts> iterator = Contactlist.iterator();
        while (iterator.hasNext()) {
            Contacts contact = iterator.next();
            if (contact.getFirstName().equals(firstName1)) {
                System.out.println("Contact deleted successfully");
                iterator.remove();
            } else {
                System.out.println("Contact not found");
            }
        }
    }
    //showContacts method is used to display
        private void showContacts ()
        {
            for (Contacts contacts : Contactlist) {
                System.out.println(contacts.getFirstName() + " " + contacts.getLastName() + " " + contacts.getAddress() + " " + contacts.getCity() + " " + contacts.getState() + " " + contacts.getZipcode() + " " + contacts.getPhoneNumber() + " " + contacts.getEmail());

            }
            System.out.println("Contacts Displayed successfully");
        }


        public static void main (String[]args)

        {
            System.out.println("Welcome to Address Book Java Functionality ");
            System.out.println("Added contacts with the firstname,lastname,address,city,state,zip,phone number and email");
            AddressBook s1 = new AddressBook();
            Scanner scanner = new Scanner(System.in);
            do{
                Scanner scan = new Scanner(System.in);
                System.out.println("Menu: enter 1 - adding contact"+" "+"enter 2 - editing contact"+" "+"enter 3 - deleting contact"+" "+"enter 4 - to exit");
                int options=scan.nextInt();
                switch(options){
                    case 1:
                        //Called a method addContactsFromUserInput
                        s1.addContactsFromUserInput();
                        //called a method showContacts
                        s1.showContacts();
                        break;

                    case 2:
                        System.out.println("Enter First Name to Search");
                        String firstName = scanner.nextLine();
                        System.out.println("Enter Last Name To Search:");

                        String lastName = scanner.nextLine();
                        //called a modifyContactByName method with the firstname and lastname.
                        s1.modifyContactByName(firstName, lastName);
                        break;

                    case 3:
                        System.out.println("Enter First Name to Search");
                        String firstName1 = scanner.nextLine();
                        //called a removeContacts with firstName
                        s1.removeContacts(firstName1);
                        s1.showContacts();
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("sorry, invalid option");
                }

            } while(true);


        }

    }

