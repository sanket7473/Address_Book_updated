package com.bridgelabz_address_book;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleAddressBookHashMap extends AddressBook {

    Scanner sc = new Scanner(System.in);
     Map<String, AddressBook> addMultiple = new HashMap<>();

    static MultipleAddressBookHashMap multipleAddressBookHashMap = new MultipleAddressBookHashMap();
    AddressBook addressBook = new AddressBook();
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Java Functionality ");
        multipleAddressBookHashMap.multipleBook();
    }

    boolean a = true;

    public void multipleBook() {
        do {

            System.out.println("Menu: enter 1 - adding multiple address book" + " " + "enter 2 - editing multiple address book" + " " + "enter 3 - deleting multiple address book" + " " + "enter 4 - to show address book" + "" + " enter 5-to exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Enter a name of address book to search");
                    String name = sc.next();
                    multipleAddressBookHashMap.showAddressBook(name);
                case 5:
                    a = false;
                    break;
            }

        } while (a);
    }

    public void addAddressBook() {
        System.out.println("Enter how many address book you want to add");
        Scanner sc = new Scanner(System.in);
        int numberOfBookAddress = sc.nextInt();
        for (int i = 1; i <= numberOfBookAddress; i++) {
            System.out.println("Entered " + i + " Address book name");
            String addressBookName = sc.next();
            addressBook.setAddressBookName(addressBookName);
            addressBook.multiplePerson();
            addMultiple.put(addressBookName, addressBook);
//        addressBook.multiplyContact();
//        addressBook.editDeleteContact();
        }
    }

    public  void showAddressBook(String name) {
//        for (Map.Entry m:addMultiple.entrySet()) {
//            System.out.println(m.getKey());
//            AddressBook addressBook = entrySet.getValue();
//            System.out.println("Details: " + addressBook.entrySet());
//        }

        for (Map.Entry<String, AddressBook> entry : addMultiple.entrySet()) {
            System.out.println("Name: " + entry.getKey());

            AddressBook addressBook = entry.getValue();
            System.out.println( addressBook.showContacts()); // Replace with the actual method in your AddressBook class

            // Print other details as needed
            // System.out.println("SomeOtherDetail: " + addressBook.getSomeOtherDetail());

            System.out.println(); // Add a newline for better readability
        }

    }
}