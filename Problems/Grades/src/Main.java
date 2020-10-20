import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A = 0, B = 0, C = 0, D = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 5)
                A++;
            else if (num == 4)
                B++;
            else if (num == 3)
                C++;
            else D++;
        }
        System.out.println(D + " " + C + " " + B + " " + A);
    }
}