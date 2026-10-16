
package generics;

import java.util.*;

public class UpperBoundWildCard {

    static double sum(List<? extends Number> list) {
        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(10, 20, 30);
        List<Double> numbers2 = Arrays.asList(10.5, 20.5, 30.5);

        System.out.println("Sum of Integers: " + sum(numbers1));
        System.out.println("Sum of Doubles: " + sum(numbers2));
    }
}
