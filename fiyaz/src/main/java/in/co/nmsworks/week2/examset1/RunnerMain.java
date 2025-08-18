package in.co.nmsworks.week2.examset1;

import static in.co.nmsworks.week2.examset1.TitleCase.str;

public class RunnerMain {
    public static void main(String[] args) {

        InternArray fiyaz = new InternArray("Fiyaz", "DEV");
        InternArray riyaz = new InternArray("Riyaz", "QA");
        InternArray ram = new InternArray("Ram", "QA");
        InternArray sam = new InternArray("Sam", "DEV");
        InternArray som = new InternArray("Som", "QA");


        InternArray[] arrOfIntern = new InternArray[] {fiyaz, riyaz, ram, sam, som};

        findTheIndices(arrOfIntern);


    }


    public static void findTheIndices( InternArray[] iarr) {

        for (int i = 0; i < iarr.length; i++) {
            if (iarr[i].equals("DEV")) {
                System.out.println(i);
            }

            if (iarr[i].equals("QA")) {
                System.out.println(i);
            }
        }


    }

}
