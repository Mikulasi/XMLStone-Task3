package by.epam.stone.entities;

public class Stone {
    private int id;
    private String name;
    private int weight;
    private String color;
    private int hardness;
    private double transparency;
    private String origin;
    private int faces;
    private PreciousStone preciousStone;
    private SemipreciousStone semipreciousStone;
    private String preciousness;
    private int value;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getOrigin(){
        return origin;
    }
    public void setOrigin(String origin){
        this.origin=origin;
    }
    public String getPreciousness(){
        return preciousness;
    }
    public void setPreciousness(String preciousness){
        this.preciousness=preciousness;
    }
    public int getFaces(){
        return faces;
    }
    public void setFaces(int faces){
        this.faces=faces;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public int getHardness() {
        return this.hardness;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    public double getTransparency() {
        return this.transparency;
    }

    public PreciousStone getPreciousStone(){
        return preciousStone;
    }
    public void setPreciousStone(PreciousStone stone){
        preciousStone=stone;
    }
    public SemipreciousStone getSemipreciousStone(){
        return semipreciousStone;
    }
    public void setSemipreciousStone(SemipreciousStone semipreciousStone){
        this.semipreciousStone=semipreciousStone;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getName());
        builder.append("\nWeight: ").append(this.getWeight());
        builder.append("\nColor: ").append(this.getColor().toString());
        builder.append("\nHardness: ").append(this.getHardness());
        builder.append("\nTransparency: ").append(this.getTransparency());
        return builder.toString();
    }
}