package in.co.nmsworks.week5.day2;

import java.util.Scanner;

public class UserInterface
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        UserInterface ui = new UserInterface();
        ui.choice();
    }

    private  void choice() {
        System.out.println("Welcome to Phone Book Management\n");

        while (true)
        {
            System.out.println("Please Choice any option give Below\n");
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
        DBConnection dbc = new DBConnection();
        dbc.listFromDb();
    }

    private void searchContact()
    {
        DBConnection dbc = new DBConnection();
        dbc.searchOnDB();
    }

    private void updateContact()
    {


    }

    private void removeContact()
    {


    }

    private void addContact()
    {
//        sc.nextLine();
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the Mob Number");
        long mob = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the Email");
        String email = sc.nextLine();

        contact pbm = new contact(name,mob,email);

        DBConnection dbc = new DBConnection();

        int num = dbc.addToDB(pbm);
        if(num>0)
        {
            System.out.println("Contact added SucessFully");
        }

    }
}
