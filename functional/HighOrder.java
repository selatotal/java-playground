import java.util.function.DoubleSupplier;

public class HighOrder {
    
    public static DoubleSupplier getTaxes(){
        return () -> 0.42D;
    }

    public static Double applyTaxes(final Double value, final DoubleSupplier taxFunc) {
        return value - (value * taxFunc.getAsDouble());
    }

    public static void main(final String[] args) {
        final Double valueWithoutTaxes = applyTaxes(10D, getTaxes());
        System.out.println(valueWithoutTaxes);
    }
}