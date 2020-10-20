import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int num = scanner.nextInt();
        int flag = 0;
        for (int i = 1; i <= num; i++) {
            int height = scanner.nextInt();
            if (height <= bus) {
                flag = i;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + flag);
        }

    }
}