package in.co.nmsworks.week2.test.set1;

public class TestRunner {
    public static String convertTitleCase(String str) {
        String res = "";
        String[] strArr = str.split(" ");
        for (String s : strArr) {
            res += s.substring(0,1).toUpperCase() + s.substring(1,s.length()).toLowerCase() + " ";

        }
        return res;
    }

    public static int[] printIndices(Intern[] interns) {
        int[] ans = new int[3];
        int j = 0;
        for(int i = 0 ; i < interns.length ; i++) {
            if(interns[i].getDept().equals("Dev")) {
                ans[j++] = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        String str1 = "This class should represent a drone device.";
//        System.out.println(convertTitleCase(str1));

        Intern intern1 = new Intern("Maha","Dev");
        Intern intern2 = new Intern("Lokeshwari","Dev");
        Intern intern3 = new Intern("Ramya","QA");
        Intern intern4 = new Intern("Elakkiya","QA");
        Intern intern5 = new Intern("Viji","Dev");

        Intern[] interns = {intern1,intern2,intern3,intern4,intern5};
        int[] res = printIndices(interns);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }





}
