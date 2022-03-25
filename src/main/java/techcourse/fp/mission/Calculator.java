package techcourse.fp.mission;

import java.util.List;
import java.util.function.IntPredicate;

public class Calculator {
    public static int sumAll(List<Integer> numbers) {
        return sumAll(numbers, value -> true);
    }

    public static int sumAllEven(List<Integer> numbers) {
        return sumAll(numbers, value -> value % 2 == 0);

    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return sumAll(numbers, value -> value > 3);

    }

    private static int sumAll(List<Integer> numbers, IntPredicate predicate) {
        int total = 0;
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                total += number;
            }
        }
        return total;
    }

}
