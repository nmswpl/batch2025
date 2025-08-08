package in.co.nmsworks.week1.day2.string;

/*
5. print each sentence in the given paragraph in a new line.
*/
class PrintEachSentence {
    public static void main(String[] args)
    {
        String str = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        printAsSentences(str);
    }
    public static void printAsSentences(String str)
    {
        int startIndex = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '.')
            {
                System.out.println(str.substring(startIndex, i+1).trim());
                startIndex = i+1;
            }
        }
    }
}
