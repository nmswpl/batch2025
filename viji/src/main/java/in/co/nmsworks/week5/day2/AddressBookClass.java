package in.co.nmsworks.week5.day2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookClass {

    static Scanner sc = new Scanner(System.in);
     List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {

        AddressBookClass abc = new AddressBookClass();

        System.out.println("......Contact details......");
        System.out.println("1.Add  contact details ");
        System.out.println("2.update contact details ");
        System.out.println("3.Delete Contact ");
        System.out.println("4.Search contacts");
        System.out.println("5.display all the contacts ");


        int num;
        do {
            System.out.println("Enter the number : ");
            num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    System.out.println("Enter the below details  to add :");
                    System.out.println("Enter the name :");
                    String name = sc.nextLine();
                    System.out.println("Enter the Phone Number: ");
                    long phone = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter the email: ");
                    String email = sc.nextLine();
                    abc.addContact(name, phone, email);
                    break;

                case 2:
                    System.out.println("Update contact");
                    System.out.println("Enter the name of the contact to edit :");
                    String name1 = sc.nextLine();
                    abc.updateContact(name1);
                    break;

                case 3:
                    System.out.println("Remove contact");
                    System.out.println("Enter the name to remove contact :");
                    String name2 = sc.nextLine();
                    abc.removeContact(name2);
                    break;

                case 4:
                    System.out.println("Search Contact");
                    System.out.println("Enter the name :");
                    String name3 = sc.nextLine();
                    abc.searchContact(name3);
                    break;

                case 5:
                    System.out.println("Display all the contacts");
                    abc.printContact();
                    break;

                default:
                    System.exit(0);
            }
        } while (num !=6 );
    }

    private void removeContact(String name) {
        if(contacts.isEmpty()){
            System.out.println("Contacts not present ");
        }
        for(int  i  = 0 ; i < contacts.size() ; i++) {
                if (contacts.get(i).getName().equals(name)){
                    contacts.remove(i);
                    System.out.println("contact removed successfully ");
                }
            }
    }

    private void printContact() {
        if(contacts.isEmpty()){
            System.out.println("No contacts yet");
        }
        else{
            for(Contact a : contacts){
                System.out.println(a);
            }
        }
    }

    private void searchContact(String name) {
        if(contacts.isEmpty() ){
            System.out.println("Contact not Found");
        }
      for(Contact a : contacts){
          if(a.getName().equals(name)){
              System.out.println("The phone number is : " + a.getPhoneNumber());
              System.out.println("The email is :" + a.getEmail());
              break;
          }
      }
    }

    private void updateContact(String name) {
        if(contacts.isEmpty() ){
            System.out.println("Contact not Found");
        }
        for(int i= 0 ; i<contacts.size() ; i++ ){
            if(contacts.get(i).getName().equals(name)){
                System.out.println("Enter the  new phone number : ");
                long phone = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the new email :");
                String email = sc.nextLine();
                System.out.println("Contact updated successfully");
            }

        }

    }

    public void  addContact(String name, long phone, String email){
       contacts.add(new Contact(name,phone,email));
       System.out.println("Contact added successfully ");
    }
}
