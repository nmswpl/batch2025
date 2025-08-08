package in.co.nmsworks.week1.day3;

public class Runner {

    public static void printContentOfCandidate(Candidate candidate){

        System.out.println("Candidate ID    : "+candidate.getId());
        System.out.println("Candidate Name  : "+candidate.getName());
        System.out.println("Candidate Email : "+candidate.getEmail());
        System.out.println("Candidate Dept  : "+candidate.getDept());

    }

    public static void setCandidateDetails(Candidate candidate, int id, String name, String email, String Dept){
        candidate.setId(id);
        candidate.setName(name);
        candidate.setEmail(email);
        candidate.setDept(Dept);

    }


    public static void creatingObjectsForCandidate(){

        Candidate c1 = new Candidate();
        Candidate c2 = new Candidate();
        Candidate c3 = new Candidate();
        Candidate c4 = new Candidate();
        Candidate c5 = new Candidate();
        Candidate c6 = new Candidate();
        Candidate c7 = new Candidate();
        Candidate c8 = new Candidate();
        Candidate c9 = new Candidate();
        Candidate c10 = new Candidate();
        Candidate c11 = new Candidate();
        Candidate c12 = new Candidate();
        Candidate c13 = new Candidate();
        Candidate c14 = new Candidate();
        Candidate c15 = new Candidate();
        Candidate c16 = new Candidate();
        Candidate c17 = new Candidate();
        Candidate c18 = new Candidate();
        Candidate c19 = new Candidate();
        Candidate c20 = new Candidate();



        setCandidateDetails(c1,1, "Mohamed Asik M","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c1);

        setCandidateDetails(c2,2, "Suddharshan V","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c2);

        setCandidateDetails(c3,3, "Logeswari","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c3);

        setCandidateDetails(c4,4, "Anusuya Devi R","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c4);

        setCandidateDetails(c5,5, "Kavi M","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c5);

        setCandidateDetails(c6,6, "Saran Raj I","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c6);

        setCandidateDetails(c7,7, "Yamini S","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c7);

        setCandidateDetails(c8,8, "Sameera Banu M","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c8);

        setCandidateDetails(c9,9, "Tharunkumar","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c9);

        setCandidateDetails(c10,10, "Mahalakshmi Karthiban","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c10);

        setCandidateDetails(c11,11, "Sheik Fayas G","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c11);

        setCandidateDetails(c12,12, "Madhanakumar T","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c12);

        setCandidateDetails(c13,13, "Kabilkumar K","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c13);

        setCandidateDetails(c14,14, "Vijayalakshmi R","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c14);

        setCandidateDetails(c15,15, "Fiyaz Mohamed","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c15);

        setCandidateDetails(c16,16, "Mathinath S","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c16);

        setCandidateDetails(c17,17, "Subash M","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c17);

        setCandidateDetails(c18,18, "Harish G","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c18);

        setCandidateDetails(c19,19, "Arsath Ahamed A","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c19);

        setCandidateDetails(c20,20, "Gajendran","gajendrans@nmsworks.co.in","Developer");
        printContentOfCandidate(c20);





        Candidate c21 = new Candidate(21, "Arunkumar M","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c21);

        Candidate c22 = new Candidate(22, "Vasanth S","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c22);

        Candidate c23 = new Candidate(23, "Nandhakumar M","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c23);

        Candidate c24 = new Candidate(24, "Ramya S","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c24);

        Candidate c25 = new Candidate(25, "Neha S","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c25);

        Candidate c26 = new Candidate(26, "Sabarishwaran S","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c26);

        Candidate c27 = new Candidate(27, "Elakkiya S","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c27);

        Candidate c28 = new Candidate(28, "Ellammal","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c28);

        Candidate c29 = new Candidate(29, "Kavibharathi S","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c29);

        Candidate c30 = new Candidate(30, "Kabilan R","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c30);

        Candidate c31 = new Candidate(31, "Velmurugan S","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c31);

        Candidate c32 = new Candidate(32, "Amarnath M","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c32);

        Candidate c33 = new Candidate(33, "Vinothkumar E","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c33);

        Candidate c34 = new Candidate(34, "Kanagavel N","gajendrans@nmsworks.co.in","Testing / Support");
        printContentOfCandidate(c34);


    }



    public static void printContentOfPlanet(Planet planet){

        System.out.println("Planet Name    : "+planet.getPlanetName());
        System.out.println("Planet Size : "+planet.getSize());
        System.out.println("Planet Color : "+planet.getColor());
        System.out.println("Number Of Moon Planet Have  : "+planet.getNumberOfMoons());
        System.out.println("'");
    }





    public static void creatingObjectsForPlanet(){

        Planet mercury = new Planet("Mercury",3032,"Grayish and rocky",0);
        printContentOfPlanet(mercury);

        Planet venus = new Planet("Venus",7520,"Yellowish-white",0);
        printContentOfPlanet(venus);

        Planet earth = new Planet("Earth",7917,"Blue and green",1);
        printContentOfPlanet(earth);

        Planet jupiter = new Planet("Jupiter",4212,"Red",2);
        printContentOfPlanet(jupiter);

        Planet saturn = new Planet("Saturn",86881,"Brown with white clouds",79);
        printContentOfPlanet(saturn);

        Planet uranus = new Planet("Uranus",72366,"Yellowish with rings",82);
        printContentOfPlanet(uranus);

        Planet neptune = new Planet("Neptune",31518,"Light blue/green",27);
        printContentOfPlanet(neptune);

        Planet pluto = new Planet("Pluto",1473,"Dark blue",14);
        printContentOfPlanet(pluto);

    }




    public static void main(String[] args) {

        creatingObjectsForCandidate();
        creatingObjectsForPlanet();

    }


}
