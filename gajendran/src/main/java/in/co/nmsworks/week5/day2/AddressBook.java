package in.co.nmsworks.week5.day2;


import java.util.*;

public class AddressBook
{
    Map<Character, List<Contact>> contacts = new HashMap<>();

    public void addContact(char alp, Contact contact)
    {
        if (contacts.get(alp) == null)
        {
            List<Contact> temp = new ArrayList<>();
            temp.add(contact);
            contacts.put(alp,temp);
        }
        else
        {
            List<Contact> temp = contacts.get(alp);
            temp.add(contact);
            System.out.println(temp);
            contacts.replace(alp,temp);
        }
    }
    
    public boolean removeContact(char alp, String name)
    {
        if (contacts.get(alp) == null)
            return false;
        for (Contact contact : contacts.get(alp))
            if (contact.getName().equalsIgnoreCase(name))
            {
                System.out.println(contact);
                contacts.get(alp).remove(contact);
                if (contacts.get(alp).isEmpty())
                    contacts.remove(alp);
                return true;
            }


        return false;
    }
    
    public boolean printAllContacts()
    {
        if (contacts.isEmpty())
            return false;

        for (Map.Entry<Character, List<Contact>> alphabetListEntry : contacts.entrySet())
        {
            System.out.println("List for "+Character.toUpperCase(alphabetListEntry.getKey())+"\n");
            for (Contact contact : alphabetListEntry.getValue())
            {
                System.out.println(contact);
            }
            System.out.println();
        }
        return true;
    }

    public boolean searchContact(char alp, String name)
    {
        if (contacts.get(alp) == null)
            return false;

        for (Contact contact : contacts.get(alp))
        {
            if (contact.getName().equalsIgnoreCase(name))
            {
                System.out.println(contact);
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(char alp, String oldName, String newName, long number, String email)
    {
        if (contacts.get(alp) == null)
            return false;

        for (Contact contact : contacts.get(alp))
        {
            if (contact.getName().equalsIgnoreCase(oldName))
            {
                contact.setName(newName);
                contact.setEmail(email);
                contact.setNumber(number);

                return true;
            }
        }

        return false;
    }
}
