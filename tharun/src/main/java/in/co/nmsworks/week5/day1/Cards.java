package in.co.nmsworks.week5.day1;

import java.util.*;

public class Cards {
    String spadCard = "sA s2 s3 s4 s5 s6 s7 s8 s9 s10 sJ sQ sK";
    String [] spadArray = spadCard.split(" ");

    String cloverCard = "cA c2 c3 c4 c5 c6 c7 c8 c9 c10 cJ cQ cK";
    String [] cloverArray = cloverCard.split(" ");

    String heartinCard = "hA h2 h3 h4 h5 h6 h7 h8 h9 h10 hJ hQ hK";
    String [] heartinArray = heartinCard.split(" ");

    String diamondCard = "dA d2 d3 d4 d5 d6 d7 d8 d9 d10 dJ dQ dK";
    String [] diamondArray = diamondCard.split(" ");


    private  List<String> fullCards = new ArrayList<>();

    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.cardCreation();
    }
    public void cardCreation()
    {
        insertValue(spadArray);
        insertValue(cloverArray);
        insertValue(heartinArray);
        insertValue(diamondArray);

        System.out.println(fullCards);

        cardShuffle();
        System.out.println(fullCards);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No.of Players");
        int noOfPlayers = scanner.nextInt();
        List<List<String>> playerCards = new ArrayList<>();

        for (int i = 0; i < noOfPlayers; i++) {
            playerCards.add(new ArrayList<>());
        }

        for (int i = 0 , j = 0; i <= noOfPlayers && j < fullCards.size() ; i++ ,j++) {
            i = i % noOfPlayers;
            playerCards.get(i).add(fullCards.get(j));
        }
        System.out.println(playerCards);

//        for (int i = 0; i < noOfPlayers ; i++) {
//            List<String> player = new ArrayList<>();
//            int j = i;
//            while (j < fullCards.size())
//            {
//                player.add(fullCards.get(j));
//                j +=  noOfPlayers;
//            }
//            playerCards.add(player);
//        }

        System.out.println(playerCards);
    }

    public void insertValue(String[] cardsArray)
    {
        for (String values : cardsArray) {
            fullCards.add(values);
        }
    }

    public void cardShuffle(){
        Collections.shuffle(fullCards);
    }

}
