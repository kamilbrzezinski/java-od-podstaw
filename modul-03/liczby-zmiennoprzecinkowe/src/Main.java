import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.5;

        double c = a / b; // 1.3333333

        System.out.println(Math.round(c));
    }
}