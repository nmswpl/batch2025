package in.co.nmsworks.week5.day2;

import java.util.*;

public class AddressBook {

    static Map<Character, List<Contact>> bookMap = new HashMap<>(26);

    public static void main(String[] args) {
        AddressBook runner = new AddressBook();
        boolean flag = true;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------------------------------");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Phone NUmbers");
            System.out.println("5. Update Email Address");
            System.out.println("6. Print Address Book");
            System.out.println("7. Exit");
            System.out.println("-------------------------------");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    Contact newBook;
                    System.out.println("Enter the name of your contact: ");
                    String name = sc.next();
                    System.out.println("Enter the phone number of your contact: ");
                    int phone = sc.nextInt();
                    System.out.println("Enter the email address of your contact: ");
                    String email = sc.next();
                    newBook = new Contact(name.substring(0,1).toUpperCase(), phone, email);
                    runner.addContact(newBook);
                    break;
                }

                case 2: {
                    Contact book;
                    System.out.println("Enter the name of contact to remove:");
                    String name = sc.next();
                    book = runner.removeContact(name.substring(0,1).toUpperCase());
                    if (book != null) {
                        System.out.println("Deleted contact: " + book);
                    } else {
                        System.out.println("Contact not present in the book");
                    }
                    break;
                }

                case 3: {
                    Contact book;
                    System.out.println("Enter the name of contact to search:");
                    String name = sc.next();
                    book = runner.getContact(name.substring(0,1).toUpperCase());
                    if (book != null) {
                        System.out.println("Contact found: " + book);
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Enter the name of contact to update:");
                    String name = sc.next();
                    System.out.println("Enter the Phone Number to update : ");
                    int phone = sc.nextInt();
                    Contact book = runner.modifyPhoneNoByName(name.substring(0,1).toUpperCase(), phone);
                    if (book != null) {
                        System.out.println("Contact updated: " + book);
                    } else {
                        System.out.println("Contact not found. Unable to update phone number");
                    }
                    break;
                }

                case 5: {
                    System.out.println("Enter the name of contact to update:");
                    String name = sc.next();
                    System.out.println("Enter Email Address to update : ");
                    String email = sc.next();
                    Contact book = runner.modifyEmailByName(name.substring(0,1).toUpperCase(),email);
                    if (book != null) {
                        System.out.println("Contact updated: " + book);
                    } else {
                        System.out.println("Contact not found. Unable to update email address");
                    }
                    break;
                }

                case 6: {
                    System.out.println("Contacts in Address Book:");
                    runner.printContacts();
                    break;
                }
                case 7: {
                    System.out.println("Exiting...");
                    flag = false;
                    System.exit(0);
                }
            }
        }
        while (choice <= 7);
    }

    public void addContact(Contact contact) {
        char c = contact.getName().charAt(0);
        int index = (int) c;
        bookMap.putIfAbsent(c,new ArrayList<>());
        bookMap.get(c).add(contact);
        Collections.sort(bookMap.get(c));
    }

    public Contact removeContact(String name) {
        Contact book = null;
        char c = name.charAt(0);
        List<Contact> contactList = bookMap.get(c);
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                book = contact;
            }
        }
        contactList.remove(book);
        return book;
    }

    public Contact getContact(String name) {
        Contact book = null;
        char c = name.charAt(0);
        List<Contact> contactList = bookMap.get(c);
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                book = contact;
            }
        }
        return book;
    }

    public Contact modifyPhoneNoByName(String name,int phoneNo) {
        Contact book = null;
        char c = name.charAt(0);
        List<Contact> contactList = bookMap.get(c);
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNo(phoneNo);
                book = contact;
            }
        }
        return book;
    }

    public Contact modifyEmailByName(String name,String email) {
        Contact book = null;
        char c = name.charAt(0);
        List<Contact> contactList = bookMap.get(c);
        for (Contact contact : contactList) {
            if(contact.getName().equals(name)) {
                contact.setEmail(email);
                book = contact;
            }
        }
        return book;
    }

    public void printContacts() {
        for (Map.Entry<Character, List<Contact>> entry : bookMap.entrySet()) {
            List<Contact> contactList = entry.getValue();
            System.out.println("Character: " + entry.getKey());
            for (Contact contact : contactList) {
                System.out.println("Name: " + contact.getName() + "\tPhone Number: " + contact.getPhoneNo() + "\tEmail: " + contact.getEmail());
            }
        }
    }
}
