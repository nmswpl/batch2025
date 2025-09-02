package in.co.nmsworks.week5.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookApp {
    private Map<String, Contact> contacts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBookApp app = new AddressBookApp();
        app.run();
    }

    public void run() {
        int choice;
        do {
            printMenu();
            choice = getInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    printAllContacts();
                    break;
                case 6:
                    System.out.println("Exiting Address Book");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }

    private void printMenu() {
        System.out.println("\n  Address Book Menu ");
        System.out.println("1. Add Contact");
        System.out.println("2. Update Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Search Contact");
        System.out.println("5. Print All Contacts");
        System.out.println("6. Exit");
    }

    private void addContact() {
        System.out.println("\n Add Contact ");
        String name = getString("Enter name: ");
        String phone = getString("Enter phone number: ");
        String email = getString("Enter email: ");
        contacts.put(name.toLowerCase(), new Contact(name, phone, email));
        System.out.println("Contact added successfully");
    }

    private void updateContact() {
        System.out.println("\n Update Contact");
        String name = getString("Enter name to update: ");
        Contact contact = contacts.get(name.toLowerCase());
        if (contact != null) {
            String newPhone = getString("Enter new phone number: ");
            String newEmail = getString("Enter new email: ");
            contact.setPhoneNumber(newPhone);
            contact.setEmail(newEmail);
            System.out.println("Contact updated");
        } else {
            System.out.println("Contact not found");
        }
    }

    private void removeContact() {
        System.out.println("\n Remove Contact ");
        String name = getString("Enter name to remove: ");
        Contact removed = contacts.remove(name.toLowerCase());
        if (removed != null) {
            System.out.println("Contact removed.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private void searchContact() {
        System.out.println("\n Search Contact ");
        String name = getString("Enter name to search: ");
        Contact contact = contacts.get(name.toLowerCase());
        if (contact != null) {
            System.out.println("Found: " + contact);
        }
        else {
            System.out.println("Contact not found");
        }
    }

    private void printAllContacts() {
        System.out.println("\n All Contacts ");
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
        } else {
            for (Contact contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }

    private String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private int getInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
