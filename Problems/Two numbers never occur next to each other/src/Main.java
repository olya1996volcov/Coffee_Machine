import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int arrLength = scanner.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] index1 = new int[arrLength];
        int[] index2 = new int[arrLength];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arrLength; i++) {
            index1[i] = -100;
            index2[i] = -100;
        }
        for (int i = 0; i < arrLength; i++) {
            if (array[i] == m) {
                index1[count1] = i;
                count1++;

            }
            if (array[i] == n) {
                index2[count2] = i;
                count2++;
            }
        }
        for (int i = 0; i < count1; i++) {
            for (int j = 0; j < count2; j++) {
                if (Math.abs(index1[i] - index2[j]) == 1) {
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}