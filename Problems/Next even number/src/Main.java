import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int num2 = num % 2;
        System.out.println(num + 2 - num2);
    }
}