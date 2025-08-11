package in.co.nmsworks.week2.day1;

public class StringPrograms {
    void printCharacter(){
        String input="NMSWorks";
        int index=5;
        System.out.println(input.charAt(index));
    }
    void printLengthOfTheString(){
        String input="OpenAi";
        System.out.println(input.length());
    }
    void printSubString(){
        String input="Java programming";
        int index=5;
        System.out.println(input.substring(index));
    }
    void printSubStringWithFromAndEndIndex(){
        String input="Welcome to Java";
        int beginIndex=11,endIndex=15;
        System.out.println(input.substring(beginIndex,endIndex));
    }
    void checkSubString(){
        String input="Java programming", subString="Prog";
        if(input.contains(subString.toLowerCase())){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }

    void joinMethod(){
        String[] inputArray={"apple", "banana","cherry" };
        String test=String.join(",",inputArray);
        System.out.println(test);
    }

    void compareTwoString(){
        String input1="hello";
        String comparableValue="Hello";
        if(input1.equals(comparableValue) ){
            System.out.println("It is Equal");
        }
        else{
            System.out.println("String not equal");
        }
    }


    void checkLength(){
        String input=" ";
        if(input.length()==0){
            System.out.println("Not Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }

    void concatMethod(){
        String firstWord = "Hello" , lastWord = " World";
        System.out.println(firstWord.concat(lastWord));
    }

    void replaceChar(){
        String input="banana";
        char replaceCharacter='o';
        System.out.println(input.replace('a','o'));
    }

    void equalIgnoreCaseMethod(){
        String firstWord = "hello" , lastWord = "HELLO";
        System.out.println(firstWord.equalsIgnoreCase(lastWord));
    }

    void splitMethod(){
        String input="one,two,three";
        String[] array=input.split(",");
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    void splitMethodWithLimit(){
        String input="apple;banana;cherry;date";
        String[] array=input.split(";",3);
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    void firstOccurence(){
        String input="programming";
        System.out.println(input.indexOf("p"));
    }

    void findSubStringIndex(){
        String input="welcome to the world" , subString="the";
        System.out.println(input.indexOf(subString,10));
    }

    void convertToLowerCase(){
        String input="Java Programming";
        System.out.println(input.toLowerCase());
    }

    void convertToUpperCase(){
        String input="welcome to Java";
        System.out.println(input.toUpperCase());
    }

    void intToString(){
        int input=1234;
        System.out.println(String.valueOf(input));
    }

    public static void main(String[] args) {

        StringPrograms stringmethods = new StringPrograms();

        stringmethods.printCharacter();
        stringmethods.printLengthOfTheString();
        stringmethods.printSubString();
        stringmethods.printSubStringWithFromAndEndIndex();
        stringmethods.checkSubString();
        stringmethods.joinMethod();
        stringmethods.compareTwoString();
        stringmethods.checkLength();
        stringmethods.replaceChar();
        stringmethods.concatMethod();
        stringmethods.equalIgnoreCaseMethod();
        stringmethods.splitMethod();
        stringmethods.splitMethodWithLimit();
        stringmethods.firstOccurence();
        stringmethods.findSubStringIndex();
        stringmethods.convertToLowerCase();
        stringmethods.convertToUpperCase();
        stringmethods.intToString();
    }
}
