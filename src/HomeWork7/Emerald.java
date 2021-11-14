package HomeWork7;

enum FormOfEmerald{
    RUSSIAN, ZAMBIAN, BRAZILIAN, COLOMBIAN
}

public class Emerald extends Stone {
    private FormOfEmerald form;

    public Emerald(String name, double weight, double price, double transparencyCategory, FormOfEmerald form) {
        super(name, weight, price, transparencyCategory);
        this.name = "Emerald";
        this.form = form;
    }

    public String toString(){
        String result = String.format("Наименование камня: %s, вес камня в каратах: %.2f, " +
                        "стоимость камня: %.2f, категория прозрачности: %.2f; \n", getName(), getWeight(), getPrice(),
                getTransparencyCategory());
        return result;
    }
}
