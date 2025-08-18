package in.co.nmsworks.week2.exam.set1;

public class TestRunner {
    public TestRunner() {

    }

    public static void main(String[] args) {
        new TestRunner().convertTitleCase("java programming hello world");
        new TestRunner().printIntern();
    }




    public void convertTitleCase(String str) {
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

    public void printIntern() {
        Intern i1 = new Intern("mathi","dev");
        Intern i2 = new Intern("madan","dev");
        Intern i3 = new Intern("subash","dev");
        Intern[] intern = new Intern[] {i1,i2,i3};
        for(int i=0;i<intern.length;i++)
        {
            System.out.println(i);
        }


    }

}
class Intern
{
    String name;
    String dept;

    public Intern(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

}
