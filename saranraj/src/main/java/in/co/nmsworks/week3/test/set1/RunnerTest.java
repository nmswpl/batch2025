package in.co.nmsworks.week3.test.set1;

public class RunnerTest {

    public static void main(String[] args) {

        Intern[] intern = new Intern[]{
                new Intern("ashik","CSE"),
                new Intern("saran","IT"),
                new Intern("Tharun","IT"),
                new Intern("Harish","CSE"),
                new Intern("Kabil","IT")

        };
        int[] indices =printIndexOfGivenDepartment(intern,"IT");
        for (int i : indices) {
            System.out.println(i);
        }

        String str ="Alice went to the market to buy fresh apples. Bob followed her. They chatted along the way.";
        displayFirstCharacterAsCaptial(str);
    }

    private static void displayFirstCharacterAsCaptial(String str) {
        String[] words=str.split(" ");
        String displayFirstLetterAsCaptial="";
        for (String word: words) {
            String first =word.substring(0,1).toUpperCase();
            String second =word.substring(1).toLowerCase();
            String combineWords =first+second;
            displayFirstLetterAsCaptial+=first + second+" ";
        }
        System.out.println(displayFirstLetterAsCaptial);
    }

    private static int[] printIndexOfGivenDepartment(Intern[] intern,String department) {

          int[] indices = new int[intern.length];

          int index=0;
          for (int i=0; i<intern.length;i++) {
              if (intern[i].getDepartment().equals(department)) {
                  indices[index++]=i;
              }
          }
         return indices;
    }
}
