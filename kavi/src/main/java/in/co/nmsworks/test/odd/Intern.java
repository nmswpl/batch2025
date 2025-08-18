package in.co.nmsworks.test.odd;

public class Intern {
        String name;
        String dept;

        public Intern(String name, String dept) {
            this.name = name;
            this.dept = dept;
        }

        public static int[] getIndicesByDept(Intern[] interns, String department){
            int count = 0;
            for (int i = 0; i < interns.length; i++) {
                if (interns[i].dept.equalsIgnoreCase(department)) {
                    count++;
                }
            }

            int[] indices = new int[count];

            int idx = 0;
            for (int i = 0; i < interns.length; i++) {
                if (interns[i].dept.equalsIgnoreCase(department)) {
                    indices[idx++] = i;
                }
            }

            return indices;
        }

        public static void main(String[] args) {
            Intern[] interns = {
                    new Intern("Alice", "HR"),
                    new Intern("Bob", "Tech"),
                    new Intern("Charlie", "HR"),
                    new Intern("David", "hr")
            };

            int[] hrIndices = getIndicesByDept(interns, "HR");


            System.out.println("Indices of interns in HR");
            for (int i : hrIndices) {
                System.out.println(i);
            }
        }



}
