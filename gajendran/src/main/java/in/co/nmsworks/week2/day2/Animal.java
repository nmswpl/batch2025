package in.co.nmsworks.week2.day2;



abstract class Animal{

    public abstract void sound();

}


class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("bobo");
    }

}