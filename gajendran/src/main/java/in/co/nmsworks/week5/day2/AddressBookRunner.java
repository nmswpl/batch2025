package in.co.nmsworks.week5.day2;

import java.util.Scanner;

public class AddressBookRunner
{
    AddressBook addressBook = new AddressBook();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        AddressBookRunner addressBookRunner = new AddressBookRunner();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do
        {
            System.out.print("1.Add Contact\n2.Update Contact\n3.Remove Contact\n4.Search Contact\n5.Print All Contact\n6.Exit\n\nEnter Your Choice : ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                    addressBookRunner.addNewContact();
                    break;
                case 2:
                    addressBookRunner.updateAContact();
                    break;
                case 3:
                    addressBookRunner.removeContact();
                    break;
                case 4:
                    addressBookRunner.searchContact();
                    break;
                case 5:
                    addressBookRunner.printAllContact();
                    break;
                default:
                    choice = 6;
            }
        }while (choice != 6);
    }

    private void printAllContact()
    {
        System.out.println(addressBook.printAllContacts() ? "Successfully Printed All Contact." : "No contact in Address Book.");
    }

    private void searchContact()
    {
        System.out.print("Enter name :");
        String name = scanner.nextLine();

        name = checkName(name);
        if (name.isEmpty())
            return;

        System.out.println(addressBook.searchContact(name.charAt(0),name) ? "" : "No contact in this Name.");

    }

    private void removeContact()
    {
        System.out.print("Enter name :");
        String name = scanner.nextLine();

        name = checkName(name);
        if (name.isEmpty())
            return;

        System.out.println(addressBook.removeContact(name.charAt(0),name) ? "Successfully Removed." : "No contact in this Name.");
    }

    private void updateAContact()
    {
        System.out.print("Enter Old Name :");
        String oldName = scanner.nextLine();

        oldName = checkName(oldName);
        if (oldName.isEmpty())
            return;

        System.out.print("Enter name :");
        String name = scanner.nextLine();

        name = checkName(name);
        if (name.isEmpty())
            return;

        System.out.print("Enter Email : ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number :");
        long number = scanner.nextLong();
        scanner.nextLine();

        System.out.println(addressBook.updateContact(name.charAt(0), oldName, name, number, email)? "Successfully Updated." : "No contact in this Name.");
    }

    private void addNewContact()
    {
        System.out.print("Enter name :");
        String name = scanner.nextLine();

        name = checkName(name);
        if (name.isEmpty())
            return;

        System.out.print("Enter Email : ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number :");
        long number = scanner.nextLong();
        scanner.nextLine();

        addressBook.addContact(name.charAt(0),new Contact(name,number,email));
    }

    private String checkName(String name)
    {
        int check;
        while (name.isEmpty())
        {
            System.out.println("Enter the name properly.\n\n1,Retry\n2.Return\nEnter Your Choice : ");
            check = scanner.nextInt();
            scanner.nextLine();
            if (check != 1)
                return "";
            name = scanner.nextLine();
        }
        return name;
    }
}
