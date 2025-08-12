package in.co.nmsworks.week2.day2;

public abstract class Animal {

    abstract void makeSound();

}
 class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog animal=new Dog();
//        System.out.println(animal.makeSound());
    }
}
