package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence{
    int des=20;
    int store;

    @Override
    public int sequence(int number) {
        if(des>number){
         store=number;

        }
        System.out.println(store*number);
        System.out.println(number);
        return store*number;
    }

}
