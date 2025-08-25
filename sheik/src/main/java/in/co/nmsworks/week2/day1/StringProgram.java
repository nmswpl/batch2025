package in.co.nmsworks.week2.day1;

public class StringProgram
{
    public static void main(String[] args) {
        charAtIndex("NMSWorks" , 5);
        lengthOfString("OpenAI");
        printSubString("Java Programming" , 5);
        printSubStringOfRange("welcome to java" , 11 ,15);
        checkChar("Java programming" , "prog");
        checkEquals("Hello" , "hello");
        emptyOrNot(" ");
        concatString("Hello" , "World");
        replaceChar("banana" , 'a', 'o');
        chechEqualIgnoreCase("HELLO" , "hello");
        splitString("one,two,threee");
        splitStringWithLimit("one;two;three;four" , 3);
        findChar("Programming");
        findChartFromIndex("welcome to the world" , 10);
        charToLowerCase("Java Programming");
        charToUpperCase("welcome to java");
        intToString(1234);
        joinString();
    }

    public static void charAtIndex(String str , int index)
    {
        System.out.println(str.charAt(index));

    }

    public static void lengthOfString(String str1){
        System.out.println(str1.length());
    }

    public static void printSubString(String str2, int index1){
        System.out.println(str2.substring(index1));
    }

    public static void printSubStringOfRange(String str3 , int start , int end){
        System.out.println(str3.substring(start,end));
    }

    public static void checkChar(String str4 ,String str5){
        if(str4.contains(str5)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }

    public static void checkEquals(String str6, String str7){
        if(str6.equals(str7)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }

    public static void emptyOrNot(String str8){
        if(str8.length()>0){
            System.out.println("not empty");
        }
        else{
            System.out.println("empty");
        }
    }

    public static void concatString(String str9 , String str10){
        System.out.println(str9.concat(str10));
    }

    public static void replaceChar(String str11,char old ,char modify){
        System.out.println(str11.replace(old, modify));
    }

    public static void chechEqualIgnoreCase(String str12 , String str13){
        if(str12.equalsIgnoreCase(str13)){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }
    }

    public static void splitString(String str14){
        String zs[] = str14.split(",");
        for(int i=0;i<zs.length;i++){
            System.out.println(zs[i]);
        }
    }

    public static void splitStringWithLimit(String str15 , int limit){

        String zs[] = str15.split(";" , 3);
        for(int i=0;i<zs.length;i++){
            System.out.println(zs[i]);
        }
    }

    public static void findChar(String str16){
        System.out.println(str16.indexOf('g'));
    }

    public static void findChartFromIndex(String str17 , int from){
        System.out.println(str17.indexOf("the",from));
    }

    public static void charToLowerCase(String str18){
        System.out.println(str18.toLowerCase());
    }

    public static void charToUpperCase(String str19){
        System.out.println(str19.toUpperCase());
    }

    public static void intToString(int num){
        System.out.println(String.valueOf(num));
    }

    public static void joinString(){
        System.out.println(String.join("-" , "apple" , "banana" , "orange"));
    }

}
