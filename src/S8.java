import java.util.Scanner;

public class S8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if (num == 0) {
            System.out.println(32);
            return;
        }
        int i = 0;
        String bin = Integer.toBinaryString(num);
        System.out.println(32 - bin.length());
        System.out.println(bin);
    }
}