package run.myapp;


import java.util.function.*;

class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (Integer x, Integer y) ->  x + y;
    BinaryOperator<Integer> minus = (Integer x, Integer y) -> x - y;
    BinaryOperator<Integer> multiply = (Integer x, Integer y) -> x * y;

    /**
     *      В методе divide вылетает ошибка если в аргументе попадает делитель 0.
     *      Перед делением выполняется проверка методом isZero(int x)
     *      Если позвращается true то выводится сообщение об ошибке.
     */
    BinaryOperator<Integer> divide = (Integer x, Integer y) -> {

        int res = 0;

        if (this.isZero.test(y)){
            System.out.println("Can`t divide by zero");
        }else{
            res = x / y;
        }

        return (res);

    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> (x > 0) ? x : (x * -1);

    Predicate<Integer> isZero = x -> x == 0;
    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> print = System.out::println;

}
