package in.co.nmsworks.week5.day2;

import java.util.*;

public class AccessAddress
{

    Map<String , List<Contact>> bookMap = new HashMap<>();

    public void commonMethod()
    {
        while(true)
        {
            System.out.println("**************************************************************************************************");
            System.out.println("Enter 1 for add Address \t Enter 2 for remove Address \t Enter 3 for update Address");
            System.out.println("Enter 4 for search Address \t Enter 5 for print Address \t Enter 0 for exit");
            System.out.println("**************************************************************************************************");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your option : ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0)
            {
                return;
            }
            else if (input == 1)
            {
                System.out.println("Enter Name : ");
                String name = scanner.nextLine();
                System.out.println("Enter Phone number : ");
                String phNumber = scanner.nextLine();
                System.out.println("Enter Email : ");
                String email = scanner.nextLine();

                addBook(name , phNumber , email);
            }
            else if (input == 2)
            {
                System.out.println("Enter the name do you want to remove : ");
                String name = scanner.nextLine();
                removeAddress(name);
            }
            else if (input ==3)
            {
                System.out.println("Enter the name do you want to update : ");
                String name = scanner.nextLine();
                updateAddress(name);
            }
            else if (input == 4)
            {
                System.out.println("Enter name to search : ");
                String name = scanner.nextLine();
                searchAddress(name);
            }
            else if (input == 5)
            {
                printAdress();
            }
            else
            {
                System.out.println("Enter valid option");
            }
        }
    }

    private void addBook(String name, String phNumber, String email)
    {
        Contact contactDetail = new Contact(name , phNumber , email );

        String key = String.valueOf(name.trim().toUpperCase().charAt(0));
        if (!(bookMap.containsKey(key)))
        {
            bookMap.put(key,new ArrayList<>());
        }
        if (bookMap.get(key).add(contactDetail))
        {
            System.out.println("Details Added in Map");
        }
    }

    public void removeAddress(String name)
    {
        List<Contact> nameWiseContactList = bookMap.get(String.valueOf(name.trim().toUpperCase().charAt(0)));

        if (nameWiseContactList.isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        for (Contact contact : nameWiseContactList)
        {
            if (contact.getName().equalsIgnoreCase(name))
            {
                nameWiseContactList.remove(contact);
                System.out.println(contact + " Object removed from list");
                break;
            }
        }
    }

    public void updateAddress(String name)
    {
        List<Contact> nameWiseContactList = bookMap.get(String.valueOf(name.trim().toUpperCase().charAt(0)));

        System.out.println("********************************************************************************************");
        System.out.println("Enter 1 for update name \t Enter 2 for update phone Number \t Enter 3 for update email ");
        System.out.println("********************************************************************************************");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.nextLine();

        if (value == 1)
        {
            System.out.println("Enter update name  : ");
            String updateName = scanner.nextLine();
            int count = 0;

            for (Contact contact : nameWiseContactList)
            {
                if (contact.getName().equalsIgnoreCase(name))
                {
                    addBook(updateName,contact.getPbNumber(),contact.getEmail());
                    removeAddress(name);

                    System.out.println("Name Updated");
                    count++;
                    break;
                }
            }
            validateName(count);
        }
        else if (value == 2)
        {
            System.out.println("Enter update number  : ");
            String updateNumber = scanner.nextLine();
            int count = 0;
            for (Contact contact : nameWiseContactList) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    contact.setName(updateNumber);
                    System.out.println("Number Updated");
                    count++;
                    break;
                }
            }
            validateName(count);
        }
        else if (value == 3)
        {
            System.out.println("Enter update email  : ");
            String updateEmail = scanner.nextLine();
            int count = 0;
            for (Contact contact : nameWiseContactList) {
                if (contact.getEmail().equalsIgnoreCase(name)) {
                    contact.setEmail(updateEmail);
                    System.out.println("Email Updated");
                    count++;
                    break;
                }
            }
            validateName(count);

        }

    }

    public void searchAddress(String name)
    {
        List<Contact> nameWiseContactList = bookMap.get(String.valueOf(name.trim().toUpperCase().charAt(0)));

        int count = 0;
        for (Contact contact : nameWiseContactList)
        {
            if (contact.getName().equalsIgnoreCase(name))
            {
                System.out.println(contact);
                count++;
            }
        }
        validateName(count);
    }

    public void printAdress()
    {
        System.out.println(bookMap);
    }


    private void validateName(int count)
    {
        if (count == 0)
        {
            System.out.println("Enter valid Email ");
        }
    }

}
