package in.co.nmsworks.week1.day3;

public class TestRunner {
    public static void main(String[] args) {
        /*
        Candidate c1 = new Candidate();
        c1.setId(1);
        c1.setName("Arsath");
        c1.setEmail("arsathahameda@nmsworks.co.in");
        c1.setDepartment("CSE");

        Candidate c2 = new Candidate();
        c2.setId(2);
        c2.setName("Madhana Kumar");
        c2.setEmail("madhanakumart@nmsworks.co.in");
        c2.setDepartment("CSE");



        Candidate c3 = new Candidate(3, "Subash", "subashm@nmsworks.co.in" , "CSE");
        Candidate c4 = new Candidate(4, "Tharun", "tharun@nmsworks.co.in" , "CSE");
        Candidate c5 = new Candidate(5, "Harish", "harsih@nmsworks.co.in" , "IT");
        Candidate c6 = new Candidate(6, "Saranraj", "saranraj@nmsworks.co.in" , "IT");
        Candidate c7 = new Candidate(7, "Kabil", "kabil@nmsworks.co.in" , "CSE");
        Candidate c8 = new Candidate(8, "Kavi", "kavi@nmsworks.co.in" , "CSE");
        Candidate c9 = new Candidate(9, "Fiyas", "fiyas@nmsworks.co.in" , "IT");
        Candidate c10 = new Candidate(10, "Fayas", "fayas@nmsworks.co.in" , "IT");



        printCandidateDetails(c1);
        printCandidateDetails(c2);
        printCandidateDetails(c3);
        printCandidateDetails(c4);
        printCandidateDetails(c5);
        printCandidateDetails(c6);
        printCandidateDetails(c7);
        printCandidateDetails(c8);
        printCandidateDetails(c9);
        printCandidateDetails(c10);
    */

        Planet mercury = new Planet();
        mercury.setName("Mercury");
        mercury.setSize(3032);
        mercury.setColor("Greyish and Rocky");
        mercury.setNumberOfMoons(0);

        Planet venus = new Planet();
        venus.setName("Venus");
        venus.setSize(7520);
        venus.setColor("Yellowish and White");
        venus.setNumberOfMoons(0);

        Planet earth = new Planet("Earth", 7917,"Blue and Green", 1);
        Planet mars = new Planet("Mars", 4912, "red", 2);
        Planet jupyter = new Planet("Jupiter", 86881, "Brown with white clouds", 79);
        Planet saturn = new Planet("Saturn", 72366, "Yellowish with rings", 82);
        Planet uranus = new Planet("Uranus", 31518, "light blue/green", 27);
        Planet neptune = new Planet("Neptune", 30598, "Darke blue", 14);
        Planet pluto = new Planet("Pluto", 1473, "Brown and white with some red", 5);

        printPlanetDetails(mercury);
        printPlanetDetails(venus);
        printPlanetDetails(earth);
        printPlanetDetails(mars);
        printPlanetDetails(jupyter);
        printPlanetDetails(saturn);
        printPlanetDetails(uranus);
        printPlanetDetails(neptune);
        printPlanetDetails(pluto);
    }

    /*public static void printCandidateDetails(Candidate c1) {
        System.out.println("Candidate" + c1.getId() + " {" + " ID: " + c1.getId() + " " + "Name: " + c1.getName() + " " + "Email: " + c1.getEmail() + " " + "Department: " + c1.getDepartment() + " }");
    }*/

    public static void printPlanetDetails(Planet planet) {
        System.out.println("{" + " Name: " + planet.getName() + " "+ "\n Size: " + planet.getSize() + " " + "\n Color: " + planet.getColor() + " " + "\n Number of Moons: " + planet.getNumberOfMoons() + " } \n");
    }
}
