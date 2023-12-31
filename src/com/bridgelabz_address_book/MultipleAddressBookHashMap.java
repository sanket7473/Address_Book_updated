package com.bridgelabz_address_book;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
* @Desc: MultipleAddressBookHashMap is class extending a main  class AddressBook.
*
 */
public class MultipleAddressBookHashMap extends AddressBook {

    Scanner sc = new Scanner(System.in);


    static MultipleAddressBookHashMap multipleAddressBookHashMap = new MultipleAddressBookHashMap();
    AddressBook addressBook = new AddressBook();
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Java Functionality ");
        multipleAddressBookHashMap.multipleBook();
    }

    boolean a = true;

    public void multipleBook() {
        do {
            System.out.println("Menu: enter 1 - adding multiple address book" + " " + "enter 2 - Searching a person by name of city" + " " + "enter 3 - count of person by city names" + " " + "enter 4 - to show address book" + " " + " enter 5- Display a city by sorting a first name"+" " +" enter 6 To sort the records with the name of city"+" "+" enter 7- to exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    System.out.println("Enter a city name to serach");
                    String name=sc.next();
                    multipleAddressBookHashMap.showaddressBookByCity(name);
                    break;
                case 3:
                    System.out.println("Enter a city name to serach");
                    String nameCity=sc.next();
                    long count= multipleAddressBookHashMap.countByCity(nameCity);
                    System.out.println("Number of persons in " + nameCity + ": " + count);
                    break;
                case 4:
                    System.out.println("Enter a name of address book to search");
                    String name_city = sc.next();
                    multipleAddressBookHashMap.showAddressBook(name_city);
                    break;
                case 5:
                    multipleAddressBookHashMap.sortByName();
                    break;
                case 6:
                    multipleAddressBookHashMap.sortByCityState();
                    break;
                case 7:
                    a = false;
                    break;
            }

        } while (a);
    }


}

