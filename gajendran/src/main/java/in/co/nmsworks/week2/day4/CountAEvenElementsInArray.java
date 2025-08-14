package in.co.nmsworks.week2.day4;

public class CountAEvenElementsInArray {

    public void printCountOfEvenElement(int[] array){

        int count = 0;

        for (int i : array){
            if (i % 2 == 0 && i != 0)
                count++;
        }

        System.out.println("There are "+count+ " even element in the given array");

    }

}
