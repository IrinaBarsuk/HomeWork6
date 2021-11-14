package HomeWork7;

enum FormOfBrilliant{
    Princes, Marquise, Oval, Heart
}
public class Brilliant extends Stone{
    private FormOfBrilliant form;

    public Brilliant(String name, double weight, double price, double transparencyCategory,
                     FormOfBrilliant form) {
        super(name, weight, price, transparencyCategory);
        this.name = "Brilliant";
        this.form = form;
    }

    public String toString(){
        String result = String.format("Наименование камня: %s, вес камня в каратах: %.2f, " +
                        "стоимость камня: %.2f, категория прозрачности: %.2f; \n", getName(), getWeight(), getPrice(),
                getTransparencyCategory());
        return result;
    }
}
