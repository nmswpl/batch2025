package in.co.nmsworks.week3.set1;

import java.util.StringTokenizer;

public class EncryptionDecryption
{
    public String encryption(int number){
        return Integer.toBinaryString(number);
    }

    public int decryption(String encryption){
        return Integer.parseInt(encryption);
    }

    public static void main(String[] args) {
        EncryptionDecryption encryptionDecryption = new EncryptionDecryption();
        String encryption = encryptionDecryption.encryption(22);
        int decryption = encryptionDecryption.decryption(String.valueOf(Integer.parseInt(encryption,2)));
        System.out.println("int : "+22);
        System.out.println("int to binary String : "+encryption);
        System.out.println(("String binary to int : "+decryption));
    }
}
