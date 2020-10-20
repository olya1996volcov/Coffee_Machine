import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        while (x1 == x2) {
            x1 = x2;
            x2 = scanner.nextInt();
        }
        if (x1 > x2 && x2 != 0) {
            while (flag) {
                x1 = x2;
                x2 = scanner.nextInt();
                if (x2 == 0) {
                    break;
                }
                if (x1 < x2) {

                    flag = false;
                    System.out.println("false");
                }
            }
        } else if (x2 > x1) {
            while (flag) {
                x1 = x2;
                x2 = scanner.nextInt();
                if (x2 == 0) {
                    break;
                }
                if (x1 > x2) {

                    flag = false;
                    System.out.println("false");
                }
            }

        }
        if (flag) {
            System.out.println("true");
        }
    }
}