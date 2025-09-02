package in.co.nmsworks.week5.day2;

import java.util.*;

public class AddressBookRunner {
    static Map<String,List<Contact>> data = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        AddressBookRunner addressBook = new AddressBookRunner();
        System.out.println("Enter Your Choice : ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter no of elements to be added : ");
                int num = scan.nextInt();
                while (num > 0) {
                    addressBook.addContact();
                    num--;
                }
            case 2:
                System.out.println("Enter the Contact Name : ");
                scan.nextLine();
                String peiyar = scan.nextLine();
                addressBook.removeContact(peiyar);
                break;
            case 3:
                addressBook.updateContact();
            case 4:
                System.out.println("Enter the Contact Name : ");
                scan.nextLine();
                String peiyar1 = scan.nextLine();
                addressBook.fetchContact(peiyar1);
        }
    }

    private void fetchContact(String peiyar1) {
        String key = peiyar1.substring(0,1).toUpperCase();
        if (!data.containsKey(key)){
            System.out.println("Contact Not available in the Address book.");
        }

        List<Contact> contacts = data.get(key);
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(peiyar1)){
                System.out.println("Contact Found");
                System.out.println(contact);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Contact Not found in the list");
        }

    }

    private void updateContact() {
    }

    private void removeContact(String peiyar) {
        String key = peiyar.substring(0,1).toUpperCase();
        if (!data.containsKey(key)){
            System.out.println("Contact Not available in the Address book.");
        }

        List<Contact> contacts = data.get(key);
        boolean removed = false;

        for (int i = 0 ; i < contacts.size() ; i++){
            if (contacts.get(i).getName().equalsIgnoreCase(peiyar)){
                contacts.remove(i);
                removed = true;
                break;
            }
        }

        if(removed){
            System.out.println("Contact Removed Successfully");
        } else{
            System.out.println("Contact Not found in the list");
        }
    }

    private void addContact() {
        Contact details = new Contact();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name : ");
        details.setName(scan.nextLine());
        System.out.println("Enter the number : ");
        details.setMobileNumber(scan.nextLong());
        System.out.println("Enter the email : ");
        scan.nextLine();
        details.setEmail(scan.nextLine());

        String key = details.getName().substring(0,1).toUpperCase();
        List<Contact> contact = data.getOrDefault(key, new ArrayList<>());
        contact.add(details);
        data.put(key, contact);
        System.out.println("Successfully Added \n");
    }
}
