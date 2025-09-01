package in.co.nmsworks.week5.day1;

import java.util.*;

public class CardDeck {
    private List<Card> cardList;

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public void generate(){
        cardList = new ArrayList<>();
        for(int i = 1; i <= 13; i++){
            Card card = new Card("Spade",i);
            cardList.add(card);
        }
        for(int i = 1; i <= 13; i++){
            Card card = new Card("Clover",i);
            cardList.add(card);
        }
        for(int i = 1; i <= 13; i++){
            Card card = new Card("Heart",i);
            cardList.add(card);
        }
        for(int i = 1; i <= 13; i++){
            Card card = new Card("Diamond",i);
            cardList.add(card);
        }
    }
    public void shuffle(){
        Collections.shuffle(cardList);
    }

}
