package by.epam.stone.entities;

public class PreciousStone extends SemipreciousStone {

    private String name;
    private boolean rarity;

    public PreciousStone() {
        this.name = "no name";
        this.rarity = false;
    }

    public PreciousStone(String name) {
        this.name = name;
        this.rarity = false;
    }

    public PreciousStone(String name, boolean rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public void setName(String name) {
        if (null == name) {
            this.name = "no name";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setRarity(boolean rarity) {
        this.rarity = rarity;
    }

    public boolean isRarity() {
        return this.rarity;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getName());
        builder.append("\nWeight: ").append(this.getWeight());
        builder.append("\nColor: ").append(this.getColor().toString());
        builder.append("\nHardness: ").append(this.getHardness());
        builder.append("\nTransparency: ").append(this.getTransparency());
        builder.append("\nPrice: ").append(this.getPrice());
        builder.append("\nName: ").append(this.getName().toString());
        builder.append("\nRarity: ").append(this.isRarity());
        return builder.toString();
    }
}