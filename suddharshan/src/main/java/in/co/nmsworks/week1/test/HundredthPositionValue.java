package in.co.nmsworks.week1.test;

public class HundredthPositionValue {
    public static void main(String[] args) {
        int num = 542;
        getHundredthValue(num);
    }
    public static void getHundredthValue(int val){

        for(int i = 0; i < 2; i++){
            val = val /10;
        }
        String arr[] = new String[]{"Zero", "One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println(arr[val]);
    }
}
