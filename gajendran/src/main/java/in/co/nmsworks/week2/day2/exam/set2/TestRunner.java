package in.co.nmsworks.week2.day2.exam.set2;

import java.io.FilterOutputStream;


public class TestRunner {


    public static long findAverageSalary(Intern[] obj) {
        int total = 0;
        int averageSalary = 0;
        for (Intern i : obj) {
            total += i.getSalary();
            averageSalary = i.getCountIntern();
        }

        return (averageSalary / total);
    }



    public static String[] splitStatements(String paragraph) {
        for (String i : paragraph.split("\\.")) {
            System.out.println(i.trim());
        }
        return paragraph.split("\\.");


    }

    public static int[] splitWords(String[] statements) {
        int[] result = new int[3];
        result[0] = statements.length;
        int countOfWord = 0;
        int countOfLetters = 0;

        for (String i : statements) {
            String[] words = i.split(" ");
            for (String j : words) {
                countOfLetters += j.trim().length();
            }
            countOfWord += words.length;
        }
        result[1] = countOfWord - 1;
        result[2] = countOfLetters;
        return result;
    }


    public static void main(String[] args) {
        String str = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";
        String input2 = "Alice went to the market to buy fresh apples. Bob followed her. They chatted along the way.";
        int[] result = splitWords(splitStatements(str));

        for (int i : result) {
            System.out.println(i);
        }

        Intern i1 = new Intern(20000, "gajendran");
        Intern i2 = new Intern(20000, "Alwin");
        Intern i3 = new Intern(20000, "hari");
        Intern i4 = new Intern(20000, "Ayyappan");
        Intern i5 = new Intern(40000, "Santhosh");
        Intern i6 = new Intern(40000, "Deva");

        Intern[] interns = new Intern[]{i1, i2, i3, i4, i5, i6};

        System.out.println("average salary");
        System.out.println(i4.getCountIntern());
        System.out.println(findAverageSalary(interns));

    }

}
