package by.epam.stone.entities;

public class Coral extends SemipreciousStone {

    private final static Type type = Type.CORAL;
    private Form form;
    private int size;

    public Coral() {
        this.form = Form.UNDEFINED;
        this.size = 0;
    }

    public Coral(Form form) {
        this.form = form;
        this.size = 0;
    }

    public Coral(Form form, int size) {
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

    public Type getType() {
        return this.type;
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
        builder.append("\nType: ").append(this.getType().toString());
        builder.append("\nForm: ").append(this.getForm().toString());
        builder.append("\nSize: ").append(this.getSize());
        return builder.toString();
    }
}
