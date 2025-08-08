package in.co.nmsworks.week1.day3;

public class Runner {
    public static void main(String[] args) {
        Candidate harish = new Candidate();
        harish.setId(18);
        harish.setName("harish");
        harish.setEmail("harishankar2062004@gmail.com");
        harish.setDepartment("Developer");
        printTheCandidateDetails(harish);

        Candidate mohamed = new Candidate();
        mohamed.setId(1);
        mohamed.setName("mohamed");
        mohamed.setEmail("mohamed@gmail.com");
        mohamed.setDepartment("Developer");
        printTheCandidateDetails(mohamed);

        Candidate sudharsan = new Candidate();
        sudharsan.setId(2);
        sudharsan.setName("sudharsan");
        sudharsan.setEmail("sudhrsan@gmail.com");
        sudharsan.setDepartment("Developer");
        printTheCandidateDetails(sudharsan);

        Candidate logeswari = new Candidate();
        logeswari.setId(4);
        logeswari.setName("logeswari");
        logeswari.setEmail("logeswari@gmail.com");
        logeswari.setDepartment("Developer");
        printTheCandidateDetails(logeswari);

        Candidate anusuya = new Candidate();
        anusuya.setId(5);
        anusuya.setName("anusuya");
        anusuya.setEmail("anusuya@gmail.com");
        anusuya.setDepartment("Developer");
        printTheCandidateDetails(anusuya);

        Candidate kavi = new Candidate();
        kavi.setId(6);
        kavi.setName("kavi");
        kavi.setEmail("kavi@gmail.com");
        kavi.setDepartment("Developer");
        printTheCandidateDetails(kavi);

        Candidate saranraj = new Candidate();
        saranraj.setId(6);
        saranraj.setName("saranraj");
        saranraj.setEmail("saranraj@gmail.com");
        saranraj.setDepartment("Developer");
        printTheCandidateDetails(saranraj);


        Candidate yamini = new Candidate(7, "yamini", "yamini@gmail.com", "Developer");
        printTheCandidateDetails(yamini);

        Candidate sameera = new Candidate(8, "sameera", "sameera@gmail.com", "Developer");
        printTheCandidateDetails(sameera);

        Candidate banu = new Candidate(9, "banu", "banu@gmail.com", "Developer");
        printTheCandidateDetails(banu);


        Candidate mahalakshmi = new Candidate(10, "mahalakshmi", "mahalakshmi@gmail.com", "Developer");
        printTheCandidateDetails(mahalakshmi);

        Candidate candidate6 = new Candidate(11, "Sheik", "sheik@gmail.com", "Developer");
        System.out.println("The candidate Id is :" + candidate6.getId());
        System.out.println("The candidate Name is :" + candidate6.getName());
        System.out.println("The candidate Email is :" + candidate6.getEmail());
        System.out.println("The candidate Department is :" + candidate6.getDepartment());
        System.out.println("\n");

        Candidate candidate7 = new Candidate();
        candidate7.setId(17);
        candidate7.setName("haris");
        candidate7.setEmail("haris");
        candidate7.setDepartment("Developer");


        //this is new program


        PlanetDetails mercury = new PlanetDetails();
        mercury.setPlanet("Mercury");
        mercury.setSizeDiameterInMiles(3032);
        mercury.setColor("Greyish and rocky");
        mercury.setnumberOfMoons(0);
        printThePlanets(mercury);


        PlanetDetails venus = new PlanetDetails();
        venus.setPlanet("venus");
        venus.setSizeDiameterInMiles(7520);
        venus.setColor("Yellowish-white");
        venus.setnumberOfMoons(0);
        printThePlanets(venus);

        PlanetDetails earth = new PlanetDetails();
        earth.setPlanet("Earth");
        earth.setSizeDiameterInMiles(7917);
        earth.setColor("Blue and green");
        earth.setnumberOfMoons(1);
        printThePlanets(earth);

        PlanetDetails mars = new PlanetDetails();
        mars.setPlanet("Mars");
        mars.setSizeDiameterInMiles(4212);
        mars.setColor("Red");
        mars.setnumberOfMoons(2);
        printThePlanets(mars);

        PlanetDetails jupiter = new PlanetDetails();
        jupiter.setPlanet("jupiter");
        jupiter.setSizeDiameterInMiles(3032);
        jupiter.setColor("Greyish and rocky");
        jupiter.setnumberOfMoons(0);
        printThePlanets(jupiter);


        PlanetDetails saturn = new PlanetDetails();
        saturn.setPlanet("saturn");
        saturn.setSizeDiameterInMiles(72366);
        saturn.setColor("yellowish with rings");
        saturn.setnumberOfMoons(82);
        printThePlanets(saturn);

        PlanetDetails uranus = new PlanetDetails();
        uranus.setPlanet("uranus");
        uranus.setSizeDiameterInMiles(31518);
        uranus.setColor("light blue green");
        uranus.setnumberOfMoons(27);
        printThePlanets(uranus);

        PlanetDetails neptune = new PlanetDetails();
        neptune.setPlanet("Neptune");
        neptune.setSizeDiameterInMiles(30598);
        neptune.setColor("Dark Blue");
        neptune.setnumberOfMoons(14);
        printThePlanets(neptune);

        PlanetDetails pluto = new PlanetDetails();
        pluto.setPlanet("Pluto");
        pluto.setSizeDiameterInMiles(3032);
        pluto.setColor("Greyish and rocky");
        pluto.setnumberOfMoons(0);
        printThePlanets(pluto);

    }

    public static void printTheCandidateDetails(Candidate candidate) {
        System.out.println("The candidate Id is :" + candidate.getId());
        System.out.println("The candidate Name is :" + candidate.getName());
        System.out.println("The candidate Email is :" + candidate.getEmail());
        System.out.println("The candidate Department is :" + candidate.getDepartment());
        System.out.println("\n");


    }


    public static void printThePlanets(PlanetDetails row) {
        System.out.println("Planet :" + row.getPlanet());
        System.out.println("Size(In Diameters) :" + row.getSizeDiameterInMiles());
        System.out.println("Color :" + row.getPlanet());
        System.out.println("Number of Moons :" + row.getNumberOfMoons());
        System.out.println("\n");

    }
}
