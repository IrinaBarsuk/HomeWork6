package HomeWork7;

import java.text.ParseException;
import java.util.LinkedList;

//Задание 6.
//Камни.Определить иерархию драгоценных камней;+
//Отобрать камни для ожерелья;+
//Подсчитать общий вес (в каратах) и стоимость;+
//Провести сортировку камней на основе ценности;+
//Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.+

public class NecklaceOfStone {
    public static void main(String[] args) throws ParseException {
        Necklace necklace = new Necklace();
        necklace.addStone(new Brilliant("Brilliant",2.2,500,0.8, FormOfBrilliant.Heart));
        necklace.addStone(new Sapphire("Sapphire",1.4,140,0.4 , FormOfSapphire.BLUE));
        necklace.addStone(new Garnet("Garnet",0.8,70, 0.1, FormOfGarnet.SPESSERTIN));
        necklace.addStone(new Emerald("Emerald",1.5,250, 0.6, FormOfEmerald.BRAZILIAN));
        necklace.addStone(new Brilliant("Brilliant",4.2,1000,0.9 , FormOfBrilliant.Marquise));
        necklace.sort();
        System.out.println(necklace);

        System.out.println("Стоимость ожерелья составляет: "+necklace.getPrice());
        System.out.println("Вес ожерелья составляет: "+necklace.getWeight());

        LinkedList<Stone> stones = necklace.getByTransparency(0.4,0.9);
        System.out.println(stones.toString());
    }
}
