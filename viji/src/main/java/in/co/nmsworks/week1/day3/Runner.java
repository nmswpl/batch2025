package in.co.nmsworks.week1.day3;

public class Runner {
    public static void main(String[] args) {

        Candidate vijayalakshmi = new Candidate();
        vijayalakshmi.setId(1);
        vijayalakshmi.setName("Vijayalakshmi");
        vijayalakshmi.setEmail("viji@gmail.com");
        vijayalakshmi.setDepartment("Developer");

        printCandidateInformation(vijayalakshmi);


        Candidate mohamedAsik = new Candidate();
        mohamedAsik.setId(2);
        mohamedAsik.setName("Mohammed Asik");
        mohamedAsik.setEmail("mohammed@gmail.com");
        mohamedAsik.setDepartment("Developer");

        printCandidateInformation(mohamedAsik);

        Candidate suddharsan = new Candidate();
        suddharsan.setId(3);
        suddharsan.setName("Suddharsan");
        suddharsan.setEmail("suddharsan@gmail.com");
        suddharsan.setDepartment("Developer");

        printCandidateInformation(suddharsan);

        Candidate madhanakumar = new Candidate();
        madhanakumar.setId(4);
        madhanakumar.setName("MadhanaKumar");
        madhanakumar.setEmail("madan@gmail.com");
        madhanakumar.setDepartment("Developer");

        printCandidateInformation(suddharsan);



        Candidate yamini = new Candidate(5, "yamini", "cde@gmail.com", "Developer");
        printCandidateInformation(yamini);

        Candidate sudharsan = new Candidate(6, "Sudharsan", "sudharsan@gmail.com", "Developer");
        printCandidateInformation(sudharsan);

        Candidate logeshwari = new Candidate(7, "Logeshwari", "logeshwari@gmail.com", "Developer");
        printCandidateInformation(logeshwari);

        Candidate anushyadevi = new Candidate(8, "Anushya Devi", "devi@gmail.com", "Developer");
        printCandidateInformation(anushyadevi);

        Candidate mahalakshmi = new Candidate(9, "maha", "mahalakshmi@gmail.com", "Developer");
        printCandidateInformation(mahalakshmi);

        Candidate kavi = new Candidate(10, "kavi", "kavi@gmail.com", "Developer");
        printCandidateInformation(kavi);

        Candidate tharunKumar = new Candidate(11, "TharunKumar", "tharun@gmail.com", "Developer");
        printCandidateInformation(tharunKumar);

        Candidate arshath = new Candidate(12, "arshath", "arshath@gmail.com", "Developer");
        printCandidateInformation(arshath);

        Candidate fayas = new Candidate(13, "fayas", "fayas@gmail.com", "Developer");
        printCandidateInformation(fayas);

        System.out.println();
        System.out.println();


        SolarSystem mercury = new SolarSystem();
        mercury.setPlanet("Mercury");
        mercury.setSize(3032);
        mercury.setColor("Grayish and rocky");
        mercury.setNoOfMoons(6);

        printPlanetInformation(mercury);


        SolarSystem venus = new SolarSystem();
        venus.setPlanet("Venus");
        venus.setSize(7917);
        venus.setColor("Blue and green");
        venus.setNoOfMoons(1);

        printPlanetInformation(venus);


        SolarSystem earth = new SolarSystem("Earth",7917,"Blue and green",1);
        printPlanetInformation(earth);

        SolarSystem mars = new SolarSystem("Mars",4212,"Red",2);
        printPlanetInformation(mars);

        SolarSystem jupiter = new SolarSystem("Jupiter",86881,"Brown with white clouds",79);
        printPlanetInformation(jupiter);

        SolarSystem saturn = new SolarSystem("Saturn",72366,"Yellowish with rings",82);
        printPlanetInformation(saturn);

        SolarSystem uranus = new SolarSystem("Uranus",31518,"Light blue/green",27);
        printPlanetInformation(uranus);

        SolarSystem neptune = new SolarSystem("Neptune",30598,"Dark blue",14);
        printPlanetInformation(neptune);

        SolarSystem pluto = new SolarSystem("Pluto",1473,"Brown and white with some red",5);
        printPlanetInformation(pluto);

    }

        public static void printCandidateInformation(Candidate candidate){
            System.out.println("ID : " + candidate.getId());
            System.out.println("Name : " + candidate.getName());
            System.out.println("Email :" + candidate.getEmail());
            System.out.println("Department :" + candidate.getDepartment());

        }

        public static void printPlanetInformation(SolarSystem solarsystem){
            System.out.println("Planet: " + solarsystem.getPlanet());
            System.out.println("Size: " + solarsystem.getSize());
            System.out.println("Color: " + solarsystem.getColor());
            System.out.println("Number Of Moons:" + solarsystem.getNoOfMoons());

        }


}
