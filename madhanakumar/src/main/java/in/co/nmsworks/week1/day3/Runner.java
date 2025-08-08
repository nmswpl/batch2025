package in.co.nmsworks.week1.day3;

public class Runner {
    public static void main(String[] args) {
        Candidate ashik = new Candidate();
        ashik.setName("Mohammed Ashik M");
        ashik.setId(1);
        ashik.setEmail("mohamedasikm@nmsworks.co.in");
        ashik.setDepartment("Developer");

        Candidate suddharsan = new Candidate();
        suddharsan.setName("Suddharsan v");
        suddharsan.setId(2);
        suddharsan.setEmail("suddharshanv@nmsworks.co.in");
        suddharsan.setDepartment("Developer");

        Candidate logeshwari = new Candidate();
        logeshwari.setName("Logeshwari");
        logeshwari.setId(3);
        logeshwari.setEmail("logeswari@nmsworks.co.in");
        logeshwari.setDepartment("Developer");

        Candidate anu = new Candidate();
        anu.setName("Anusuya Devi R");
        anu.setId(4);
        anu.setEmail("anusuyadevir@nmsworks.co.in");
        anu.setDepartment("Developer");

        Candidate kavi = new Candidate();
        kavi.setName("Kavi M");
        kavi.setId(5);
        kavi.setEmail("kavim@nmsworks.co.in");
        kavi.setDepartment("Developer");

        Candidate madhan = new Candidate();
        madhan.setName("Madhanakumar T");
        madhan.setId(12);
        madhan.setEmail("madhanakumart@nmsworks.co.in");
        madhan.setDepartment("Developer");

        Candidate kabil = new Candidate("Kabilkumar K", 13, "kabilkumark@nmsworks.co.in", "Developer");
        Candidate vijiyalakshmi = new Candidate("Vijayalakshmi R", 14, "vijayalakshmir@nmsworks.co.in", "Developer");
        Candidate fiyaz = new Candidate("Fiyaz Mohammed", 15, "fiyazmohammed@nmsworks.co.in", "Developer");
        Candidate mathi = new Candidate("Mathinath S", 16, "mathinaths@nmsworks.co.in", "Developer");
        Candidate subash = new Candidate("Subash M", 17, "subashm@nmsworks.co.in", "Developer");
        Candidate harish = new Candidate("Harish G", 18, "harishg@nmsworks.co.in", "Developer");

        printCandidateinfo(ashik);
        printCandidateinfo(suddharsan);
        printCandidateinfo(logeshwari);
        printCandidateinfo(anu);
        printCandidateinfo(kavi);
        printCandidateinfo(madhan);
        printCandidateinfo(kabil);
        printCandidateinfo(vijiyalakshmi);
        printCandidateinfo(fiyaz);
        printCandidateinfo(mathi);
        printCandidateinfo(subash);
        printCandidateinfo(harish);

        Planet mercury = new Planet("Mercury", 3032, "Grayish and Rocky", 0);
        Planet venus = new Planet("Venus", 7520, "Yellowish-white", 0);
        Planet earth = new Planet("Earth", 7917, "Blue and Green", 1);
        Planet mars = new Planet("Mars", 4212, "Red", 2);
        Planet jupiter = new Planet("Jupiter", 868812, "Brown with white clouds", 79);
        Planet saturn = new Planet("Saturn", 72366, "Yellowish with rings", 82);
        Planet uranus = new Planet("Uranus", 31518, "Light blue/green", 27);
        Planet neptune = new Planet("Neptune", 30598, "Dark blue", 14);
        Planet pluto = new Planet("Pluto", 1473, "Brown and white with some red", 5);

        printPlanetinfo(venus);
    }

    public static void printCandidateinfo(Candidate candidate){
        System.out.println("Name : "+candidate.getName()+", Id : "+candidate.getId()+", Email : "+candidate.getEmail()+", Department : "+candidate.getDepartment());
    }

    public static void printPlanetinfo(Planet planet){
        System.out.println("\n"+"Planet : "+planet.getPlanet()+"\n"
        +"Size : "+planet.getSize()+"\n"
        +"Color : "+planet.getColor()+"\n"
        +"No of Moons : "+planet.getNoOfMoons());
    }

}
