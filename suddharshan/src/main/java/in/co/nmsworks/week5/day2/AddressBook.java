package in.co.nmsworks.week5.day2;

import java.util.*;

public class AddressBook {
    Map<String, List<Contact>> addressList = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while(true){
            System.out.print("Enter your choice: \n 1. Add Data \n 2. Remove Data \n 3. Update Data \n 4. Search Datum \n 5. Display Data (with first letter) \n 6. Display Address Book \n 7. Exit: ");
            int choice = sc.nextInt();
            if(choice == 1){
                addressBook.addBook();
            }
            else if (choice == 2) {
                addressBook.removeBook();
            }
            else if(choice == 3){
                addressBook.updateBook();
            }
            else if(choice == 4){
                addressBook.searchBook();
            }
            else if(choice == 5){
                addressBook.displayBooks();
            }
            else if(choice == 6){
                addressBook.printAddressBook();
            }
            else if(choice == 7){
                break;
            }
            else{
                System.out.println("Invalid choice entered! Try again!");
            }
        }
    }
    public void addBook(){
        System.out.println("Enter Name to add: ");
        String name = sc.next();
        System.out.println("Enter Mobile No to add: ");
        int mobile = sc.nextInt();
        System.out.println("Enter Email to add: ");
        String email = sc.next();
        Contact ad = new Contact(name,mobile,email);
        String firstLetter = name.substring(0,1).toUpperCase();
        if(addressList.containsKey(firstLetter)){
            List <Contact> updList = addressList.get(firstLetter);
            updList.add(ad);
            addressList.replace(firstLetter,updList);
            System.out.println("Data added!");
        }
        else{
            List <Contact> newList = new ArrayList<>();
            newList.add(ad);
            addressList.put(firstLetter,newList);
            System.out.println("Data added!");
        }
    }
    public void removeBook(){
        System.out.println("Enter Name to remove: ");
        String name = sc.next();
        String firstLetter = name.substring(0,1).toUpperCase();
        if(!addressList.containsKey(firstLetter)){
            System.out.println("No Data Found!");
        }
        else{
            List <Contact> addressData = addressList.get(firstLetter);
            int flag = 0;
            for (Contact addressDatum : addressData) {
                if(addressDatum.getName().equalsIgnoreCase(name)){
                    addressData.remove(addressDatum);
                    System.out.println("Data Removed!");
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("Data not found!");
            }
        }
    }
    public void updateBook(){
        System.out.println("Enter which name to be updated: ");
        String name = sc.next();
        String firstLetter = name.substring(0,1).toUpperCase();
        int flag = 0;

        if(!addressList.containsKey(firstLetter)){
            System.out.println("No data found!");
        }
        else{
            System.out.println("Which need to be updated: \n 1. Name \n 2. Mobile No \n 3. Email: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter the New Name: ");
                String newOne = sc.next();
                List <Contact> addressDatumList = addressList.get(firstLetter);
                for (Contact addressDatum : addressDatumList) {
                    if(addressDatum.getName().equalsIgnoreCase(name)){
                        flag = 1;
                        addressDatum.setName(newOne);
                        addressDatumList.set(addressDatumList.indexOf(addressDatum),addressDatum);
                        addressList.put(newOne.substring(0,1).toUpperCase(),addressDatumList);
                        System.out.println("Data updated!");
                    }
                }
                addressList.remove(firstLetter);
                if(flag==0){
                    System.out.println("Record not found!");
                }
            }
            else if(choice == 2){
                System.out.println("Enter the New Number: ");
                int newOne = sc.nextInt();
                List <Contact> addressDatumList = addressList.get(firstLetter);
                for (Contact addressDatum : addressDatumList) {
                    if(addressDatum.getName().equalsIgnoreCase(name)){
                        flag = 1;
                        addressDatum.setMobileNo(newOne);
                        addressDatumList.set(addressDatumList.indexOf(addressDatum),addressDatum);
                        addressList.put(firstLetter,addressDatumList);
                        System.out.println("Data updated!");
                    }
                }
                if(flag==0){
                    System.out.println("Record not found!");
                }
            }
            else if(choice == 3){
                System.out.println("Enter the New email: ");
                String newOne = sc.next();
                List <Contact> addressDatumList = addressList.get(firstLetter);
                for (Contact addressDatum : addressDatumList) {
                    if(addressDatum.getName().equalsIgnoreCase(name)){
                        flag = 1;
                        addressDatum.setEmail(newOne);
                        addressDatumList.set(addressDatumList.indexOf(addressDatum),addressDatum);
                        addressList.put(firstLetter,addressDatumList);
                        System.out.println("Data updated!");
                    }
                }
                if(flag==0){
                    System.out.println("Record not found!");
                }
            }
            else{
                System.out.println("Invalid Choice Opted!");
            }
        }
    }
    public void searchBook(){
        System.out.println("Enter name to be searched: ");
        String name = sc.next();
        int flag = 0;
        String firstLetter = name.substring(0,1).toUpperCase();
        if(!addressList.containsKey(firstLetter)){
            System.out.println("No Data Found!");
        }
        else{
            List <Contact> addressData = addressList.get(firstLetter);
            for (Contact addressDatum : addressData) {
                if(addressDatum.getName().equalsIgnoreCase(name)){
                    System.out.println("Data Found!");
                    System.out.println(addressDatum);
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("No Data Found!");
            }
        }
    }
    public void displayBooks(){
        System.out.println("Enter Start Letter of Name to be displayed: ");
        String firstLetter = sc.next();
        List <Contact> addressData = addressList.get(firstLetter.toUpperCase());
        if(addressData == null){
            System.out.println("No data found! ");
        }
        else{
            for (Contact addressDatum : addressData) {
                System.out.println(addressDatum);
            }
        }
    }
    public void printAddressBook(){
        if(addressList.isEmpty()){
            System.out.println("Address list is empty!");
        }
        else{
            for (Map.Entry<String, List<Contact>> stringListEntry : addressList.entrySet()) {
                System.out.println(stringListEntry.getKey()+ ": ");
                for (Contact addressDatum : stringListEntry.getValue()) {
                    System.out.println(addressDatum);
                }
            }
        }
    }
}
