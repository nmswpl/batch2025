package in.co.nmsworks.week1.day2.Patten;



//Alphabet Pattern 1 :
//A
//B B
//C C C
//D D D D
//E E E E E
//F F F F F F
//G G G G G G G



public class AlphabetPattern1 {
    public static void alphabetPattern1(int num){
        char CharValue = 65;
        for (int i = 0; i < num; i++){

            for (int j = 0; j <= i; j++){

                System.out.print(CharValue + " ");
            }
            System.out.println(" ");
            CharValue++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Alphabet Pattern");
        alphabetPattern1(7);
    }
}
