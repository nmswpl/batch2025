package in.co.nmsworks.week1.day3;


public class Runner {

    public static void main(String[] args) {

        Candidate kavi = new Candidate();
        kavi.setId(1);
        kavi.setName("kavi");
        kavi.setEmail("abc@123");
        kavi.setDepartment("dev");

        Candidate anushiya = new Candidate();
        anushiya.setId(2);
        anushiya.setName("anu");
        anushiya.setEmail("abc@123");
        anushiya.setDepartment("dev");

        Candidate mohemadAsik = new Candidate();
        mohemadAsik.setId(3);
        mohemadAsik.setName("mohemadAshik");
        mohemadAsik.setEmail("kavi@123");
        mohemadAsik.setDepartment("Developer");

        Candidate sudharsan = new Candidate();
        sudharsan.setId(4);
        sudharsan.setName("sudharsan");
        sudharsan.setEmail("kavi2123");
        sudharsan.setDepartment("dev");

        Candidate saranraj = new Candidate();
        saranraj.setId(5);
        saranraj.setName("sarnraj");
        saranraj.setDepartment("dev");
        saranraj.setEmail("ayiwd@124");

        Candidate yamini = new Candidate();
        yamini.setId(6);
        yamini.setName("yamini");
        yamini.setEmail("jabi@123");
        yamini.setDepartment("dev");

        Candidate sameer = new Candidate();
        sameer.setId(7);
        sameer.setName("sameer");
        sameer.setEmail("kavi@214");
        sameer.setDepartment("dev");


        Candidate mahalakshmi = new Candidate();
        mahalakshmi.setId(8);
        mahalakshmi.setName("'mahalakshmi");
        mahalakshmi.setEmail("afydu@124");
        mahalakshmi.setDepartment("dev");

        Candidate tharun = new Candidate();
        tharun.setId(9);
        tharun.setName("tharun");
        tharun.setEmail("jjahvu@44");
        tharun.setDepartment("dev");

        Candidate sheik = new Candidate();
        sheik.setId(10);
        sheik.setName("sheik");
        sheik.setEmail("kavi2143");
        sheik.setDepartment("dev");

        printCndidateInfo(sheik);

        Candidate madhanakumar = new Candidate(11, "madhanakumar", "kavi21232", "dev");

        Candidate kabilkumar = new Candidate(12, "kabikumar", "kavi2123", "dev");

        Candidate viyalakshmi = new Candidate(14, "viji", "kavi@1234", "dev");

        Candidate fiyaz = new Candidate(15, "fiyaz", "kacu@1434", "dev");

        Candidate mathinath = new Candidate(16, "mathi", "kai2434", "dev");

        Candidate subash = new Candidate(17, "subash", "jatgu", "dev");


        Planet mercury = new Planet();
        mercury.setPlanet("mercury");
        mercury.setSize(3002);
        mercury.setColor("Grayish and rocky");
        mercury.setNumberOfMoon(0);

        Planet venus = new Planet();
        venus.setPlanet("venus");
        venus.setSize(7520);
        venus.setColor("yellowish");
        venus.setNumberOfMoon(0);

        Planet Earth = new Planet();
        Earth.setPlanet("earth");
        Earth.setSize(7912);
        Earth.setColor("blue");
        Earth.setNumberOfMoon(1);
        printPlanetInfo(Earth);

        Planet mars = new Planet();
        mars.setPlanet("mars");
        mars.setSize(7917);
        mars.setColor("blue");
        mars.setNumberOfMoon(1);

        Planet jupitar = new Planet();
        jupitar.setPlanet("jupitar");
        jupitar.setSize(86881);
        jupitar.setColor("brown");
        jupitar.setNumberOfMoon(79);

        Planet saturn = new Planet();
        saturn.setPlanet("saturn");
        saturn.setSize(72366);
        saturn.setColor("yellow");
        saturn.setNumberOfMoon(82);

        Planet uranus=new Planet();
        uranus.setPlanet("uranus");
        uranus.setSize(31518);


        Planet neptune = new Planet();
        neptune.setPlanet("neptune");
        neptune.setSize(30598);
        neptune.setColor("blue");
        neptune.setNumberOfMoon(14);

        Planet pluto = new Planet();
        pluto.setPlanet("pluto");
        pluto.setColor("white");
        pluto.setSize((1435));
        pluto.setNumberOfMoon(5);

    }

    private static void printCndidateInfo(Candidate sheik) {
    }

    public static void printPlanetInfo(Planet plan) {
        System.out.println("planet" + plan.getPlanet());
        System.out.println("size" + plan.getSize());
        System.out.println("color" + plan.getColor());
        System.out.println("numberofmoon" + plan.getNumberOfMoon());
    }

    public void printCandidateInfo(Candidate candidate) {
        System.out.println("id" + candidate.getId());
        System.out.println("name" + candidate.getName());
        System.out.println("email" + candidate.getEmail());
        System.out.println("department" + candidate.getDepartment());
    }

}
