package in.co.nmsworks.week1.day2.string;

import java.sql.SQLOutput;

public class Runner
{
    public static void main(String[] args)
    {
        Candidate Stud1 = new Candidate(1 , "Fayas" , "abc@gamil.com" , "Dev");
        Candidate Stud2 = new Candidate(2 , "Sheik" , "bcd@gamil.com" , "QA");
        Candidate Stud3 = new Candidate(3 , "Vinoth" , "cde@gamil.com" , "dev");
        Candidate Stud4 = new Candidate(4 , "Harish" , "def@gamil.com" , "dev");
        Candidate Stud5 = new Candidate(5 , "Kabil" , "efg@gamil.com" , "QA");

        Candidate Stud6 = new Candidate();
        Stud6.setId(6);
        Stud6.setName("Tharun");
        Stud6.setEmail("mln@gmail.com");
        Stud6.setDept("Dev");

        Candidate Stud7 = new Candidate();
        Stud7.setId(7);
        Stud7.setName("Mathi");
        Stud7.setEmail("mln@gmail.com");
        Stud7.setDept("Dev");


        Candidate Stud8 = new Candidate();
        Stud8.setId(8);
        Stud8.setName("Kumar");
        Stud8.setEmail("mln@gmail.com");
        Stud8.setDept("Dev");


        Candidate Stud9 = new Candidate();
        Stud9.setId(9);
        Stud9.setName("Dinesh");
        Stud9.setEmail("mln@gmail.com");
        Stud9.setDept("Dev");


        Candidate Stud10 = new Candidate();
        Stud10.setId(9);
        Stud10.setName("Ragul");
        Stud10.setEmail("mln@gmail.com");
        Stud10.setDept("Dev");



        printStudInfo(Stud2);

        Planet planet1 = new Planet();
        planet1.setName("Mercury");
        planet1.setSize(3002);
        planet1.setColor("Grayish and rocky");
        planet1.setNoOfMoons(0);

        printPlanetInfo(planet1);


    }
        public static void printStudInfo(Candidate can) {
           System.out.print("id: "+ can.getId() + " name : " + can.getName() + " Email: " + can.getEmail()+ " dept:" +can.getDept());
        }

        public static void printPlanetInfo(Planet planet){
            System.out.print("Planet Name:" + planet.getName() + " Size :" + planet.getSize() + " Color : " + planet.getcolor() + " No on Moons : " + planet.getNoOfMoons());
        }
    }



