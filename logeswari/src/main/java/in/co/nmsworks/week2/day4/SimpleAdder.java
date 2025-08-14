package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence{
    int des=4;
    @Override
    public int sequence(int number) {
        if(des>number){
            number++;
            System.out.println(number);

        }
        return number;
    }
}
