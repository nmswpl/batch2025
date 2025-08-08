package in.co.nmsworks.week1.day3;

public class Runner {
    public static void printcandiateInfo(Candidate details){

        System.out.println("---------------------------------------------------");
        System.out.println(details.getId());
        System.out.println(details.getName());
        System.out.println(details.getEmail());
        System.out.println(details.getDepartment());
        System.out.println("---------------------------------------------------");

    }

    public static void printPlanetInfo(Planet details){
        System.out.println("---------------------------------------------------");

        System.out.println("Planet: "+details.getPlanet());
        System.out.println("Size (Diameter in miles): "+details.getSize());
        System.out.println("Color: "+details.getColor());
        System.out.println("Number Of Moons: "+details.getNoOfMoon());
        System.out.println("---------------------------------------------------");

    }


    public static void main(String[] args) {
        Candidate candidate1=new Candidate();
        candidate1.setId(1);
        candidate1.setName("Mohamed Asik M");
        candidate1.setDepartment("Developer");
        candidate1.setEmail("ashik@gmail.com");
        printcandiateInfo(candidate1);

        Candidate candidate2=new Candidate();
        candidate2.setId(2);
        candidate2.setName("Suddharshan V");
        candidate2.setDepartment("Developer");
        candidate2.setEmail("suddharshan@gmail.com");
        printcandiateInfo(candidate2);

        Candidate candidate3=new Candidate();
        candidate3.setId(3);
        candidate3.setName("Logeswari ");
        candidate3.setDepartment("Developer");
        candidate3.setEmail("Logeswari@gmail.com");
        printcandiateInfo(candidate3);

        Candidate candidate4=new Candidate();
        candidate4.setId(4);
        candidate4.setName("Anusuya Devi R ");
        candidate4.setDepartment("Developer");
        candidate4.setEmail("Anusuya Devi R@gmail.com");
        printcandiateInfo(candidate4);

        Candidate candidate5=new Candidate();
        candidate5.setId(5);
        candidate5.setName("Kavi M ");
        candidate5.setDepartment("Developer");
        candidate5.setEmail("Kavi@gmail.com");
        printcandiateInfo(candidate5);

        Candidate candidate6=new Candidate(6,"Saran Raj I","Developer","saran@gmail.com");
        Candidate candidate7=new Candidate(7,"Yamini","Developer","Yamini@gmail.com");
        Candidate candidate8=new Candidate(8,"Sameera","Developer","Sameera@gmail.com");
        Candidate candidate9=new Candidate(9,"Tharunkumar","Developer","Tharunkumar@gmail.com");
        Candidate candidate10=new Candidate(10,"Mahalakshmi","Developer","Mahalakshmi@gmail.com");
        Candidate candidate11=new Candidate(11,"Fayas","Developer","Fayas@gmail.com");
        Candidate candidate12=new Candidate(12,"Madhanakumar","Developer","Madhanakumar@gmail.com");
        Candidate candidate13=new Candidate(13,"Kabilkumar","Developer","Kabilkumar@gmail.com");
        Candidate candidate14=new Candidate(14,"Vijayalakshmi","Developer","Vijayalakshmi@gmail.com");
        Candidate candidate15=new Candidate(15,"Fiyaz","Developer","Fiyaz@gmail.com");
        Candidate candidate16=new Candidate(16,"Mathinath","Developer","Mathinath@gmail.com");
        Candidate candidate17=new Candidate(17,"Subash","Developer","Subash@gmail.com");
        Candidate candidate18=new Candidate(18,"Harish","Developer","Harish@gmail.com");
        Candidate candidate19=new Candidate(19,"Arsath","Developer","Arsath@gmail.com");
        Candidate candidate20=new Candidate(20,"Gajendran","Developer","Gajendran@gmail.com");
        Candidate candidate21=new Candidate(21,"Arunkumar","Testing / Support","Arunkumar@gmail.com");
        Candidate candidate22=new Candidate(22,"Vasanth","Testing / Support","Vasanth@gmail.com");
        Candidate candidate23=new Candidate(23,"Nandhakumar","Testing / Support","Nandhakumar@gmail.com");
        Candidate candidate24=new Candidate(24,"Ramya","Testing / Support","Ramya@gmail.com");
        Candidate candidate25=new Candidate(25,"Neha","Testing / Support","Neha@gmail.com");
        Candidate candidate26=new Candidate(26,"Sabarishwaran","Testing / Support","Sabarishwaran@gmail.com");
        Candidate candidate27=new Candidate(27,"Elakkiya","Testing / Support","Elakkiya@gmail.com");
        Candidate candidate28=new Candidate(28,"Ellammal","Testing / Support","Ellammal@gmail.com");
        Candidate candidate29=new Candidate(29,"Kavibharathi","Testing / Support","Kavibharathi@gmail.com");
        Candidate candidate30=new Candidate(30,"Kabilan","Testing / Support","Kabilan@gmail.com");
        Candidate candidate31=new Candidate(31,"Velmurugan","Testing / Support","Velmurugan@gmail.com");
        Candidate candidate32=new Candidate(32,"Amarnath","Testing / Support","Amarnath@gmail.com");
        Candidate candidate33=new Candidate(33,"Vinothkumar","Testing / Support","Vinothkumar@gmail.com");
        Candidate candidate34=new Candidate(34,"Kanagavel","Testing / Support","Kanagavel@gmail.com");



        printcandiateInfo(candidate6);
        printcandiateInfo(candidate7);
        printcandiateInfo(candidate8);
        printcandiateInfo(candidate9);
        printcandiateInfo(candidate10);
        printcandiateInfo(candidate11);
        printcandiateInfo(candidate12);
        printcandiateInfo(candidate13);
        printcandiateInfo(candidate14);
        printcandiateInfo(candidate15);
        printcandiateInfo(candidate16);
        printcandiateInfo(candidate17);
        printcandiateInfo(candidate18);
        printcandiateInfo(candidate19);
        printcandiateInfo(candidate20);
        printcandiateInfo(candidate21);
        printcandiateInfo(candidate22);
        printcandiateInfo(candidate23);
        printcandiateInfo(candidate24);
        printcandiateInfo(candidate25);
        printcandiateInfo(candidate26);
        printcandiateInfo(candidate27);
        printcandiateInfo(candidate28);
        printcandiateInfo(candidate29);
        printcandiateInfo(candidate30);
        printcandiateInfo(candidate31);
        printcandiateInfo(candidate32);
        printcandiateInfo(candidate33);
        printcandiateInfo(candidate34);





        Planet Mercury=new Planet();
        Mercury.setPlanet("Mercury");
        Mercury.setSize("3,032");
        Mercury.setColor("Grayish and rocky");
        Mercury.setNoOfMoon(0);

        Planet Venus=new Planet();
        Venus.setPlanet("Venus");
        Venus.setSize("7,520");
        Venus.setColor("Yellowish-white");
        Venus.setNoOfMoon(0);

        Planet Earth=new Planet();
        Earth.setPlanet("Earth");
        Earth.setSize("7,917");
        Earth.setColor("Blue and green");
        Earth.setNoOfMoon(1);

        Planet Mars=new Planet();
        Mars.setPlanet("Mars");
        Mars.setSize("4,212");
        Mars.setColor("Red");
        Mars.setNoOfMoon(2);


        Planet Jupiter=new Planet("Jupiter","86,881","Brown with white clouds",79);
        Planet Saturn=new Planet("Saturn","72,366","Yellowish with rings",82);
        Planet Uranus=new Planet("Uranus","31,518","Light blue/green",27);
        Planet Neptune=new Planet("Neptune","30,598","Dark blue",14);
        Planet Pluto=new Planet("Pluto","1,473","Brown and white with some red",5);


        printPlanetInfo(Venus);
    }
}
