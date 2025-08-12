package in.co.nmsworks.week2.day2;

abstract public class Animal {
    abstract public void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
