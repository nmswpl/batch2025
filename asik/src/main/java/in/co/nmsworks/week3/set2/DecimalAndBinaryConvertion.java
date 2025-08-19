package in.co.nmsworks.week3.set2;

public class DecimalAndBinaryConvertion
{
    public static void main(String[] args)
    {
        String binary = decimalToBinary(13);
        System.out.println(binary);

        int num = binaryToDecimal(binary);
        System.out.println(num);
    }

    private static int binaryToDecimal(String binary)
    {
        int num = 1;
        int decimal = 0;

        for (int i = binary.length() - 1; i >= 0; i--)
        {
            if (binary.charAt(i) == '1')
            {
                decimal += num;
            }
            num = num * 2;
        }

        return decimal;
    }

    private static String decimalToBinary(int num)
    {
        String binary = "";

        while (num > 0)
        {
            int remainder = num % 2;
            binary = remainder + binary;
            num /= 2;
        }

        return binary;
    }
}
