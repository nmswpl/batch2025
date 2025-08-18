package in.co.nmsworks.week1.day3;

public class RunnerPlanet {

    public static void main(String[] args) {


        Planet planet1=new Planet();
        planet1.setPlanet("Mercury");
        planet1.setSize(3032);
        planet1.setColor("white");
        planet1.setNoOfMoons(0);

        /*
        Planet	Size (Diameter in miles)	Color	Number of Moons
Mercury	3,032	Grayish and rocky	0
Venus	7,520	Yellowish-white	0
Earth	7,917	Blue and green	1
Mars	4,212	Red	2
Jupiter	86,881	Brown with white clouds	79
Saturn	72,366	Yellowish with rings	82
Uranus	31,518	Light blue/green	27
Neptune	30,598	Dark blue	14
Pluto	1,473	Brown and white with some red	5

         */


        Planet planet2=new Planet("venus",7520,"Yellowish-white ",0);
        Planet planet3=new Planet("Earth",7917," Blue and Green ",1);
        Planet planet4=new Planet("Mars",4212,"Red ",2);
        Planet planet5=new Planet("Jupiter",86881,"Brown with white clouds",79);
        Planet planet6=new Planet("Saturn",7236,"Yellowish-white ",82);
        Planet planet7=new Planet("Uranus",31518,"Light blue /green ",27);
        Planet planet8=new Planet("Neptune",30598,"Dark blue",14);
        Planet planet9=new Planet("Pluto",1473,"Brown and White with some red ",5);


        print(planet1);
        print(planet3);
        print(planet5);
    }
    public static void print(Planet planet)
    {
        System.out.println("Planet Name : " +planet.getPlanet() + '\n' +" Size (Diameter in size) : "+planet.getSize() +'\n'+"Planet color :"+ planet.getColor() +'\n'+"No of moons : "+ planet.getNoOfMoons());
    }
}
