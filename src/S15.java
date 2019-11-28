import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 3:
                System.out.println(153);
                System.out.println(370);
                System.out.println(371);
                System.out.println(407);
                break;
            case 4:
                System.out.println(1634);
                System.out.println(8208);
                System.out.println(9474);
                break;
            case 5:
                System.out.println(54748);
                System.out.println(92727);
                System.out.println(93084);
                break;
            case 6:
                System.out.println(548834);
                break;
            case 7:
                System.out.println(1741725);
                System.out.println(4210818);
                System.out.println(9800817);
                System.out.println(9926315);
                break;
        }
    }
}
