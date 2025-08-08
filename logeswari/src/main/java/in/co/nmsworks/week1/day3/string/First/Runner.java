package in.co.nmsworks.week1.day3.string.First;

public class Runner {


    public static void main(String[] args) {

        Candidate mohamed=new Candidate(1,"Mohamed Asik M","MohamedAsikM@gmail.com","Developer");
        printCandidateInfo(mohamed);
        Candidate suddharshan =new Candidate(2,"Suddharshan","Suddharshan@gmail.com","Developer");
        printCandidateInfo(suddharshan);
        Candidate logeswari=new Candidate(3,"logswari","logeswari@gmail.com","Developer");
        printCandidateInfo(logeswari);
        Candidate anuciyaDevi =new Candidate(4,"anuciya","anusiya@gmail.com","Developer");
        printCandidateInfo(anuciyaDevi);
        Candidate kavi =new Candidate(5,"kavi","kavi@gmail.com","Developer");
        printCandidateInfo(kavi);
        Candidate mahalakshmi=new Candidate(6,"mahalakshmi","mahalakshmi@gmail.com","Developer");
        printCandidateInfo(mahalakshmi);
        Candidate saran =new Candidate(7,"saran","saran@gmail.com","Developer");
        printCandidateInfo(saran);
        Candidate yamini =new Candidate(8,"yamini","yamini@gmail.com","Developer");
        printCandidateInfo(yamini);
        Candidate sameera=new Candidate(9,"sameera","sameera@gmail.com","Developer");
        printCandidateInfo(sameera);
        Candidate tharunkumar=new Candidate(10,"tharunkumar","tharun@gmail.com","Developer");
        printCandidateInfo(tharunkumar);
        Candidate madhankumar=new Candidate(11,"madhankumar","madhan@gmail.com","Developer");
        printCandidateInfo(madhankumar);
        Candidate kabilkumar=new Candidate(12,"kabilkumar","kabilkumar@gmail.com","Developer");
        printCandidateInfo(kabilkumar);
        Candidate madhinath=new Candidate(13,"madhinath","mahinath@gmail.com","Developer");
        printCandidateInfo(madhinath);
        Candidate viayalakshmi=new Candidate(14,"vijalakshmi","viji@gmail.com","Developer");
        printCandidateInfo(viayalakshmi);
        Candidate harish=new Candidate(15,"harish","harih@gmail.com","Developer");
        printCandidateInfo(harish);
        Candidate subash=new Candidate(16,"subash","subhash@gmail.com","Developer");
        printCandidateInfo(subash);
        Candidate ahamed=new Candidate(17,"ahemed","ahemed@gmail.com","Developer");
        printCandidateInfo(ahamed);






        PlantType mercury=new PlantType("Mercury",3038,"Grayish and rocky",0);
        printPlantInfo(mercury);
        PlantType venus=new PlantType("venus",7520,"Yellowish-white",0);
        printPlantInfo(venus);
        PlantType earth=new PlantType("earth",7917,"blue and green",1);
        printPlantInfo(earth);
        PlantType mars=new PlantType("mars",4212,"red",2);
        printPlantInfo(mars);
        PlantType jupiter=new PlantType("jupiter",86881,"Brown with white clouds",79);
        printPlantInfo(jupiter);
        PlantType saturn=new PlantType("saturn",72366,"Yellowish with rings",82);
        printPlantInfo(saturn);
        PlantType uranas=new PlantType("uranus",31518,"Light blue/green",27);
        printPlantInfo(uranas);
        PlantType neptune=new PlantType("neptune",30598,"dark bule",14);
        printPlantInfo(neptune);
        PlantType pluto=new PlantType("mars",1473,"Brown and white with some red",2);
        printPlantInfo(pluto);




        Candidate fayas=new Candidate();
        fayas.setId(101);
        fayas.setName("fayas");
        fayas.setEmail("fayas@gmail.com");
        fayas.setDepartment("Development");
        System.out.println("Id = " + fayas.getId());
        System.out.println("name = " +fayas.getName());
        System.out.println("Email = " + fayas.getEmail());
        System.out.println("Department = " + fayas.getDepartment());
    }
    //        logeswari.setId(101);
    //        logeswari.setName("Logeswari N");
    //        logeswari.setEmail("logu@gmail.com");
    //        logeswari.setDepartment("Development");
            public static void printCandidateInfo(Candidate candidate){
                System.out.println("Id = " + candidate.getId());
                System.out.println("name = " +candidate.getName());
                System.out.println("Email = " + candidate.getEmail());
                System.out.println("Department = " + candidate.getDepartment());
                System.out.println();


            }

    public static void printPlantInfo(PlantType plantType){
        System.out.println("Plant : " + plantType.getPlant());
        System.out.println("Size (Diameter in miles) : " +plantType.getSize());
        System.out.println("color : " + plantType.getColor());
        System.out.println("Number of Moons: " + plantType.getNoOfMoons());
        System.out.println("------planet-----");
    }
}





