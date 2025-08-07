package in.co.nmsworks.week1.day2.First;

public class LetterPattern {
    static void displayLetterPattern(){


        char let = 'A';
        for (int i = 0; i < 7; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(let);
            }
            let ++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        displayLetterPattern();

    }
}

