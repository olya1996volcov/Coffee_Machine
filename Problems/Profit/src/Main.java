import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int i = 0;
        for(int k = 0; k < 10; k++){
            System.out.println(i);
            i=i++;
            System.out.println(i);
        }
        /*
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt();
        double P = scanner.nextInt();
        double K = scanner.nextInt();
        int years = 0;
        while (M < K) {
            M += M * P / 100.0;
            years = years + 1;
           // System.out.println(M + " " + years);
        }
        System.out.println(years);/**/
    }
}