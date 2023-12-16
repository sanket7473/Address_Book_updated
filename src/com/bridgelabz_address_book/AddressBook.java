package com.bridgelabz_address_book;

import java.util.*;
/*
* @desc:This class is used to do Operations on address book doing operations like add,modify,show,delete the contact lists.
* AddressBook class is containing addContactsFromUserInput() modifyContactByName() and removeContacts() methods.
* addContactsFromUserInput(): is adding contacts, modifyContactByName():searchinng the first name and last name name and modifying it
removeContacts() is to delete a contacts .
*
**/

public class AddressBook {
    //created a arraylist to store a object of class

    Map<String, List<Contacts>> addMultiple = new HashMap<>();
    public static List<Contacts> Contactlist = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    private String addressBookName;
    private String details;
    public String firstName;
    public String lastName;

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }


    // addContactsFromUserInput To take a user input for contacts.
    public void addContactsFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        lastName = scanner.nextLine();

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

    public void multiplyContact() {
        System.out.println("how many contact are creating");
        int numberOfContact = scanner.nextInt();
        for (int i = 1; i <= numberOfContact; i++) {
            System.out.println("Person " + i + " Details");
            addContactsFromUserInput();
        }
        System.out.println(Contactlist);
    }


    /* addContacts method to add the items in the arraylist
     * @param taking contact object as a parameter and adding it in the list
     * anyMatch() method is stream method to check firstName and Last name same exist.
     */
    private void addContacts(Contacts contact) {
        if (Contactlist.stream().anyMatch(contacts -> contacts.getFirstName().equals(firstName) && contacts.getLastName().equals(lastName))) {
            System.out.println("Same First Name and Last Name exist");
        } else {
            Contactlist.add(contact);
        }


    }
//    public void serchByCity()
//    {
//        Scanner sc=new Scanner(System.in);
//        String cityName=sc.next();
//        System.out.println("Enter a city to search");
//
//        Contactlist.stream().filter(contacts -> contacts.getCity().equals(cityName)).forEach(contact -> {
//            // Display or process the contact data here
//            System.out.println(contact);
//        });
//    }

    /*modifyContactByName() method is used to search first and last name and edit the contact
    @param taking a firstname and lastname as a parameter to search and modify if found

     */
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

    /*removeContacts() is used to remove from list.
    @param taking firstname1 to serach a first name
     */
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

    /*showContacts method is used to display
     */
    public String showContacts() {
        for (Contacts contacts : Contactlist) {
            System.out.println(contacts.getFirstName() + " " + contacts.getLastName() + " " + contacts.getAddress() + " " + contacts.getCity() + " " + contacts.getState() + " " + contacts.getZipcode() + " " + contacts.getPhoneNumber() + " " + contacts.getEmail());

        }
        System.out.println("Contacts Displayed successfully");
        return details;
    }

    public static void multiplePerson() {
        AddressBook s1 = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        /*
        Added a do while loop to add a multiple contacts.
        */

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Menu: enter 1 - adding contact" + " " + "enter 2 - editing contact" + " " + "enter 3 - deleting contact" + " " + "enter 4 to exit ");
            int options = scan.nextInt();
            switch (options) {
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
                    a = false;
                    break;

                default:
                    System.out.println("sorry, invalid option");
            }

        } while (a);


    }

    public void addAddressBook() {

        System.out.println("Enter how many address book you want to add");
        Scanner sc = new Scanner(System.in);
        int numberOfBookAddress = sc.nextInt();
        for (int i = 1; i <= numberOfBookAddress; i++) {
            Contactlist = new ArrayList<>();
            Contactlist.clear();
            System.out.println("Entered " + i + " Address book name");
            String addressBookName = sc.next();
            setAddressBookName(addressBookName);
            multiplePerson();
            addMultiple.put(addressBookName, Contactlist);
//        addressBook.multiplyContact();
//        addressBook.editDeleteContact();
        }

    }
    public  void showaddressBookByCity(String cityName)
    {
//           for( List<Contacts>addressBoo_1:addMultiple.values())
//            {
//
//            }
        addMultiple.entrySet().stream()
                .filter(entry -> {
                    String key = entry.getKey(

                    );
                    List<Contacts> contacts = entry.getValue();
                    System.out.println("Key: " + key);

                    // Use anyMatch to check if any contact has the specified city
                    return contacts.stream().anyMatch(city -> city.getCity().equals(cityName));
                }).forEach(entry->
                {
                    String key = entry.getKey();
                    List<Contacts> contacts = entry.getValue();
                    System.out.println("Contacts for city " + cityName + " in key " + key + ":");
                    contacts.stream()
                            .filter(city -> city.getCity().equals(cityName))
                            .forEach(contact -> {
                                // Assuming Contacts class has a getFirstName() method
//                                System.out.println("Person's Name: " + contact.getFirstName());
                            });
                });
    }

}

