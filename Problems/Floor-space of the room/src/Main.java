import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String figure = scanner.nextLine();
        double res = 0;
        switch (figure) {
            case "rectangle":
                double x = scanner.nextInt();
                double y = scanner.nextInt();
                res = x * y;
                break;
            case "circle":
                x = scanner.nextInt();
                res = x * x * 3.14;
                break;
            case "triangle":
                x = scanner.nextInt();
                y = scanner.nextInt();
                double z = scanner.nextInt();
                double p = (x + y + z) / 2;
                res = Math.sqrt(p * (p - x) * (p - y) * (p - z));
                break;
            default:
                break;
        }
        System.out.println(res);
    }
}
