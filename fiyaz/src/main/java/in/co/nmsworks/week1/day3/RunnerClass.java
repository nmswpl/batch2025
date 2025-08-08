package in.co.nmsworks.week1.day3;


public class RunnerClass  {
    public static void main(String[] args) {

//        CandidateInfo infoOfstudent1 = new CandidateInfo();
//
//        infoOfstudent1.setId(1);
//        infoOfstudent1.setName("Fiyaz");
//        infoOfstudent1.setEmail("fiyaz@gmail.com");
//        infoOfstudent1.setDepartment("SWE");
//
//        CandidateInfo infoOfstudent2 = new CandidateInfo();
//
//        infoOfstudent2.setId(2);
//        infoOfstudent2.setName("Gaja");
//        infoOfstudent2.setEmail("gaja@gmail.com");
//        infoOfstudent2.setDepartment("SWE");
//
//        CandidateInfo infoOfstudent3 = new CandidateInfo();
//
//        infoOfstudent3.setId(3);
//        infoOfstudent3.setName("Amar");
//        infoOfstudent3.setEmail("amar@gmail.com");
//        infoOfstudent3.setDepartment("QAE");
//
//        CandidateInfo infoOfstudent4 = new CandidateInfo();
//
//        infoOfstudent4.setId(4);
//        infoOfstudent4.setName("Velmurugan");
//        infoOfstudent4.setEmail("velmurugan@gmail.com");
//        infoOfstudent4.setDepartment("QAE");
//
//        CandidateInfo infoOfstudent5 = new CandidateInfo();
//
//        infoOfstudent5.setId(5);
//        infoOfstudent5.setName("Mohamed Asik M");
//        infoOfstudent5.setEmail("mohamed@gmail.com");
//        infoOfstudent5.setDepartment("SWE");
//
//        CandidateInfo infoOfstudent6 = new CandidateInfo();
//
//        infoOfstudent6.setId(6);
//        infoOfstudent6.setName("Suddharshan");
//        infoOfstudent6.setEmail("suddharshan");
//        infoOfstudent6.setDepartment("SWE");
//
//        CandidateInfo infoOfstudent7 = new CandidateInfo();
//
//        infoOfstudent7.setId(7);
//        infoOfstudent7.setName("Logeswari");
//        infoOfstudent7.setEmail("logeswari@gmail.com");
//        infoOfstudent7.setDepartment("SWE");
//
//        CandidateInfo infoOfstudent8 = new CandidateInfo();
//
//        infoOfstudent8.setId(8);
//        infoOfstudent8.setName("Anusuya Devi R");
//        infoOfstudent8.setEmail("anusuya@gmail.com");
//        infoOfstudent8.setDepartment("SWE");
//
//        CandidateInfo infoOfstudent9 = new CandidateInfo();
//
//        infoOfstudent9.setId(9);
//        infoOfstudent9.setName("Kavi");
//        infoOfstudent9.setEmail("kavi@gmail.com");
//        infoOfstudent9.setDepartment("SWE");
//
//        CandidateInfo infoOfstudent10 = new CandidateInfo();
//
//        infoOfstudent10.setId(10);
//        infoOfstudent10.setName("Saran Raj");
//        infoOfstudent10.setEmail("saran@gmail.com");
//        infoOfstudent10.setDepartment("SWE");
//
//
////        infoOfstudent1.printTheinfostudent();
////        infoOfstudent2.printTheinfostudent();
////        infoOfstudent3.printTheinfostudent();
////        infoOfstudent4.printTheinfostudent();
////        infoOfstudent5.printTheinfostudent();
////        infoOfstudent6.printTheinfostudent();
////        infoOfstudent7.printTheinfostudent();
////        infoOfstudent8.printTheinfostudent();
////        infoOfstudent9.printTheinfostudent();
////        infoOfstudent10.printTheinfostudent();
//

        PlanetClass  mercury = new PlanetClass();

        mercury.setPlanet("Mercury");
        mercury.setSize(3020);
        mercury.setColor("Grayish and rocky");
        mercury.setNumOfmoon(0);

        PlanetClass venus = new PlanetClass();

        venus.setPlanet("Venus");
        venus.setSize(7520);
        venus.setColor("Yellowish-white");
        venus.setNumOfmoon(0);

        PlanetClass earth = new PlanetClass();

        earth.setPlanet("Earth");
        earth.setSize(7917);
        earth.setColor("Blue and green");
        earth.setNumOfmoon(1);

        PlanetClass mars = new PlanetClass();

        mars.setPlanet("Mars");
        mars.setSize(4212);
        mars.setColor("Red");
        mars.setNumOfmoon(2);

        PlanetClass jupiter = new PlanetClass();

        jupiter.setPlanet("Jupiter");
        jupiter.setSize(86881);
        jupiter.setColor("Brown with white clouds");
        jupiter.setNumOfmoon(79);

        PlanetClass saturn = new PlanetClass();

        saturn.setPlanet("Saturn");
        saturn.setSize(72366);
        saturn.setColor("Yellowish with rings");
        saturn.setNumOfmoon(82);

        PlanetClass uranus = new PlanetClass();

        uranus.setPlanet("Uranus");
        uranus.setSize(31518);
        uranus.setColor("Light blue/green");
        uranus.setNumOfmoon(27);

        PlanetClass neptune = new PlanetClass();

        neptune.setPlanet("Neptune");
        neptune.setSize(30598);
        neptune.setColor("Dark blue");
        neptune.setNumOfmoon(14);

        PlanetClass pluto = new PlanetClass();

        pluto.setPlanet("Pluto");
        pluto.setSize(1473);
        pluto.setColor("Brown and white with some red");
        pluto.setNumOfmoon(5);

        mercury.printTemp();
        venus.printTemp();
        earth.printTemp();
        mars.printTemp();
        jupiter.printTemp();
        saturn.printTemp();
        uranus.printTemp();
        neptune.printTemp();
        pluto.printTemp();

    }



}
