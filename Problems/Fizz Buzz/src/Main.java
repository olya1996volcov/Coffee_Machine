import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
            if (i % 3 == 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            System.out.print("\n");
        }
    }
}