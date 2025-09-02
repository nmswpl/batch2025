package in.co.nmsworks.week5;

import java.util.*;

public class CardRunner
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.of Players : ");
        int noOfPlayers = sc.nextInt();



        List<String> heart = Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "h11", "h12", "h13");
        List<String> diamond = Arrays.asList("d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13");
        List<String> clover = Arrays.asList("c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "c11", "c12", "c13");
        List<String> spade = Arrays.asList("s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11", "s12", "s13");

        List<String> deck = new ArrayList<>();
        deck.addAll(heart);
        deck.addAll(diamond);
        deck.addAll(clover);
        deck.addAll(spade);

        Collections.shuffle(deck);

        Map<Integer , List<String>> playersAndCard = new HashMap<>();

        for (int i = 0; i < deck.size(); i++)
        {
             int key = i%noOfPlayers;
            playersAndCard.computeIfAbsent( key,k->new ArrayList<>()).add(deck.get(i));
        }

        for (Map.Entry<Integer, List<String>> integerListEntry : playersAndCard.entrySet())
        {
            int playersKey = integerListEntry.getKey()+1;
            System.out.println("Player " + playersKey + " cards : " + integerListEntry.getValue());
        }

    }
}
