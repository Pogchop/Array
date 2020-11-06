package array;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("lion");
        animals.add("tiger");
        animals.add("cat");
        animals.add("dog");

        System.out.println(animals);

        animals.add(2, "elephant");

        System.out.println(animals);
    }
}
