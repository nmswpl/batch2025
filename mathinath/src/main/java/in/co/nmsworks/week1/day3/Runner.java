package in.co.nmsworks.week1.day3;

public class Runner {
    public static void main(String[] args)
    {
        Candidate d1=new Candidate();
        d1.setId(01);
        d1.setName("Mohammad Asik");
        d1.setEmail("Mohammadasik@gmail.com");
        d1.setDepartment("developer");

        Candidate d2=new Candidate();
        d2.setId(02);
        d2.setName("Suddharsan");
        d2.setEmail("Suddharsan@gmail.com");
        d2.setDepartment("developer");

        Candidate d3=new Candidate();
        d3.setId(03);
        d3.setName("Lokeshwari");
        d3.setEmail("Lokeshwari@gmail.com");
        d3.setDepartment("developer");

        Candidate d4=new Candidate();
        d4.setId(04);
        d4.setName("Anusuyadevi");
        d4.setEmail("Anusuyadevi@gmail.com");
        d4.setDepartment("developer");

        Candidate d5=new Candidate();
        d5.setId(05);
        d5.setName("kavi");
        d5.setEmail("kavi@gmail.com");
        d5.setDepartment("developer");

        Candidate d6=new Candidate();
        d6.setId(06);
        d6.setName("Saranraj");
        d6.setEmail("Saranraj@gmail.com");
        d6.setDepartment("developer");

        Candidate d7=new Candidate();
        d7.setId(07);
        d7.setName("yamini");
        d7.setEmail("yamini@gmail.com");
        d7.setDepartment("developer");

        Candidate d8=new Candidate();
        d8.setId(8);
        d8.setName("Sameerabanu");
        d8.setEmail("Sameerabanu@gmail.com");
        d8.setDepartment("developer");

        Candidate d9=new Candidate();
        d9.setId(9);
        d9.setName("Tharunkumar");
        d9.setEmail("tharunkumar@gmail.com");
        d9.setDepartment("developer");

        Candidate d10=new Candidate();
        d10.setId(10);
        d10.setName("Mahalakshmi");
        d10.setEmail("Mahalakshmi@gmail.com");
        d10.setDepartment("developer");

        Candidate d11=new Candidate();
        d11.setId(11);
        d11.setName("Sheikfayas");
        d11.setEmail("Shiekfayas@gmail.com");
        d11.setDepartment("developer");

        Candidate d12=new Candidate();
        d12.setId(12);
        d12.setName("Lokeshwari");
        d12.setEmail("Lokeshwari@gmail.com");
        d12.setDepartment("developer");

//        printCandidateinfo(d1);
//        printCandidateinfo(d2);
//        printCandidateinfo(d3);
//        printCandidateinfo(d4);
//        printCandidateinfo(d5);
//        printCandidateinfo(d6);
//        printCandidateinfo(d7);
//        printCandidateinfo(d8);
//        printCandidateinfo(d9);
//        printCandidateinfo(d10);
//        printCandidateinfo(d11);

        Candidate d13=new Candidate(13,"Subash","subash@gmail.com","developer");
//        printCandidateinfo(d13);



//      For planet:

        Planet mercury=new Planet();
        mercury.setPlanet("Mercury");
        mercury.setSize(3032);
        mercury.setColor("grayish");
        mercury.setNumberOfMoons(0);

        Planet venus=new Planet();
        venus.setPlanet("venus");
        venus.setSize(7520);
        venus.setColor("yellowish white");
        venus.setNumberOfMoons(0);

        Planet earth=new Planet();
        earth.setPlanet("earth");
        earth.setSize(7917);
        earth.setColor("Blue adn green");
        earth.setNumberOfMoons(1);

        Planet mars=new Planet();
        mars.setPlanet("mars");
        mars.setSize(4212);
        mars.setColor("red");
        mars.setNumberOfMoons(2);

        Planet jupiter=new Planet();
        jupiter.setPlanet("jupiter");
        jupiter.setSize(86881);
        jupiter.setColor("brown");
        jupiter.setNumberOfMoons(79);

        Planet saturn=new Planet();
        saturn.setPlanet("saturn");
        saturn.setSize(72366);
        saturn.setColor("yellowish with rings");
        saturn.setNumberOfMoons(82);

        Planet uranus=new Planet();
        uranus.setPlanet("uranus");
        uranus.setSize(31518);
        uranus.setColor("Light blue and greenx");
        uranus.setNumberOfMoons(27);

        Planet neptune=new Planet();
        neptune.setPlanet("neptune");
        neptune.setSize(30958);
        neptune.setColor("dark blue");
        neptune.setNumberOfMoons(14);

        Planet pluto=new Planet();
        pluto.setPlanet("pluto");
        pluto.setSize(1473);
        pluto.setColor("Brown and white");
        pluto.setNumberOfMoons(5);

        printPlanetInfo(mercury);
        printPlanetInfo(venus);
        printPlanetInfo(earth);
        printPlanetInfo(mars);
        printPlanetInfo(jupiter);
        printPlanetInfo(saturn);
        printPlanetInfo(uranus);
        printPlanetInfo(neptune);
        printPlanetInfo(pluto);
        
        Planet p1=new Planet("venus",7520,"white",2);
        printPlanetInfo(p1);

    }
    public static void printPlanetInfo(Planet p)
    {
        System.out.println("Planet: "+p.getPlanet()+"\nSize: "+p.getSize()+"\nColor: "+p.getColor()+"\nNUmber of Moons: "+p.getNumnerOfMoons());
    }






    public static void printCandidateInfo(Candidate c)
    {
        System.out.println("id: "+c.getid()+"\nName:"+c.getname()+"\nemail: "+c.getemail()+"\ndepartment :"+c.getdepartment());

    }
}
