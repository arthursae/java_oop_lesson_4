import java.util.ArrayList;
import java.util.List;

// FIXME: 06.07.2023 Добавить нужный дженерик.
public class Box<E extends Fruit> {

    // FIXME: 06.07.2023 Реализовать методы согласно заданию.
    List<E> fruits;
    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(E fruit) {
        fruits.add(fruit);
    }

    public int getWeight() {
        int totalWeight = 0;
        for (E fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void moveTo(Box<? super E> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
