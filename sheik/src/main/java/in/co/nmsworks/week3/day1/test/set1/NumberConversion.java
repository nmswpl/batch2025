package in.co.nmsworks.week3.day1.test.set1;

public class NumberConversion
{
    public static void main(String[] args) {
        int dec = 8;
        String bin = "1001";
        decToBinary(dec);
        binToDecimal(bin);
    }

    public static void decToBinary(int dec){
        int  org = dec;
        String binary = "";
        while(dec>0) {
            int rem = dec % 2;
            binary = rem + binary;
            dec = dec / 2;
        }
        System.out.println("Binary of " + org + " : " +binary);
    }
    public static void binToDecimal(String bin){
        String org = bin;
        int binary = Integer.parseInt(bin);
        int i =0;
        int sum =0;
        while(binary>0){
            int rem = binary % 10;
            int decimal = (int) (Math.pow(2,i) * rem);
            sum = sum + decimal;
            binary =binary/10;
            i++;
        }
        System.out.println("Deciaml 0f " + org + " : " +sum);

    }
}
