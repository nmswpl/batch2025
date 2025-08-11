package in.co.nmsworks.week1.day2.string;
/*

 */
public class EvenWords {
    public static void main(String[] args)
    {
        String givenString=" this is my name kabilku";
        evenWord(givenString);
    }
    public static void evenWord(String name)
    {
        String[] words=name.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
