package in.co.nmsworks.week5.day1;

import java.util.*;

public class CardsPlayers
{

    public static void main(String[] args)
    {
        CardsPlayers cardsPlayers = new CardsPlayers();
        List<Card> cards = new ArrayList<>();
        cardsPlayers.generateCards(cards);
        Map<Integer, Set<Card>> players = new HashMap<>();
        cardsPlayers.createPlayer(players, cards);
        cardsPlayers.printPlayerCards(players);
    }

    private void printPlayerCards(Map<Integer, Set<Card>> players)
    {

        for (Map.Entry<Integer, Set<Card>> player : players.entrySet())
        {
            int i = 1;
            System.out.println("Player number : "+ player.getKey());
            System.out.println("Cards Having ");
            for (Card card : player.getValue())
            {
                System.out.println(card + "          "+i);
                i++;
            }
        }
    }

    private void createPlayer(Map<Integer, Set<Card>> players, List<Card> cards)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players : ");
        int countOfPlayers = scanner.nextInt();

        CardsPlayers cardsPlayers = new CardsPlayers();
        cardsPlayers.shuffleCards(cards);

        int playerI = 0;
        for (Card card : cards) 
        {
            if (players.get(playerI) == null)
            {
                Set<Card> temp = new HashSet<>();
                temp.add(card);
                players.put(playerI,temp);
            }
            else
            { 
            players.get(playerI).add(card);
            }
            playerI++;
            playerI %= countOfPlayers;
        }

    }

    private void shuffleCards(List<Card> cards) 
    {
        Collections.shuffle(cards);
    }

    private void generateCards(List<Card> cards)
    {
        String[] values = {"a","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] shapes = {"SPADE","HEART","DIAMOND","CLUB"};

        for (String shape : shapes)
        {
            for (String val : values)
            {
                cards.add(new Card(shape,val));
            }
        }
    }
    
}
