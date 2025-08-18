package in.co.nmsworks.week2.test.even;
//Question 2
public class Intern {
        private String name;
        private double salary;

        public Intern(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() {

            return salary;
        }

        public String getName() {

            return name;
        }

        public static double calculateAverageSalary(Intern[] interns) {
            if (interns == null || interns.length == 0) {
                System.out.println("No interns provided.");
                return 0.0;
            }

            double totalSalary = 0.0;
            for (Intern intern : interns) {
                totalSalary += intern.getSalary();
            }

            return totalSalary / interns.length;
        }
        public static void main(String[] args) {
            Intern[] interns = {
                    new Intern("Alice", 3000),
                    new Intern("Bob", 3500),
                    new Intern("Charlie", 3200),
                    new Intern("Diana", 3100)
            };

            double avgSalary = calculateAverageSalary(interns);
            System.out.println("Average Salary of Interns" + avgSalary);
        }

    }


