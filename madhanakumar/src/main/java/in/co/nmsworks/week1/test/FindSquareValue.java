package in.co.nmsworks.week1.test;

public class FindSquareValue {
    public void getSquareValue(int array1[]){
        for(int i = 0; i < array1.length ; i++){
            System.out.println("The Square Value of element "+ array1[i] + " = "+ array1[i]*array1[i]);
        }
    }

    public static void main(String[] args) {
        FindSquareValue sq = new FindSquareValue();
        int[] array = {2,4,3,5};
        sq.getSquareValue(array);
    }
}
