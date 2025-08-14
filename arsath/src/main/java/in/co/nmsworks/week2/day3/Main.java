package in.co.nmsworks.week2.day3;

interface Serializable {
    // Marker Interface
}

// Define Person class that implements the marker interface
class Member implements Serializable {
    public Member() {
        System.out.println("Person object created");
    }
}

// Define Animal class does not implement marker interface
class Animal {
    public Animal() {
        System.out.println("Animal object created");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Member member = new Member();
        Animal animal = new Animal();

        if (member instanceof Serializable)
            System.out.println("Person is serializable");
        else
            System.out.println("Person is not serializable");


        if (animal instanceof Serializable)
            System.out.println("Animal is serializable");
        else
            System.out.println("Animal is not serializable");
    }
}
