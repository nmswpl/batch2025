package in.co.nmsworks.week2.day2;

public abstract class Animal {

    public abstract String makeSound();

}

    class Dog extends Animal {

        public String makeSound() {
            return "Bark";
        }

}