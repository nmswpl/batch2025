package in.co.nmsworks.week5.day1;

import java.util.*;

public class CardSimulator {
    public static void main(String[] args) {

        CardSimulator cs = new CardSimulator();

        List<String> players = new ArrayList<>();
        players.add("Player A");
        players.add("Player B");
        players.add("Player C");

        List<Card> cards = new ArrayList<>();

        cards.add(new Card("Spade",1));
        cards.add(new Card("Spade",2));
        cards.add(new Card("Spade",3));
        cards.add(new Card("Spade",4));
        cards.add(new Card("Spade",5));
        cards.add(new Card("Spade",6));
        cards.add(new Card("Spade",7));
        cards.add(new Card("Spade",8));
        cards.add(new Card("Spade",9));
        cards.add(new Card("Spade",10));
        cards.add(new Card("Spade",11));
        cards.add(new Card("Spade",12));
        cards.add(new Card("Spade",13));

        cards.add(new Card("Clover",1));
        cards.add(new Card("Clover",2));
        cards.add(new Card("Clover",3));
        cards.add(new Card("Clover",4));
        cards.add(new Card("Clover",5));
        cards.add(new Card("Clover",6));
        cards.add(new Card("Clover",7));
        cards.add(new Card("Clover",8));
        cards.add(new Card("Clover",9));
        cards.add(new Card("Clover",10));
        cards.add(new Card("Clover",11));
        cards.add(new Card("Clover",12));
        cards.add(new Card("Clover",13));

        cards.add(new Card("Heart",1));
        cards.add(new Card("Heart",2));
        cards.add(new Card("Heart",3));
        cards.add(new Card("Heart",4));
        cards.add(new Card("Heart",5));
        cards.add(new Card("Heart",6));
        cards.add(new Card("Heart",7));
        cards.add(new Card("Heart",8));
        cards.add(new Card("Heart",9));
        cards.add(new Card("Heart",10));
        cards.add(new Card("Heart",11));
        cards.add(new Card("Heart",12));
        cards.add(new Card("Heart",13));

        cards.add(new Card("Diamond",1));
        cards.add(new Card("Diamond",2));
        cards.add(new Card("Diamond",3));
        cards.add(new Card("Diamond",4));
        cards.add(new Card("Diamond",5));
        cards.add(new Card("Diamond",6));
        cards.add(new Card("Diamond",7));
        cards.add(new Card("Diamond",8));
        cards.add(new Card("Diamond",9));
        cards.add(new Card("Diamond",10));
        cards.add(new Card("Diamond",11));
        cards.add(new Card("Diamond",12));
        cards.add(new Card("Diamond",13));

        int cardsPerPlayer = cards.size()/ players.size();

        Map<String,List<Card>> playerCards = cs.distributeCards(players,cards,cardsPerPlayer);
        System.out.println(playerCards);
    }

    public Map<String,List<Card>> distributeCards(List<String> players,List<Card> cards,int cardsPerPlayer){
        Collections.shuffle(cards);
        Map<String,List<Card>> playerCards = new LinkedHashMap<>();
        int card = 0;
        for (String player : players) {
            List<Card> cardsOfPlayer = new ArrayList<>();
            for(int i = 0; i<cardsPerPlayer; i++){
                cardsOfPlayer.add(cards.get(card++));
            }
            playerCards.put(player,cardsOfPlayer);

            System.out.println(player + " has " + playerCards.get(player));
            System.out.println();
        }
        return playerCards;
    }
}
