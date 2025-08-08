package in.co.nmsworks.week1.day3;

public class Runner
{
    public static void main(String[] args) {

        Candidate asik = new Candidate(1, "Mohamed Asik M", "mohamedasikm@nmsworks.co.in", "Developer");
        printCandidateDetails(asik);

        Candidate suddharshan = new Candidate(2, "Suddharshan V", "suddharshanv@nmsworks.co.in", "Developer");
        printCandidateDetails(suddharshan);

        Candidate logeswari = new Candidate(3, "Logeswari", "logeswari@nmsworks.co.in", "Developer");
        printCandidateDetails(logeswari);

        Candidate anusuya = new Candidate(4, "Anusuya Devi R", "anusuyadevir@nmsworks.co.in", "Developer");
        printCandidateDetails(anusuya);

        Candidate kavi = new Candidate(5, "Kavi M", "kavim@nmsworks.co.in", "Developer");
        printCandidateDetails(kavi);

        Candidate saran = new Candidate(6, "Saran Raj I", "saranraji@nmsworks.co.in", "Developer");
        printCandidateDetails(saran);

        Candidate yamini = new Candidate(7, "Yamini S", "yaminis@nmsworks.co.in", "Developer");
        printCandidateDetails(yamini);

        Candidate sameera = new Candidate(8, "Sameera Banu M", "sameerabanum@nmsworks.co.in", "Developer");
        printCandidateDetails(sameera);

        Candidate tharun = new Candidate(9, "Tharunkumar", "tharunkumar@nmsworks.co.in", "Developer");
        printCandidateDetails(tharun);

        Candidate mahalaksmi = new Candidate(10, "Mahalakshmi Karthiban", "mahalakshmikarthiban@nmsworks.co.in", "Developer");
        printCandidateDetails(mahalaksmi);

        Candidate sheik = new Candidate(11, "Sheik Fayas G", "sheikfayasg@nmsworks.co.in", "Developer");
        printCandidateDetails(sheik);

        Candidate madhanakumar = new Candidate(12, "Madhanakumar T", "madhanakumart@nmsworks.co.in", "Developer");
        printCandidateDetails(madhanakumar);

        Candidate kabilkumar = new Candidate(13, "Kabilkumar K", "kabilkukumark@nmsworks.co.in", "Developer");
        printCandidateDetails(kabilkumar);

        Candidate vijayalaksmi = new Candidate(14, "Vijayalakshmi R", "vijayalaksmir@nmsworks.co.in", "Developer");
        printCandidateDetails(vijayalaksmi);

        Candidate fiyaz = new Candidate(15, "Fiyaz Mohamed", "fiyazmohamed@nmsworks.co.in", "Developer");
        printCandidateDetails(fiyaz);

        Candidate mathinath = new Candidate(16, "Mathinath S", "mathinaths@nmsworks.co.in", "Developer");
        printCandidateDetails(mathinath);

        Candidate subash = new Candidate(17, "Subash M", "subashm@nmsworks.co.in", "Developer");
        printCandidateDetails(subash);

        Candidate harish = new Candidate(18, "Harish G", "harishg@nmsworks.co.in", "Developer");
        printCandidateDetails(harish);

        Candidate arsath = new Candidate(19, "Arsath Ahamed A", "arsathahamed@nmsworks.co.in", "Developer");
        printCandidateDetails(arsath);

        Candidate gajendran= new Candidate(20, "Gajendran S", "gajendrans@nmsworks.co.in", "Developer");
        printCandidateDetails(gajendran);

        Candidate arun = new Candidate(21, "Arunkumar M", "arunkumarm@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(arun);

        Candidate vasanth = new Candidate(22, "Vasanth S", "vasanths@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(vasanth);

        Candidate nandhakumar = new Candidate(23, "Nandhakumar M", "nandhakumarm@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(nandhakumar);

        Candidate ramya = new Candidate(24, "Ramya S", "ramyas@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(ramya);

        Candidate neha = new Candidate(25, "Neha S", "nehas@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(neha);

        Candidate sabarishwaran = new Candidate(26, "Sabarishwaran S", "sabarishwarans@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(sabarishwaran);

        Candidate elakkiya = new Candidate(27, "Elakkiya S", "elakkiyas@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(elakkiya);

        Candidate ellammal = new Candidate(28, "Ellammal", "ellammal@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(ellammal);

        Candidate kavibharathi = new Candidate(29, "Kavibharathi S", "kavibharathis@nmsworks.co.in", "Testing/Support");
        printCandidateDetails(kavibharathi);

        Candidate kabilan = new Candidate();
        kabilan.setId(30);
        kabilan.setName("Kabilan R");
        kabilan.setEmail("kabilanr@nmsworks.co.in");
        kabilan.setDept("Testing/Support");

        printCandidateDetails(kabilan);

        Candidate velmurugan = new Candidate();
        velmurugan.setId(31);
        velmurugan.setName("Velmurugan S");
        velmurugan.setEmail("velmurugans@nmsworks.co.in");
        velmurugan.setDept("Testing/Support");

        printCandidateDetails(velmurugan);

        Candidate amarnath = new Candidate();
        amarnath.setId(32);
        amarnath.setName("Amarnath M");
        amarnath.setEmail("amarnathm@nmsworks.co.in");
        amarnath.setDept("Testing/Support");

        printCandidateDetails(amarnath);

        Candidate vinoth = new Candidate();
        vinoth.setId(33);
        vinoth.setName("Vinothkumar E");
        vinoth.setEmail("vinothkumare@nmsworks.co.in");
        vinoth.setDept("Testing/Support");

        printCandidateDetails(vinoth);

        Candidate kanagavel = new Candidate();
        kanagavel.setId(34);
        kanagavel.setName("Kanagavel N");
        kanagavel.setEmail("kanagaveln@nmsworks.co.in");
        kanagavel.setDept("Testing/Support");

        printCandidateDetails(kanagavel);


        Planet mercury = new Planet();
        mercury.setName("Mercury");
        mercury.setDiameterInMiles(3032);
        mercury.setColor("Grayish and rocky");
        mercury.setNoOfMoons(0);

        printPlanetDetails(mercury);

        Planet venus = new Planet();
        venus.setName("Venus");
        venus.setDiameterInMiles(7520);
        venus.setColor("Yellowish-white");
        venus.setNoOfMoons(0);

        printPlanetDetails(venus);

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setDiameterInMiles(7917);
        earth.setColor("Blue and green");
        earth.setNoOfMoons(1);

        printPlanetDetails(earth);

        Planet mars = new Planet();
        mars.setName("Mars");
        mars.setDiameterInMiles(4212);
        mars.setColor("Red");
        mars.setNoOfMoons(2);

        printPlanetDetails(mars);

        Planet jupiter = new Planet("Jupiter", 86881, "Brown with white clouds", 79);
        printPlanetDetails(jupiter);

        Planet saturn = new Planet("Saturn", 72366, "Yellowish with rings", 82);
        printPlanetDetails(saturn);

        Planet uranus = new Planet("Uranus", 31518,	"Light blue/green", 27);
        printPlanetDetails(uranus);

        Planet neptune = new Planet("Neptune", 30598, "Dark blue", 14);
        printPlanetDetails(neptune);

        Planet pluto = new Planet("Pluto", 1473, "Brown and white with some red", 5);
        printPlanetDetails(pluto);


    }

    public static void printCandidateDetails(Candidate candidate)
    {
        System.out.println("ID : " + candidate.getId() +
                ", Name : " + candidate.getName() +
                ", Email : " + candidate.getEmail() +
                ", Department : " + candidate.getDept());
    }

    public static void printPlanetDetails(Planet planet)
    {
        System.out.println("Planet: " + planet.getName() + '\n' +
                "Size (Diameter in miles): " + planet.getDiameterInMiles() + '\n' +
                "Color: " + planet.getColor() + '\n' +
                "Number of Moons: " + planet.getNoOfMoons());
    }

}
