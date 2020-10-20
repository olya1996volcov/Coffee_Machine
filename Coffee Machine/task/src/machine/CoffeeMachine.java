package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
           // printState();


            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String number = scanner.next();
                    buy(number);
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printState();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("idiot");
                    break;
            }
        }
    }

    private static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        //printState();
    }

    private static void fill() {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Write how many ml of water do you want to add:");
        input = scanner.nextInt();
        water += input;
        System.out.println("Write how many ml of milk do you want to add:");
        input = scanner.nextInt();
        milk += input;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        input = scanner.nextInt();
        coffee += input;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        input = scanner.nextInt();
        cups += input;
        //printState();
    }


    private static void buy(String number) {
        switch (number) {
            case "1":
                checkResourses(250, 0, 16, 4);


                // printState();
                break;
            case "2":

                checkResourses(350, 75, 20, 7);

                break;
            case "3":
                checkResourses(200, 100, 12, 6);

                break;
            case "back":
                break;
            default:
                System.out.println("idiot 2");
                break;
        }
    }

    private static void checkResourses(int wate, int mil, int coffe, int mone) {
        if (water >= wate && coffee >= coffe && cups > 0) {
            water -= wate;
            milk -= mil;
            coffee -= coffe;
            cups -= 1;
            money += mone;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < wate) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < mil) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffee < coffe) {
            System.out.println("Sorry, not enough coffee!");
        } else if (cups == 0) {
            System.out.println("Sorry, not enough cups!");
        }
    }
}
