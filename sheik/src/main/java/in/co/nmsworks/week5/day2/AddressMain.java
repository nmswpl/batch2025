package in.co.nmsworks.week5.day2;

import java.util.*;

public class AddressMain
{
    Scanner sc = new Scanner(System.in);
    Map<String  , List<Contact>> mapOfContact = new HashMap<>();

    public static void main(String[] args) {

        AddressMain book = new AddressMain();

        System.out.println("Press 1 to add \n Press 2 to Remove \n Press 3 to Search \n Press 4 to Update \n Press 5 to display \n Press 0 to Exit");
        System.out.println("Enter your choice");
        int choice = book.sc.nextInt();



        while(choice!=0){
            switch(choice){
                case 1:
                    book.addContact();
                    break;
                case 2 :
                    book.deleteContact(book.mapOfContact);
                    break;
                case 3:
                    book.searchContact(book.mapOfContact);
                    break;
                case  4:
                    book.updateContact(book.mapOfContact);
                    break;
                case  5:
                    book.display(book.mapOfContact);
                    break;
            }
            System.out.println("Enter your choice");
            choice = book.sc.nextInt();
        }

    }

    public void addContact(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name : ");
        String name = sc.nextLine();
        String ch = name.substring(0,1);
        System.out.println("Enter the Email : ");
        String email = sc.nextLine();
        System.out.println("Enter the Phone.no : ");
        String phone = sc.nextLine();

        mapOfContact.computeIfAbsent(ch , k ->new ArrayList<>()).add(new Contact(name,email,phone));

    }

    public void display(Map<String,List<Contact>> mapOfContact){
        for (Map.Entry<String, List<Contact>> stringListEntry : mapOfContact.entrySet()) {
            System.out.println(stringListEntry.getKey() + "->" + stringListEntry.getValue());
        }
    }

    public void deleteContact(Map<String,List<Contact>> mapOfContacts) {
        sc.nextLine();
        System.out.println("Enter the Name : ");
        String name = sc.nextLine();
        String firstChar = name.substring(0, 1);

        for (Map.Entry<String, List<Contact>> stringListEntry : mapOfContacts.entrySet()) {
            if (firstChar.equals(stringListEntry.getKey())){
                int count =0;
                for (Contact contact : stringListEntry.getValue()) {
                    if (name.equals(contact.getName())) {
                        stringListEntry.getValue().remove(count);
                        break;
                    }
                    count++;
                }
            }

        }


    }

    public void searchContact(Map<String ,List<Contact>>  mapOfContacts){
        sc.nextLine();
        System.out.println("Enter the Name : ");
        String name = sc.nextLine();
        String firstChar = name.substring(0, 1);

        for (Map.Entry<String, List<Contact>> stringListEntry : mapOfContacts.entrySet()) {
            if (firstChar.equals(stringListEntry.getKey())) {
                int count =0;
                for (Contact contact : stringListEntry.getValue()) {
                    if (name.equals(contact.getName())) {
                        System.out.println(stringListEntry.getKey() + "->" + stringListEntry.getValue().get(count));
                    }
                    count++;
                }
            }
        }
    }

    public void updateContact(Map<String ,List<Contact>>  mapOfContacts){

        System.out.println("Enter the Name : ");
        String name = sc.nextLine();
        String firstChar = name.substring(0, 1);
        System.out.println("Enter updating Value : ");
        String updatedValue = sc.nextLine();

        for (Map.Entry<String, List<Contact>> stringListEntry : mapOfContacts.entrySet()) {
            if (firstChar.equals(stringListEntry.getKey())) {
                int count =0;
                for (Contact contact : stringListEntry.getValue()) {
                    if (name.equals(contact.getName())) {
                        System.out.println(stringListEntry.getValue().get(count).);
                        //stringListEntry.getValue().get(count)
                    }
                    count++;
                }
            }
        }
    }
}
