package in.co.nmsworks.week1.day2.strings;
//5.print each sentence in the given paragraph in a new line.
public class SplitSentence {
    public static void main(String[] args) {
       printSplitSenetence();
    }
    public static void  printSplitSenetence(){
        String paragraph="The early morning sun cast a golden hue over the quiet village, where the scent\n" +
                "of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered\n" +
                "through the canopy of ancient oak trees, the streets began to stir with the soft chatter of\n" +
                "locals preparing for the day ahead. Children darted around with laughter, their voices a\n" +
                "cheerful contrast to the serene landscape. In the heart of the village, the old bakery's\n" +
                "doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising\n" +
                "a comforting start to the day for everyone within reach.";
        String sentence="";
        for(int i=0;i<paragraph.length();i++){
            char ch=paragraph.charAt(i);
            sentence=sentence+ch;
            if(ch=='.'){
                System.out.println(sentence.trim());
                sentence="";
            }
        }
    }
}
