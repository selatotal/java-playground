import java.util.function.Function;

public class Functional01 {

    public static void main(String[] args) {
        Function<Double, Double> doubleIt = (Double b) -> b * b;
        System.out.println(doubleIt.apply(2D));
    }

    public static Integer sum(int a, int b){
        return a + b;
    }

}