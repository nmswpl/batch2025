package in.co.nmsworks.week2.day1;

public class StringPrograms {
    public static void main(String[] args) {
        StringPrograms programs = new StringPrograms();
        print();
        printingLen();
        printingSplit();
        printingCheck();
        printingCompare();
        printingCheckEmplty();
        printingUpper();
        printingReplace();
        printingSeperator();
        printingLoerCase();
        printingLastChar();
        printingJoining();
        printingIndexOfThe();
        printingUpperCase();
        printingConvertNumber();

    }

    private static void printingCheck() {
    }

    public static void print() {
        String input = "NMSWorks";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(5);
            System.out.println(ch);
        }

    }

    public static void printingLen() {
        String input = "OpenAi";
        int val;

        for (int i = 0; i < input.length(); i++) {
            System.out.println(i);

        }

    }

    public static void printingSplit() {
        String input = "Java Programming";

        String[] out = input.split(" ");
        System.out.println(out);
    }

//    public static void printingCompare() {
//        String input1 = "Hello";
//        String input2 = "hello";
//
//        if (input1.equals(input2)) {
//            System.out.println("equal");
//        }
//
//
//    }

    public static void printingCompare() {
        String input1 = "Hello";
        String input2 = "hello";

        if (input1.equals(input2)) {
            System.out.println("equal");
        }


//    public static void printingconvet() {
//        String input = "Welcome to Java";
//
//        String[] out=input.split(" ");
//        System.out.println(out);
//    }

//
//        public static void printingCheck(){
//            String input = "Java Programming";
//            if (input.contains("Prog")) {
//                System.out.println("found");
//            } else {
//                System.out.println("not found");
//            }
//
//
//        }


    }

    public static void printingCheckEmplty() {
        String input1 = "";


        if (input1.isEmpty()) {
            System.out.println("is emp:");
        }

    }

    public static void printingUpper() {
        String input1 = "hello";


        System.out.println(input1.toUpperCase());

    }

    public static void printingReplace() {
        String input1 = "banana";
//        String []input2 =input1[1].replace('a');

        System.out.println(input1.replace("a", "o"));

    }

    public static void printingSeperator() {
        String input1 = "one,two,three";
        int input2 = input1.codePointAt(3);


        System.out.println("seperator : " + input2);

    }

    public static void printingLoerCase() {
        String input1 = "Java Programming";

        System.out.println(input1.toLowerCase());

    }

    public static void printingLastChar() {
//        String[] input1 = new String[]{"Programming"};
//        for(int i=0;i<input1.length;i++) {
//            if ('g') continue;
//            System.out.println((input1));
//        }
////        System.out.println(input1.toString());
//
//    }
    }

    public static void printingJoining() {
        String result= String.join(",","apple","banana","cherry");

        System.out.println(result);

    }

    public static void printingIndexOfThe() {

        String str="welcome to the world";
        String sub="the";
        int index=str.indexOf(sub,10);
        System.out.println(index);

    }
    public static void printingUpperCase() {
        String input ="welcome to Java" ;
        System.out.println(input);

    }
    public static void printingConvertNumber() {
        int num=1234;
        String output =String.valueOf(num);
        System.out.println(output);

    }


}
