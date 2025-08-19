package in.co.nmsworks.week3.day1.exam.set1;

public class TitleCase {

        public static void main(String[] args) {
            convertTitleCase("java programming hello world");
        }

        public static void convertTitleCase(String str) {
            String result = "";
            String string1[] = str.split(" ");
            for(int i = 0;i<string1.length;i++)
            {
                String singleWord = string1[i];
                String firstLetter = singleWord.substring(0,1).toUpperCase();
                String remainingLetters = singleWord.substring(1).toLowerCase();
                result = result + firstLetter + remainingLetters+" ";
            }
            System.out.println(result.trim());

        }


    }


