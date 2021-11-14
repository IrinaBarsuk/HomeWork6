package HomeWork7;

enum FormOfSapphire{
    Yellow, BLUE, BLACK, PINK
}
public class Sapphire extends Stone{
    private FormOfSapphire form;

    public Sapphire(String name, double weight, double price, double transparencyCategory, FormOfSapphire form) {
        super(name, weight, price, transparencyCategory);
        this.name = "Sapphire";
        this.form = form;
    }

    public String toString(){
        String result = String.format("Наименование камня: %s, вес камня в каратах: %.2f, " +
                        "стоимость камня: %.2f, категория прозрачности: %.2f; \n", getName(), getWeight(), getPrice(),
                getTransparencyCategory());
        return result;
    }
}
