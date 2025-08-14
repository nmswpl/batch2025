package in.co.nmsworks.week2.day2;

public abstract class Animal {

    abstract String makeSound();

}
 class Dog extends Animal{

    @Override
    String makeSound() {
        System.out.println("Bark");
        return "its a dog class";
    }

    public static void main(String[] args) {
        Dog animal=new Dog();
       System.out.println(animal.makeSound());
    }
}
