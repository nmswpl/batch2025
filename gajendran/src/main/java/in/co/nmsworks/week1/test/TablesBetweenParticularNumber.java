package in.co.nmsworks.week1.test;

public class TablesBetweenParticularNumber {

    public static void printTableBetweenParticularNumber(long table,long start, long end){

        long inc = 1;
        boolean flag = false;
        for(long i = start; i <= end; i += inc){


            System.out.println(i + " X " + table + " = " + i * table);

        }

    }

}
