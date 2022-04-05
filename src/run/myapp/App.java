package run.myapp;



public class App {
    public void run(){

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);

        calc.print.accept(c);  
    }
}
