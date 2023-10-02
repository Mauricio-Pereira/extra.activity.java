package Classes;

public class Card {
    String name;
    String mana;
    String imageUrl;
    String type;
    String subtype;
    String rarity;
    String abilityDescription;
    String illustrator;
    String ability;
    String statusDescription;
    int attack;
    int defense;
    boolean status;

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getAbilityDescription() {
        return abilityDescription;
    }

    public void setAbilityDescription(String abilityDescription) {
        this.abilityDescription = abilityDescription;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Card() {
    }

    public Card(String name, String mana, String imageUrl, String type, String subtype, String rarity, String abilityDescription, String illustrator, String ability, String statusDescription, int attack, int defense, boolean status) {
        this.name = name;
        this.mana = mana;
        this.imageUrl = imageUrl;
        this.type = type;
        this.subtype = subtype;
        this.rarity = rarity;
        this.abilityDescription = abilityDescription;
        this.illustrator = illustrator;
        this.ability = ability;
        this.statusDescription = statusDescription;
        this.attack = attack;
        this.defense = defense;
        this.status = status;
    }
    public void SeeCardSet(){}
    public void BuyOnTCG(){}
    public void BuyOnCardMarket(){}
    public void BuyOnCardHoarder(){}
}
