package in.co.nmsworks.week5.day1;

import java.util.*;

public class CardSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardSimulator cs = new CardSimulator();

        List<String> players = new ArrayList<>();

        System.out.println("Enter the number of players: ");
        int noOfPlayers = sc.nextInt();

        for (int i = 1; i <= noOfPlayers ; i++) {
            System.out.println("Enter the player " + i + " name : ");
            String player = sc.next();
            players.add(player);
        }
        System.out.println();

        List<Card> cards = new ArrayList<>();

        for (int i = 1; i <=13 ; i++) {
            cards.add(new Card("Spade",i));
        }

        for (int i = 1; i <=13 ; i++) {
            cards.add(new Card("Clover",i));
        }

        for (int i = 1; i <=13 ; i++) {
            cards.add(new Card("Heart",i));
        }

        for (int i = 1; i <=13 ; i++) {
            cards.add(new Card("Diamond",i));
        }

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
