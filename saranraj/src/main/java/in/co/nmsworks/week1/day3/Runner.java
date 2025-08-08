package in.co.nmsworks.week1.day3;

public class Runner {

    public static void main(String[] args) {

        Candidate mohamed = new Candidate(1,"Mohamed Ashik M","ashik@nmsworks.co.in","Developer");
        Candidate suddharshan = new Candidate(2,"Suddharshan V","suddharshan@nmsworks.co.in","Developer");
        Candidate logeswari = new Candidate(3,"Logeswari","logeshwari@nmsworks.co.in","Developer");
        Candidate anusuya = new Candidate(4,"Anusuya Devi R","anusiya@nmsworks.co.in","Developer");
        Candidate kavi = new Candidate(5,"Kavi M","Kavi@nmsworks.co.in","Developer");
        Candidate saran = new Candidate(6,"Saran Raj I","saran@nmsworks.co.in","Developer");
        Candidate yamini = new Candidate(7,"Yamini S","yamini@nmsworks.co.in","Developer");
        Candidate sammera = new Candidate(8,"Sameera Banu M","sameera@nmsworks.co.in","Developer");
        Candidate tharun = new Candidate(9,"Tharun kumar","tharun@nmsworks.co.in","Developer");
        Candidate mahalakshmi = new Candidate(10,"Mahalakshmi Karthiban","mahalakshmi@nmsworks.co.in","Developer");
        Candidate sheik = new Candidate(11,"Sheik Fayas G","shiek@nmsworks.co.in","Developer");
        Candidate madhankumar = new Candidate(12,"Madhanakumar T","suddharshan@nmsworks.co.in","Developer");



        printCandidateInfo(mohamed);
        printCandidateInfo(suddharshan);
        printCandidateInfo(logeswari);
        printCandidateInfo(anusuya);
        printCandidateInfo(kavi);
        printCandidateInfo(saran);
        printCandidateInfo(yamini);
        printCandidateInfo(sammera);
        printCandidateInfo(tharun);
        printCandidateInfo(mahalakshmi);
        printCandidateInfo(sheik);
        printCandidateInfo(madhankumar);

        Candidate subash = new Candidate();
        subash.setId(13);
        subash.setName("Subash M");
        subash.setEmail("subash@nmsworks.co.in");
        subash.setDepartment("Developer");

        printCandidateInfo(subash);

//        -------------------------Next Questions-------------------

        Planets venusPlanet = new Planets();

        venusPlanet.setPlanetName("Venus");
        venusPlanet.setSize(7520);
        venusPlanet.setColor("Yellowish-white");
        venusPlanet.setNoOfMoon(0);
        printPlanetsDetails(venusPlanet);

        Planets mercury = new Planets("Mercury",3032,"Grayish and rocky",0);
        Planets venus = new Planets("Venus",7520,"Yellowish-white",0);
        Planets earth = new Planets("Earth",7917,"Blue and green",1);
        Planets mars = new Planets("Mars",4212,"Red",2);
        Planets jupiter = new Planets("Jupiter",86881,"Brown with white clouds",79);
        Planets saturn = new Planets("Saturn",72366,"Yellowish with rings",82);
        Planets uranus = new Planets("Uranus",31518,"Light blue/green",27);
        Planets neptune = new Planets("Neptune",30598,"Dark blue",14);
        Planets pluto = new Planets("Pluto",1473,"Brown and white with some red",5);

        printPlanetsDetails(mercury);
        printPlanetsDetails(venus);
        printPlanetsDetails(earth);
        printPlanetsDetails(mars);
        printPlanetsDetails(jupiter);
        printPlanetsDetails(saturn);
        printPlanetsDetails(uranus);
        printPlanetsDetails(neptune);
        printPlanetsDetails(pluto);

    }



    public static void printCandidateInfo(Candidate candidate) {

        System.out.println("--------------Candidate Detials--------------");
        System.out.println("Id : \t" + candidate.getId());
        System.out.println("Name : \t" + candidate.getName());
        System.out.println("Email : \t" + candidate.getEmail());
        System.out.println("Department : \t" + candidate.getDepartment());
        System.out.println("---------------------------------------------");

    }

    public static void printPlanetsDetails(Planets planets){
        System.out.println("------------Planets Details-----------------");
        System.out.println("Planets : \t"+planets.getPlanetName());
        System.out.println("Size (Diameter in miles : \t"+planets.getSize());
        System.out.println("Color : \t"+planets.getColor());
        System.out.println("Number of Moons : \t"+planets.getNoOfMoon());
        System.out.println("--------------------------------------------");
    }

}
