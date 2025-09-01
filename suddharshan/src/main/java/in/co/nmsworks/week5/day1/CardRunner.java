package in.co.nmsworks.week5.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardRunner {
    public static void main(String[] args) {
        CardRunner cr = new CardRunner();
        cr.generateDisList(13);
    }
    public void generateDisList(int noOfPlayers){
        CardDeck cd = new CardDeck();
        cd.generate();
        cd.shuffle();
        List <Card> cardList = cd.getCardList();
        Map<Integer, List<Card>> disList = new HashMap<>();

        for (int i = 0; i < cardList.size(); i++) {
            int rem = i % noOfPlayers;
            if(rem == 0){
                int val = rem + noOfPlayers;
                if(disList.containsKey(val)){
                    List <Card> updList = disList.get(val);
                    updList.add(cardList.get(i));
                    disList.replace(val,updList);
                }
                else{
                    List <Card> newList = new ArrayList<>();
                    newList.add(cardList.get(i));
                    disList.put(val,newList);
                }
            }
            else{
                if(disList.containsKey(rem)){
                    List <Card> updList = disList.get(rem);
                    updList.add(cardList.get(i));
                    disList.replace(rem,updList);
                }
                else{
                    List <Card> newList = new ArrayList<>();
                    newList.add(cardList.get(i));
                    disList.put(rem,newList);
                }
            }
        }
        int playerNo = 0;
        for (Map.Entry<Integer, List<Card>> integerListEntry : disList.entrySet()) {
            System.out.println("Player " + ++playerNo + " cards: ");
            for (Card card : integerListEntry.getValue()) {
                System.out.print(card.getShape() + "-" + card.getValue() + " ");
            }
            System.out.println();
        }
    }
}
