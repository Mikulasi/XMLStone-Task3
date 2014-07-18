package by.epam.stone.entities;

public class Diamond extends PreciousStone {

    private final static Type type = Type.DIAMOND;
    private Form form;
    private int size;

    public Diamond() {
        this.form = Form.UNDEFINED;
        this.size = 0;
    }

    public Diamond(Form form) {
        this.form = form;
        this.size = 0;
    }

    public Diamond(Form form, int size) {
        this.form = form;
        this.size = size;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Form getForm() {
        return this.form;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
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
        builder.append("\nType: ").append(this.type.toString());
        builder.append("\nForm: ").append(this.form.toString());
        builder.append("\nSize: ").append(this.size);
        return builder.toString();
    }
}
