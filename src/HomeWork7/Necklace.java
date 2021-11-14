package HomeWork7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Necklace {
    List<Stone> stones = new LinkedList<>();

    public void addStone(Stone stone){
        stones.add(stone);
    }
    public void sort(){
          Collections.sort(stones);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Necklace: \n");
        for (Stone stone : stones)
            sb.append(stone.toString());
        return sb.toString();
    }

    public double getPrice(){
        double price = 0;
        for (Stone stone : stones)
            price +=stone.getPrice();
        return price;
    }

    public double getWeight(){
        double weight = 0;
        for (Stone stone : stones)
            weight += stone.getWeight();
        return weight;
    }

    public LinkedList<Stone> getByTransparency(double min, double max){
        List<Stone> result = new LinkedList<>();
        for (Stone stone : stones)
            if (stone.getTransparencyCategory() > min && stone.getTransparencyCategory() < max)
                result.add(stone);
            return (LinkedList<Stone>) result;
    }
}
