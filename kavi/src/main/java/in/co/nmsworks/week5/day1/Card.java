package in.co.nmsworks.week5.day1;
class Card {
    private String value;
    private String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return value +" "+suit;
    }


}

