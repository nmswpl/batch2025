package in.co.nmsworks.week2.day2;

 abstract class Animal {
       abstract void makeSound();
}

class Dog extends Animal {
     @Override
     void makeSound() {
        System.out.println("Bark");

    }

}
public class AnimalClass{
    public static void main(String[] args) {
         Dog d = new Dog();
         d.makeSound();
    }
}

