package in.co.nmsworks.week1.day3;

public class RunnerClass {
    public static void main(String[] args) {
        CandidateArray MohamedAsik = new CandidateArray(1, "MohammedAsik", "mohammed@nmsworks.co.in", "Developer");
        CandidateArray Suddharshan = new CandidateArray(2, "Suddharshan", "suddharshan@nmsworks.co.in", "Developer");
        CandidateArray Logeswari = new CandidateArray(3, "Logeswari", "logeswari@nmsworks.co.in", "Developer");
        CandidateArray AnusyaDevi = new CandidateArray(4, "AnusyaDevi", "anusyadevi@nmsworks.co.in", "Developer");
        CandidateArray Kavi = new CandidateArray(5, "Kavi", "kavi@nmsworks.co.in", "Developer");
        CandidateArray c1 = new CandidateArray();
        CandidateArray SaranRaj = new CandidateArray();
        SaranRaj.setId(6);
        SaranRaj.setName("SaranRaj");
        SaranRaj.setEmail("saranraj@nmsworks.co.in");
        SaranRaj.setDept("Developer");


        CandidateArray Yamini = new CandidateArray();
        Yamini.setId(7);
        Yamini.setName("Yamini");
        Yamini.setEmail("yamini@nmsworks.co.in");
        Yamini.setDept("Developer");

        CandidateArray SameeraBanu = new CandidateArray();
        SameeraBanu.setId(8);
        SameeraBanu.setName("SameeraBanu");
        SameeraBanu.setEmail("sameerbanu@nmsworks.co.in");
        SameeraBanu.setDept("Developer");

        CandidateArray TharunKumar = new CandidateArray();
        TharunKumar.setId(9);
        TharunKumar.setName("TharunKumar");
        TharunKumar.setEmail("tharunkumar@nmsworks.co.in");
        TharunKumar.setDept("Developer");

        CandidateArray Mahalakshmi = new CandidateArray();
        Mahalakshmi.setId(10);
        Mahalakshmi.setName("Mahalakshmi");
        Mahalakshmi.setEmail("mahalakshmi@nmsworks.co.in");
        Mahalakshmi.setDept("Developer");
        System.out.println(TharunKumar.equals(Mahalakshmi));
        System.out.println(TharunKumar.toString());
        MohamedAsik.printCandidateInfo(MohamedAsik);
        Suddharshan.printCandidateInfo(Suddharshan);
        Logeswari.printCandidateInfo(Logeswari);
        AnusyaDevi.printCandidateInfo(AnusyaDevi);
        Kavi.printCandidateInfo(Kavi);
        SaranRaj.printCandidateInfo(SaranRaj);
        Yamini.printCandidateInfo(Yamini);
        SameeraBanu.printCandidateInfo(SameeraBanu);
        TharunKumar.printCandidateInfo(TharunKumar);
        Mahalakshmi.printCandidateInfo(Mahalakshmi);

        Planet Mercury = new Planet("Mercury", 3032, "GreyishAndRocky", 0);
        Planet Venus = new Planet("Venus", 7520, "YellowishWhite", 0);
        Planet Earth = new Planet("Earth", 7917, "BlueAndGreen", 1);
        Planet Mars = new Planet("Mars", 4212, "Red", 2);
        Planet Jupiter = new Planet("Jupiter", 86881, "BrownWithClouds", 79);
        Planet Saturn = new Planet("Saturn", 72336, "YellowishWithRings", 82);
        Planet Uranus = new Planet("Uranus", 31518, "LightBlue", 27);
        Planet Neptune = new Planet("Neptune", 30598, "DarkBlue", 14);
        Planet Pluto = new Planet("Pluto", 1473, "Brown", 5);

        Venus.printPlanetInfo(Venus);
        System.out.println(Venus.equals(Mercury));
        System.out.println(Venus.equals(Uranus));
        System.out.println(Earth.toString());
    }
}
