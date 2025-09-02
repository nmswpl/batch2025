package in.co.nmsworks.week5;

import java.util.*;

public class CardPersistor {
    public static void main(String[] args) {

        CardPersistor cp = new CardPersistor();

        List<Card> cards = new ArrayList<>();

        String[] shapes = new String[]{"clover", "spad", "heart", "diamond"};

        String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};

        for (String s : shapes) {
            for (String number : numbers) {
                Card c = new Card(s, number);
                cards.add(c);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of players : ");
        int n = sc.nextInt();

        Collections.shuffle(cards);

        int cardsPerPlayer = 52 / n;

        for (int i = 0; i < n; i++) {
            System.out.println("The cards for the " + (i + 1) + " Player is :");
            for (int j = 0 ; j < cardsPerPlayer; j++) {
                Card c = cards.removeFirst();
                System.out.println(c);
            }
            System.out.println();
        }

        if (!cards.isEmpty()) {
            for (Card c : cards) {
                System.out.println(c);
            }
        }








    }
}