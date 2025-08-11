package in.co.nmsworks.week1.test;

public class WordFound {
    public static void main(String[] args) {
        String getString = " this is java program" ;
        String searchWord = "program";
        findwordFirstAndLast(getString , searchWord);
    }

    public static void findwordFirstAndLast(String data ,String search)
    {
        int indexof = search.toLowerCase().indexOf(data.toLowerCase());
        System.out.println(search.charAt(0));
     //    System.out.println(search.charAt());
    }
}
