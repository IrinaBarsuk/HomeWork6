package HomeWork7;

enum FormOfGarnet{
    PIROP, RODOLIT, SPESSERTIN, YVAROVIT
}
public class Garnet extends Stone{
    private FormOfGarnet form;

    public Garnet(String name, double weight, double price, double transparencyCategory, FormOfGarnet form) {
        super(name, weight, price, transparencyCategory);
        this.name = "Garnet";
        this.form = form;
    }

    public String toString(){
        String result = String.format("Наименование камня: %s, вес камня в каратах: %.2f, " +
                        "стоимость камня: %.2f, категория прозрачности: %.2f; \n", getName(), getWeight(), getPrice(),
                getTransparencyCategory());
        return result;
    }
}
