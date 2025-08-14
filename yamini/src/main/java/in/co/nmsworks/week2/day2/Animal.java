package in.co.nmsworks.week2.day2;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
public abstract class Animal {
    public abstract String makeSound();

}
class Dog extends Animal{
    @Override
    public String makeSound() {
        return "Bark";
    }
}
class Cat extends Animal{
    @Override
    public String makeSound() {
        return "Meow";
    }
}

