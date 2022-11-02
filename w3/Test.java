package w3;

import java.util.Scanner;

public class Test {
    public static int inputInt() {
        int inputNumber = 0;
        Scanner scan = new Scanner(System.in);
        while (inputNumber == 0) {

            System.out.println("Please enter a number: ");

            if (scan.hasNextInt()) {
                inputNumber = scan.nextInt();
                System.out.println("输入的数字是：" + inputNumber);
            }
            System.out.println("-----------------------------");
            //scan.close();
        }

        return inputNumber;
    }


    public static int inputInt2() {
        int j = 0;
        Scanner input = new Scanner(System.in);

        while (!input.hasNextInt()) {
            input.next();
            System.out.println("请输入数字");
        }
        j = input.nextInt();
        input.close();
        return j;
    }

    public static int input(){
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter: ");
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Please enter a number: ");
        }
        j = input.nextInt();
//        input.close();
        return j;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int x = input();
            System.out.println(i + ": " + x);
        }
    }
}
