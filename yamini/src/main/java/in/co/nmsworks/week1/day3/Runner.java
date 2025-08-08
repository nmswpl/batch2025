package in.co.nmsworks.week1.day3;

public class Runner {
    public static void main(String[] args) {
        Candidate yamini = new Candidate(1, "Yamini", "yamini@123gmail.com", "IT");
        Candidate viji = new Candidate(2, "Viji", "viji@123gmail.com", "CSE");
        Candidate fayas = new Candidate(3, "Fayas", "fayas@123gmail.com", "IT");
        Candidate maha = new Candidate(4, "Maha", "maha@123gmail.com", "CSE");
        Candidate saran = new Candidate();
        saran.setId(5);
        saran.setName("SaranRaj");
        saran.setEmail("saran@gmail.com");
        saran.setDepartment("CSE");

        Candidate kabil = new Candidate();
        kabil.setId(6);
        kabil.setName("Kabil");
        kabil.setEmail("kabil@gmail.com");
        kabil.setDepartment("IT");

        Candidate kavi = new Candidate();
        kavi.setId(7);
        kavi.setName("Kavi");
        kavi.setEmail("kavi@gmail.com");
        kavi.setDepartment("CSE");

        Candidate logeshwari = new Candidate();
        logeshwari.setId(8);
        logeshwari.setName("Logeshwari");
        logeshwari.setEmail("logesh@gmail.com");
        logeshwari.setDepartment("IT");

        Candidate sudha = new Candidate();
        sudha.setId(9);
        sudha.setName("Sudharshan");
        sudha.setEmail("sudha@gmail.com");
        sudha.setDepartment("CSE");

        Candidate hari = new Candidate();
        hari.setId(10);
        hari.setName("Harish");
        hari.setEmail("hari@gmail.com");
        hari.setDepartment("IT");

        Candidate fiyaz = new Candidate(11, "Fiyaz", "fiyaz@123gmail.com", "IT");
        Candidate madhan = new Candidate(12, "Madhan", "madhan@123gmail.com", "CSE");
        Candidate ashik = new Candidate(13, "Aashiq", "aashiq@123gmail.com", "CSE");
        Candidate madhi = new Candidate(14, "Madhi", "madhi@123gmail.com", "CSE");
        Candidate subash = new Candidate(15, "Subash", "subash@123gmail.com", "IT");
        Candidate neha = new Candidate(16, "Neha", "neha@123gmail.com", "IT");

        printCandidateInfo(yamini);
        printCandidateInfo(viji);
        printCandidateInfo(fayas);
        printCandidateInfo(maha);
        printCandidateInfo(saran);
        printCandidateInfo(kavi);
        printCandidateInfo(kabil);
        printCandidateInfo(hari);
        printCandidateInfo(sudha);
        printCandidateInfo(logeshwari);
        printCandidateInfo(fiyaz);
        printCandidateInfo(ashik);
        printCandidateInfo(madhan);
        printCandidateInfo(madhi);
        printCandidateInfo(subash);
        printCandidateInfo(neha);

        SolarSystem mercury = new SolarSystem("Mercury", 3032, "Grayish and rocky", 0);
        printPlanetInfo(mercury);
        SolarSystem venus = new SolarSystem("Venus", 7520, "Yellowish and White", 0);
        printPlanetInfo(venus);
        SolarSystem earth = new SolarSystem("Earth", 7917, "Blue and Green", 1);
        printPlanetInfo(earth);
        SolarSystem mars = new SolarSystem("Mars", 4212, "Red", 2);
        printPlanetInfo(mars);
        SolarSystem jupiter = new SolarSystem("Jupiter", 86881, "Brown with white clouds", 79);
        printPlanetInfo(jupiter);
        SolarSystem saturn = new SolarSystem("Saturn", 72366, "Yellowish with rings", 82);
        printPlanetInfo(saturn);
        SolarSystem uranus = new SolarSystem("Uranus", 31518, "Light blue/green", 27);
        printPlanetInfo(uranus);
        SolarSystem neptune = new SolarSystem("Neptune", 30598, "Dark blue", 14);
        printPlanetInfo(neptune);
        SolarSystem pluto = new SolarSystem();
        pluto.setPlanet("Pluto");
        pluto.setSize(1473);
        pluto.setColor("Brown and White with some red");
        pluto.setNoOfMoons(5);
        printPlanetInfo(pluto);

    }

    private static void printCandidateInfo(Candidate candidate) {
        System.out.println("ID : " + candidate.getId());
        System.out.println("Name : " + candidate.getName());
        System.out.println("Email : " + candidate.getEmail());
        System.out.println("Department : " + candidate.getDepartment());

    }

    private static void printPlanetInfo(SolarSystem planet) {
        System.out.println("Planet: " + planet.getPlanet());
        System.out.println("Size(Diameter in miles): " + planet.getSize());
        System.out.println("Color: " + planet.getColor());
        System.out.println("No of Moons: " + planet.getNoOfMoons());

    }
}
