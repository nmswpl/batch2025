package in.co.nmsworks.week5.day2;

import java.util.*;

public class ContactRunner
{

    Map<String, List<contact>> contactMap = new HashMap<>();

    List<contact> contactList = new ArrayList<>();

    Scanner sc =  new Scanner(System.in);

    public static void main(String[] args)
    {
        ContactRunner pdr = new ContactRunner();
        pdr.choice();
    }

    private void choice()
    {
        System.out.println("Welcome to Phone Book Management\n");

        while (true)
        {
            System.out.println("Please Choice any option given below\n");
            System.out.println("1.Add Contact\n2.Remove Contact\n3.Update Contact\n4.Search Contact By Name\n5.List the Contacts\n6.Exit\n");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    listTheContact();
                    break;
                case 6:
                    System.out.println("Thanks for Using the Application");
                    return;
            }

        }
    }

    private void listTheContact()
    {
        if(contactMap.isEmpty())
        {
            System.out.println("The Address Book is Empty");
        }
        for (Map.Entry<String, List<contact>> entry : contactMap.entrySet()) {
            System.out.println(entry);
        }
    }

    private void searchContact()
    {
        sc.nextLine();
        System.out.println("Enter the Name to Search");
        String name1 = sc.nextLine();
        String name2 = name1.substring(0,1);

        List<contact> contactList1 = new ArrayList<>();

        for (Map.Entry<String, List<contact>> entry : contactMap.entrySet())
        {
            for (contact contact : entry.getValue())
            {
                if(contact.getName().equalsIgnoreCase(name1))
                {
                    contactList1.add(contact);
                }
            }

        }
        if(contactList1.isEmpty())
        {
            System.out.println("Contact not found");
        }
        else
        {
            for (contact contact : contactList1) {
                System.out.println(contact);
            }
        }

    }

    private void updateContact()
    {
        sc.nextLine();
        System.out.println("Enter the Name to get Updated ");
        String name = sc.nextLine();
        System.out.println("Enter the new phone number");
        long phone = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the new Email");
        String email = sc.nextLine();

        for (Map.Entry<String, List<contact>> entry : contactMap.entrySet())
        {
            for (contact contact : entry.getValue())
            {
                if(contact.getName().equalsIgnoreCase(name))
                {
                    contact.setMobNumber(phone);
                    contact.setEmail(email);
                }

            }

        }
        System.out.println("Updated Map\n");
        System.out.println(contactMap);

    }

    private void removeContact() {
        sc.nextLine();
        if (contactMap.isEmpty()) {
            System.out.println("Cant Remove Contact.The Map is Already Empty ");
        }
        else
        {
            System.out.println("Enter the Name to be Removed");
        String name = sc.nextLine();
        boolean removed = false;
        for (Map.Entry<String, List<contact>> entry : contactMap.entrySet())
        {
            List<contact> toRemove = new ArrayList<>();
            for (contact contact : entry.getValue())
            {
                if (contact.getName().equalsIgnoreCase(name))
                    toRemove.add(contact);
            }
            if (entry.getValue().removeAll(toRemove))
                removed = true;
        }
        if (removed) {
            System.out.println("Map After Removal\n");
            System.out.println(contactMap);
        }
        else
        {
            System.out.println("Contact not found");
        }
    }

    }

    private void addContact()
    {
        sc.nextLine();
        System.out.println("Enter the Name");
        String name1 = sc.nextLine();
        System.out.println(name1);
        System.out.println("Enter the Mob Number");
        long mob = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the Email");
        String email = sc.nextLine();

        String name2 = name1.substring(0,1);

        System.out.println(contactMap.computeIfAbsent(name2, k -> new ArrayList<>()).add(new contact(name1,mob,email)));

    }
}

