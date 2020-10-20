import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = str.replace("a", "b");
        System.out.println(str2);
    }
}