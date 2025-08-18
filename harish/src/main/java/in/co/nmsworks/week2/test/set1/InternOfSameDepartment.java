package in.co.nmsworks.week2.test.set1;

public class InternOfSameDepartment {

    public static void main(String[] args) {
        Intern intern1 = new Intern("Harish","Developer");
        Intern intern2 = new Intern("Kanagavel","Tester");
        Intern intern3 = new Intern("Kabilan","Tester");
        Intern intern4 = new Intern("kabil","Developer");

        Intern[] internArray = {intern1,intern2,intern3,intern4};
        int[] internIndicies = sameDepartmentIntern(internArray,"Developer");
        for (int internIndicy : internIndicies) {
            System.out.println("The indexes of same department are "  + internIndicy);
        }

    }

    private static int[] sameDepartmentIntern(Intern[] internArray, String department) {
        int[] indexValues =new int[5];
        int j = 0;
        for (int i = 0 ; i < internArray.length ; i++) {
            System.out.println(internArray[i].getDept());
            if (internArray[i].getDept().equalsIgnoreCase(department)){
                indexValues[j] = i;
                j++;
                System.out.println(i);
            }
        }
        return indexValues;
    }
}
