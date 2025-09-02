package in.co.nmsworks.week5.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Hearts", "Clovers", "Diamonds", "Spades"};


        List<Card> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(value, suit));
            }
        }

        System.out.print("Enter the number of player: ");
        int numPlayers = scanner.nextInt();

        Collections.shuffle(deck);


        List<List<Card>> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new ArrayList<>());
        }

        for (int i = 0; i < deck.size(); i++) {
            players.get(i % numPlayers).add(deck.get(i));
        }


        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i+1) + " cards" + players.get(i).size());
            for (Card card : players.get(i)) {
                System.out.println(card);
            }
        }

    }
}
