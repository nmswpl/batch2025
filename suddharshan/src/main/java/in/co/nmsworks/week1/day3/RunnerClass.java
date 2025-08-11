package in.co.nmsworks.week1.day3;

public class RunnerClass {
    public static void main(String[] args) {
        Candidate MohamedAsik = new Candidate(1, "MohammedAsik", "mohammed@nmsworks.co.in", "Developer");
        Candidate Suddharshan = new Candidate(2, "Suddharshan", "suddharshan@nmsworks.co.in", "Developer");
        Candidate Logeswari = new Candidate(3, "Logeswari", "logeswari@nmsworks.co.in", "Developer");
        Candidate AnusyaDevi = new Candidate(4, "AnusyaDevi", "anusyadevi@nmsworks.co.in", "Developer");
        Candidate Kavi = new Candidate(5, "Kavi", "kavi@nmsworks.co.in", "Developer");
        Candidate c1 = new Candidate();
        Candidate SaranRaj = new Candidate();
        SaranRaj.setId(6);
        SaranRaj.setName("SaranRaj");
        SaranRaj.setEmail("saranraj@nmsworks.co.in");
        SaranRaj.setDept("Developer");


        Candidate Yamini = new Candidate();
        Yamini.setId(7);
        Yamini.setName("Yamini");
        Yamini.setEmail("yamini@nmsworks.co.in");
        Yamini.setDept("Developer");

        Candidate SameeraBanu = new Candidate();
        SameeraBanu.setId(8);
        SameeraBanu.setName("SameeraBanu");
        SameeraBanu.setEmail("sameerbanu@nmsworks.co.in");
        SameeraBanu.setDept("Developer");

        Candidate TharunKumar = new Candidate();
        TharunKumar.setId(9);
        TharunKumar.setName("TharunKumar");
        TharunKumar.setEmail("tharunkumar@nmsworks.co.in");
        TharunKumar.setDept("Developer");

        Candidate Mahalakshmi = new Candidate();
        Mahalakshmi.setId(10);
        Mahalakshmi.setName("Mahalakshmi");
        Mahalakshmi.setEmail("mahalakshmi@nmsworks.co.in");
        Mahalakshmi.setDept("Developer");

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
    }
}
