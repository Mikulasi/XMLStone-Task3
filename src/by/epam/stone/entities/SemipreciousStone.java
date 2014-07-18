package by.epam.stone.entities;

public class SemipreciousStone extends Stone {

    private int price;

    public SemipreciousStone() {
        this.price = 0;
    }

    public SemipreciousStone(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
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
        return builder.toString();
    }
}