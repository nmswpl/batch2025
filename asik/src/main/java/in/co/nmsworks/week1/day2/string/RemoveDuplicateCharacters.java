package in.co.nmsworks.week1.day2.string;

/*
7. Write a Java program to remove duplicate characters from a string while preserving the order of the first occurrences.
*/
class RemoveDuplicateCharacters {
    public static void main(String[] args)
    {
        String str = "aabbcc";
        removeDuplicateChars(str);
    }
    public static void removeDuplicateChars(String str)
    {
        String uniqueChars = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(!uniqueChars.contains(str.substring(i, i+1)))
            {
                uniqueChars += str.substring(i, i+1);
            }
        }
        System.out.println(uniqueChars);
    }
}
