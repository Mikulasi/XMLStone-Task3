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
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public int getHardness() {
        return hardness;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    public double getTransparency() {
        return transparency;
    }

    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", hardness=" + hardness +
                ", transparency=" + transparency +
                ", origin='" + origin + '\'' +
                ", faces=" + faces +
                ", preciousness='" + preciousness + '\'' +
                ", value=" + value +
                '}';
    }

}