import java.math.BigDecimal;
import java.util.Scanner;

public class S10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            BigDecimal a = scanner.nextBigDecimal();
            BigDecimal b = scanner.nextBigDecimal();
            System.out.println(b.add(a).toString());
            System.out.println(b.multiply(a).toString());
        }
    }
}
