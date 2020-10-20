import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int longest = 1;
        int temp = 1;
        int arrLengh = scanner.nextInt();
        int[] array = new int[arrLengh];
        for (int i = 0; i < arrLengh; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < arrLengh; i++) {
            if (array[i] > array[i - 1]) {
                longest++;
            } else {
                if (temp < longest) {
                    temp = longest;
                }
                longest = 1;
            }

        }
        if (temp < longest) {
            temp = longest;
        }
        System.out.println(temp);
    }
}