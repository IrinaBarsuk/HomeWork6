package HomeWork7;

public class Stone implements Comparable<Stone>{
    protected String name;
    protected double weight;
    protected double price;
    protected double transparencyCategory;

    public Stone(String name, double weight, double price, double transparencyCategory) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparencyCategory = transparencyCategory;
    }

    @Override
    public int compareTo(Stone stone) {
        Double price1 = getPrice();
        Double price2 = stone.getPrice();
        return price1.compareTo(price2);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getTransparencyCategory() {
        return transparencyCategory;
    }
}
