package com.bridgelabz_address_book;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
                    break;
                case 5:
                    a = false;
                    break;
            }

        } while (a);
    }

    public  void showAddressBook(String name) {
        List<Contacts> addressBook = addMultiple.get(name);
        for (Contacts c : addressBook) {
            System.out.println(c.toString());
        }

//        for (Map.Entry <String,List<Contacts>>m:addMultiple.entrySet()) {
//            System.out.println(m.getKey());
//            List<Contacts> addressBook = m.getValue();
//            for(Contacts c:addressBook)
//            {
//                System.out.println(c.toString());
//            }
//        }

    }
}