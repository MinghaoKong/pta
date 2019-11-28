import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class S18 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        byte[] by = str.getBytes("GBK");
        by[0] -= 160;
        by[1] -= 160;
        System.out.println(Integer.toHexString(by[0] + 160) +"" + Integer.toHexString(by[1] + 160));
    }
}