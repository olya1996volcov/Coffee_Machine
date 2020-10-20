import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(str.substring(n1, n2 + 1));
    }
}