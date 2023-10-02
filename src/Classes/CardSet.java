package Classes;

public class CardSet {
    String name;
    int numberOfCards;
    double price;
    int releaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public CardSet() {
    }

    public CardSet(String name, int numberOfCards, double price, int releaseDate) {
        this.name = name;
        this.numberOfCards = numberOfCards;
        this.price = price;
        this.releaseDate = releaseDate;
    }
    public void GoToCardSetPage(){} 
}
