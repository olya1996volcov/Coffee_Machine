import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int count = 0;

        for (int i = n1; i <= n2; i++) {
            if (i % n3 == 0)
                count++;
        }
        System.out.println(count);
    }
}