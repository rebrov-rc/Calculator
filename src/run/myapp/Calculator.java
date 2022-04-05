package run.myapp;


import java.util.function.*;

class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (Integer x, Integer y) ->  x + y;
    BinaryOperator<Integer> minus = (Integer x, Integer y) -> x - y;
    BinaryOperator<Integer> multiply = (Integer x, Integer y) -> x * y;
    BinaryOperator<Integer> divide = (Integer x, Integer y) -> {
        if (y == 0) return (0);
        return  (x / y);
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> (x > 0) ? x : (x * -1);

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> print = System.out::println;

}
