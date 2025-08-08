//Write a Java method to convert a every word in a sentance to title case, where the first letter of each word is capitalized.
package in.co.nmsworks.week1.day2.string;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        capitalizeFirstLetter("the quick brown fox jumps over the lazy dog");

    }

    public static void capitalizeFirstLetter(String input){
         String[] array=input.split(" ");
         String output="";
         for(int i=0;i<array.length;i++){
             output+=array[i].substring(0,1).toUpperCase()+array[i].substring(1,array[i].length())+" ";
         }
        System.out.println(output);;
    }
}
