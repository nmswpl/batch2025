package in.co.nmsworks.week5.day1;

import java.util.*;

public class CardsRunner {
    public static void main(String[] args) {
        List<Card> deck = getNewDeck();

        Collections.shuffle(deck);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of Players : ");

        int num = scan.nextInt();
        List<List<Card>> players = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            players.add(new ArrayList<>());
        }

        for (int i = 0; i < deck.size(); i++) {
            players.get(i % num).add(deck.get(i));
        }

        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player"+(i+1)+" cards : \n"+players.get(i).toString());
            System.out.println();
        }
    }

    private static List<Card> getNewDeck() {
        List<Card> deck = new ArrayList<>();
        String[] suits = new String[]{"Hearts","Diamond","Spade","Clover"};
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(suit,i));
            }
        }
        return deck;
    }
}
