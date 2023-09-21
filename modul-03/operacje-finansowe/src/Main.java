import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;

        System.out.println(a + b);

        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = new BigDecimal("0.2");

        System.out.println(c.add(d));
    }
}