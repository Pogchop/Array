package array;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumber = new ArrayList<>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);

        List<Integer> FirstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber);

        List<Integer> nextFivePrimNumber = new ArrayList<>();
        nextFivePrimNumber.add(13);
        nextFivePrimNumber.add(17);
        nextFivePrimNumber.add(19);
        nextFivePrimNumber.add(23);
        nextFivePrimNumber.add(29);

        FirstTenPrimeNumber.addAll(nextFivePrimNumber);
        System.out.println(FirstTenPrimeNumber);
    }
}
