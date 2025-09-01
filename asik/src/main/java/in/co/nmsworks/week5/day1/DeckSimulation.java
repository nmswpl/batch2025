package in.co.nmsworks.week5.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeckSimulation
{
    public static void main(String[] args)
    {
        /*Card spade1 = new Card("Spade", 1);
        Card spade2 = new Card("Spade", 2);
        Card spade3 = new Card("Spade", 3);
        Card spade4 = new Card("Spade", 4);
        Card spade5 = new Card("Spade", 5);
        Card spade6 = new Card("Spade", 6);
        Card spade7 = new Card("Spade", 7);
        Card spade8 = new Card("Spade", 8);
        Card spade9 = new Card("Spade", 9);
        Card spade10 = new Card("Spade", 10);
        Card spade11 = new Card("Spade", 11);
        Card spade12 = new Card("Spade", 12);
        Card spade13 = new Card("Spade", 13);

        Card heart1 = new Card("Heart", 1);
        Card heart2 = new Card("Heart", 2);
        Card heart3 = new Card("Heart", 3);
        Card heart4 = new Card("Heart", 4);
        Card heart5 = new Card("Heart", 5);
        Card heart6 = new Card("Heart", 6);
        Card heart7 = new Card("Heart", 7);
        Card heart8 = new Card("Heart", 8);
        Card heart9 = new Card("Heart", 9);
        Card heart10 = new Card("Heart", 10);
        Card heart11 = new Card("Heart", 11);
        Card heart12 = new Card("Heart", 12);
        Card heart13 = new Card("Heart", 13);

        Card diamond1 = new Card("Diamond", 1);
        Card diamond2 = new Card("Diamond", 2);
        Card diamond3 = new Card("Diamond", 3);
        Card diamond4 = new Card("Diamond", 4);
        Card diamond5 = new Card("Diamond", 5);
        Card diamond6 = new Card("Diamond", 6);
        Card diamond7 = new Card("Diamond", 7);
        Card diamond8 = new Card("Diamond", 8);
        Card diamond9 = new Card("Diamond", 9);
        Card diamond10 = new Card("Diamond", 10);
        Card diamond11 = new Card("Diamond", 11);
        Card diamond12 = new Card("Diamond", 12);
        Card diamond13 = new Card("Diamond", 13);

        Card clover1 = new Card("Clover", 1);
        Card clover2 = new Card("Clover", 2);
        Card clover3 = new Card("Clover", 3);
        Card clover4 = new Card("Clover", 4);
        Card clover5 = new Card("Clover", 5);
        Card clover6 = new Card("Clover", 6);
        Card clover7 = new Card("Clover", 7);
        Card clover8 = new Card("Clover", 8);
        Card clover9 = new Card("Clover", 9);
        Card clover10 = new Card("Clover", 10);
        Card clover11 = new Card("Clover", 11);
        Card clover12 = new Card("Clover", 12);
        Card clover13 = new Card("Clover", 13);

        Collections.addAll(deck, spade1, spade2, spade3, spade4, spade5, spade6, spade7, spade8, spade9, spade10, spade11, spade12, spade13, heart1, heart2, heart3, heart4, heart5, heart6, heart7, heart8, heart9, heart10, heart11, heart12, heart13, diamond1, diamond2, diamond3, diamond4, diamond5, diamond6, diamond7, diamond8, diamond9, diamond10, diamond11, diamond12, diamond13, clover1, clover2, clover3, clover4, clover5, clover6, clover7, clover8, clover9, clover10, clover11, clover12, clover13);
        */

        List<Card> deck = new ArrayList<>();
        String[] shapes = new String[] {"Heart", "Spade", "Clover", "Diamond"};

        for (String shape : shapes) {
            for (int i = 1; i < 14; i++) {
                deck.add(new Card(shape, i));
            }

        }


        Collections.shuffle(deck);
        System.out.println(deck);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No Of Players : ");
        int noOfPlayers = sc.nextInt();
        sc.nextLine();

        List<List<Card>> playersCard = new ArrayList<>();

        for (int i = 0; i < noOfPlayers; i++)
        {
            playersCard.add(new ArrayList<>());
        }

        for (int i = 0; i < deck.size(); i++)
        {
            int index = i % noOfPlayers;
            playersCard.get(index).add(deck.get(i));

        }
        int playerNo = 1;
        for (List<Card> player : playersCard)
        {
            System.out.println("Player " + playerNo++ + " : " + player);
        }
    }
}
