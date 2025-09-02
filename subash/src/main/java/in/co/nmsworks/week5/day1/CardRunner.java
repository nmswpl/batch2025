package in.co.nmsworks.week5.day1;

import java.util.*;

public class CardRunner
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CardRunner cr = new CardRunner();
        List<List<String>> cardList= cr.generateCards();
        System.out.println("Enter the no of Players");
        int noOfPlayers = sc.nextInt();
        cr.distributeCards(cardList,noOfPlayers);
    }

    private void distributeCards(List<List<String>> cardList, int noOfPlayers)
    {
        int limit = 52/noOfPlayers;

        Collections.shuffle(cardList);

        Map<Integer,String[]> cardMap = new HashMap<>();



        for(int i=0;i<limit;i++)
        {
            for (List<String> strings : cardList)
            {

            }
        }

    }

    private List<List<String>> generateCards()
    {
        List<List<String>> cardList = new ArrayList<>();
        List<String> spade = new ArrayList<>();
        List<String> clover = new ArrayList<>();
        List<String> heart = new ArrayList<>();
        List<String> diamond = new ArrayList<>();

        for(int i=1;i<=13;i++)
        {
            spade.add("S"+i);
            clover.add("C"+i);
            heart.add("H"+i);
            diamond.add("D"+i);
        }

        cardList.add(spade);
        cardList.add(clover);
        cardList.add(heart);
        cardList.add(diamond);

        System.out.println(cardList);

        return cardList;

    }

}
