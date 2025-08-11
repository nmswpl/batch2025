package in.co.nmsworks.week1.test;

public class Runner {

    public static void printPowerOfElement(int power, int[] base){
        PowerOF findPower = new PowerOF();
        for(int i = 0; i < base.length; i++){
            long result = findPower.powerOfGiven(power,base[i]);
            System.out.printf(base[i] + "^" +power+ " = " + result);
            System.out.println("");
        }

    }



    public static void printDigitOfTheValue(int value, int digit){
        PrintAPosition printingFistValue = new PrintAPosition();
        String result = printingFistValue.getPositionOfInteger(value,digit);
        System.out.println(result);
    }



    public static void printTableBetweenParticularNumber(long table,long start, long end){

        TablesBetweenParticularNumber firstTableToPrint = new TablesBetweenParticularNumber();
        firstTableToPrint.printTableBetweenParticularNumber(table,start,end);

    }

    public static void printMail(String mail) {

    }


/*

    public static void printDomainName(String email){

        ExtractTheDomainName splittingFirstDomainName = new ExtractTheDomainName();

    }
    public static void print(String mail)

*/

    public static void main(String[] args) {

        int[] inputArray = {2,3,4,5};
        printPowerOfElement(2,inputArray);


        printDigitOfTheValue(542, 3);    // 1 == one digit, 2 == 2nd digit , 3 == 3rd digit
        printDigitOfTheValue(765, 3);
        printDigitOfTheValue(765, 2);


        printTableBetweenParticularNumber(3,300,400);

        ExtractTheDomainName et = new ExtractTheDomainName();
        System.out.println(et.getDomainName("gajendran@gmail.com"));
    }



}
