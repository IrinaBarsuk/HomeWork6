import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeWork6 {
    public static void main(String[] args) throws ParseException {
        /*Car : id, марка, модель, год выпуска, цвет, цена, регистрацилнный номер.
        Создать массив объектов. Вывести:
        а) список автомобилей заданной марки;
        в) список автомобилей, заданной модели, которые эксплуатируются больше n лет;
        с) список автомобилей заданного года выпуска, цена которых больше указанной.
         */
        List<Car> cars = new ArrayList<>();
        String yearOf = "2017";
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date yearOfIssue = dateFormat.parse(yearOf);
        Car car = new Car(1, "Audi", "A5", yearOfIssue,"black",
                15000.00, "4847 AH-2" );
        cars.add(car);
        yearOf = "2015";
        dateFormat = new SimpleDateFormat("yyyy");
        yearOfIssue = dateFormat.parse(yearOf);
        car = new Car(2, "Audi", "A3", yearOfIssue,"white",
                10000.00, "1275 BC-5");
        cars.add(car);
        yearOf = "2009";
        dateFormat = new SimpleDateFormat("yyyy");
        yearOfIssue = dateFormat.parse(yearOf);
        car = new Car("Audi", "A3", yearOfIssue, 7500.00);
        cars.add(car);
        yearOf = "2018";
        dateFormat = new SimpleDateFormat("yyyy");
        yearOfIssue = dateFormat.parse(yearOf);
        car = new Car("BMW", "3", yearOfIssue, 5000.00);
        cars.add(car);
        yearOf = "2009";
        dateFormat = new SimpleDateFormat("yyyy");
        yearOfIssue = dateFormat.parse(yearOf);
        car = new Car(5, "BMW", "3",yearOfIssue , "black",
                4000.00, "7585 AB-4");
        cars.add(car);
        yearOf = "2005";
        dateFormat = new SimpleDateFormat("yyyy");
        yearOfIssue = dateFormat.parse(yearOf);
        car = new Car(6, "BMW", "5",yearOfIssue , "red",
                3000.00, "1111 AC-2");
        cars.add(car);

        System.out.println("Cписок автомобилей заданной марки - Audi: ");
        for (Car carTemp : cars) {
            if (carTemp.getMarkaAuto().equals("Audi"))
                System.out.println(carTemp);
        }

        System.out.println("Cписок автомобилей, модели 3, которые эксплуатируются больше 4 лет: ");
        String endDate = "2017";
        Date eDate = dateFormat.parse(endDate);
        for (Car carTemp : cars) {
            if (carTemp.getModelAuto().equals("3") && carTemp.getYearOfIssue().before(eDate))
            System.out.println(carTemp.toString());
        }

        System.out.println("Автомобили: год выпуска - 2009, стоимость - больше 7000,00  : ");
        String sDate = "2009";
        Date date = dateFormat.parse(sDate);
        Double priceAuto = 7000.00;
        for (Car carTemp : cars) {
            if (carTemp.getYearOfIssue().equals(date) && (carTemp.getPriceAuto() > priceAuto))
               System.out.println(carTemp.toString());
        }
    }
}

class Car{
    private int id;
    private String markaAuto;
    private String modelAuto;
    private Date yearOfIssue;
    private String colorAuto = "не определен";
    private Double priceAuto;
    private String regNumber = "не определен";

    public Car(int id, String markaAuto, String modelAuto, Date yearOfIssue,
               String colorAuto, Double priceAuto, String regNumber) {
        this.id = id;
        this.markaAuto = markaAuto;
        this.modelAuto = modelAuto;
        this.yearOfIssue = yearOfIssue;
        this.colorAuto = colorAuto;
        this.priceAuto = priceAuto;
        this.regNumber = regNumber;
    }

    public Car(String markaAuto, String modelAuto, Date yearOfIssue, Double priceAuto) {
        this.markaAuto = markaAuto;
        this.modelAuto = modelAuto;
        this.yearOfIssue = yearOfIssue;
        this.priceAuto = priceAuto;
    }

    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        String yearOf;
        if (yearOfIssue != null)
            yearOf = dateFormat.format(yearOfIssue);
        else yearOf = " ";
        String result = String.format("id: %d, марка авто: %s, модель авто: %s," +
                "год выпуска: %s, цвет авто: %s, цена авто: %.2f, рег.номер авто: %s", id,markaAuto,
                modelAuto,yearOf,colorAuto,priceAuto,regNumber);
        return result;
    }

    public int getId() {
        return id;
    }

    public String getMarkaAuto() {
        return markaAuto;
    }

    public String getModelAuto() {
        return modelAuto;
    }

    public Date getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public Double getPriceAuto() {
        return priceAuto;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
