package labs.pm.funct;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class FunctTest {


    public static void main(String[] args) {
//        Which statement causes a compilation error?

        //DoublePredicate<Integer, Integer> test = (x, y) -> x == y;

        DoubleFunction<Double> area = r -> Math.PI*r*r;

        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x/y;

        IntPredicate test2 = x -> x == 10;

        //predicate isang param lang
    }
}
