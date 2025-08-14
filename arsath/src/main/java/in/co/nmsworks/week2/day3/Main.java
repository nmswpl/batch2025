package in.co.nmsworks.week2.day3;

interface MarkerInterface {

}


class Member implements MarkerInterface {
    public Member() {
        System.out.println("Member object created");
    }
}

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

        if (member instanceof MarkerInterface)
            System.out.println("Member is instance of marker interface");
        else
            System.out.println("Member is not an instance of marker interface");


        if (animal instanceof MarkerInterface)
            System.out.println("Animal is instance of marker interface");
        else
            System.out.println("Animal is not an instance of marker interface");
    }
}
