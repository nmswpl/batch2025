package in.co.nmsworks.week3.set1;

public class BonusQuestion {
    public static void main(String[] args) {
        BonusQuestion bonusQuestion = new BonusQuestion();
        bonusQuestion.decimalToBinary(9);
        bonusQuestion.binaryToDecimal("1000");

    }

    private void binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println(decimal);
    }

    private void decimalToBinary(int num) {
        String dTob = "";
        while(num > 0) {
            int rem = num % 2;
            dTob = rem + dTob;
            num = num / 2;
        }
        System.out.println(dTob);
    }



}

