//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String w1 = scanner.next();
        String w2 = scanner.next();
        String w3 = scanner.next();
        String w4 = scanner.next();
        String w5 = scanner.next();
        System.out.println("The form for " + w1 +
                " is completed. We will contact you if we need a chef that cooks " + w5 + " dishes.");
    }
}