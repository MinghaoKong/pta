import java.util.Scanner;

public class S28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int sex = scanner.nextInt();
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            if (sex == 1) {
                if (height < 130) {
                    System.out.print("duo chi yu! ");
                } else if (height == 130) {
                    System.out.print("wan mei! ");
                } else {
                    System.out.print("ni li hai! ");
                }
                if (weight > 27) {
                    System.out.println("shao chi rou!");
                } else if (weight == 27) {
                    System.out.println("wan mei!");
                } else {
                    System.out.println("duo chi rou!");
                }
            } else if (sex == 0) {
                if (height < 129) {
                    System.out.print("duo chi yu! ");
                } else if (height == 129) {
                    System.out.print("wan mei! ");
                } else {
                    System.out.print("ni li hai! ");
                }
                if (weight > 25) {
                    System.out.println("shao chi rou!");
                } else if (weight == 25) {
                    System.out.println("wan mei!");
                } else {
                    System.out.println("duo chi rou!");
                }
            }

        }
    }
}
