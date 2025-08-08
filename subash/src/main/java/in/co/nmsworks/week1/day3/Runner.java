package in.co.nmsworks.week1.day3;

public class Runner {

    public static void main(String[] args) {

        Candidate candidate1 = new Candidate();
        candidate1.setId(1);
        candidate1.setName("Mohammed Ashik M");
        candidate1.setEmail("mohammedashik@gmail.com");
        candidate1.setDepartment("Developer");

        Candidate candidate2 = new Candidate();
        candidate2.setId(2);
        candidate2.setName("Suddharsan V");
        candidate2.setEmail("suddarsan@gmail.com");
        candidate2.setDepartment("Developer");

        Candidate candidate3 = new Candidate();
        candidate3.setId(03);
        candidate3.setName("Logeswari");
        candidate3.setEmail("Logeswari@gmail.com");
        candidate3.setDepartment("Developer");

        Candidate candidate4 = new Candidate();
        candidate4.setId(4);
        candidate4.setName("Anushiya Devi R");
        candidate4.setEmail("anushiyadevi@gmail.com");
        candidate4.setDepartment("Developer");

        Candidate candidate5 = new Candidate();
        candidate5.setId(5);
        candidate5.setName("Kavi M");
        candidate5.setEmail("kavim@gail.com");
        candidate5.setDepartment("Developer");

        Candidate candidate6 = new Candidate();
        candidate6.setId(6);
        candidate6.setName("Saran Raj I");
        candidate6.setEmail("saranraj@gmail.com");
        candidate6.setDepartment("Developer");

        Candidate candidate7 = new Candidate();
        candidate7.setId(7);
        candidate7.setName("Yamini S");
        candidate7.setEmail("yamini@gmail.com");
        candidate7.setDepartment("Developer");

        Candidate candidate8 = new Candidate();
        candidate8.setId(8);
        candidate8.setName("Sameera Banu");
        candidate8.setEmail("Sameerabanu@gmail.com");
        candidate8.setDepartment("Developer");

        Candidate candidate9 = new Candidate(9, "Tharunkumar", "tharunkumar@gmail.com", "Developer");

        Candidate candidate10 = new Candidate(10, "Mahalakhsmi", "mahalakshmim@gmail.com", "Developer");

        Candidate candidate11 = new Candidate(11, "Sheik Fayas", "fayas@gmail.com", "Developer");

        Candidate candidate12=new Candidate(12,"Madhan","madhan@gmail.com","Developer");

        //Runner.printCandidateDetails(candidate1);

        Planet mercury = new Planet();
        mercury.setName("Mercury");
        mercury.setSize(3032);
        mercury.setColor("Grayish and Rocky");
        mercury.setNoOfMoons(0);

        Planet venus = new Planet();
        venus.setName("Venus");
        venus.setSize(7520);
        venus.setColor("Yellowish-White");
        venus.setNoOfMoons(0);

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setSize(7917);
        earth.setColor("Blue And Green");
        earth.setNoOfMoons(1);

        Planet mars = new Planet();
        mars.setName("Mars");
        mars.setSize(4212);
        mars.setColor("Red");
        mars.setNoOfMoons(2);

        Planet jupiter = new Planet();
        jupiter.setName("Jupiter");
        jupiter.setSize(86881);
        jupiter.setColor("Brown With White Clouds");
        jupiter.setNoOfMoons(79);

        Planet saturn = new Planet();
        saturn.setName("Saturn");
        saturn.setSize(72366);
        saturn.setColor("Yellowish with Rings");
        saturn.setNoOfMoons(82);

        Planet uranus = new Planet("Uranus",31518,"Light/Blue green",27);

        Planet Neptune = new Planet("Neptune",30598,"Dark Blue",14);

        Planet pluto = new Planet("Pluto",1479,"Brown and white with some red",5);

        printPlanetDetails(venus);

    }

    public static void printCandidateDetails(Candidate candidate)
    {
        System.out.println("ID : "+candidate.getId());
        System.out.println("NAME : "+candidate.getName());
        System.out.println("EMAIL : "+candidate.getEmail());
        System.out.println("DEPARTMENT : "+candidate.getDepartment());
    }

    public static void printPlanetDetails(Planet planet)
    {
        System.out.println(" Plant : "+planet.getName()+"\n Size(Diameter in miles) : "+ planet.getSize()+"\n Color : "+ planet.getColor()+"\n Number of Moons : "+ planet.getNoOfMoons());
    }
}

