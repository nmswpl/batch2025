package in.co.nmsworks.week1.day2;

public class FloatMultiplying {
    /* Multiply Two Floating Numbers */
    public float multiplyingFloat(float a, float b){
       return a * b;
    }
    public static void main(String[] args) {
        FloatMultiplying fm = new FloatMultiplying();
        System.out.println("Multiple Value of Two Floating Numbers is :"+fm.multiplyingFloat(23.3f,4.5f));
    }
}
