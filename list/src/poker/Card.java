package poker;

public class Card {
    public String suit;    //花色
    public String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "{" +
                '\'' + suit + '\'' +
                '\'' + rank + '\'' +
                '}';
    }
}
