package w3;

import java.util.Scanner;

public class Kiosk {
    //static fields
    public static int penCount;
    public static int book;
    public static int dvdCount;
    public static int mouseCount;
    public static int keyboardCount;

    //fields
    private int penPrice;
    private int bookPrice;
    private int dvdPrice;
    private int mousePrice;
    private int keyboardPrice;
    private int[] productPrice;
    private String[] productName;

    private int amount;
    private int balance;



    //constructors

    public Kiosk(int amount, int balance) {
        penPrice = 10;
        bookPrice = 20;
        dvdPrice = 30;
        mousePrice = 40;
        keyboardPrice = 50;
        productPrice = new int[] {penPrice, bookPrice, dvdPrice, mousePrice, keyboardPrice};
        productName = new String[] {"Pen", "Book", "DVD", "Mouse", "Keyboard"};
        this.amount = amount;
        this.balance = balance;
    }


    //getter
    public int getPenPrice() {
        return penPrice;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public int getDvdPrice() {
        return dvdPrice;
    }

    public int getMousePrice() {
        return mousePrice;
    }

    public int getKeyboardPrice() {
        return keyboardPrice;
    }

    public int[] getProductPrice() {
        return productPrice;
    }

    public String[] getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    //setter

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    //Methods


    public static void checkCount(int count)
    {
        if (count == 0)
        {
            System.out.print("Sorry, it have been sold out!");
        }
    }


    public static void printWelcome()
    {
        System.out.println("Welcome to Super Fantastic Kiosk");
        System.out.println("================================");
        System.out.println("(1) Create A New Order");
        System.out.println("(2) Buy More Credit");
        System.out.println("(3) Purchase An Item");
        System.out.println("(4) What Have I Order So Far?");
        System.out.println("(5) Collect My Order");
        System.out.println("(6) Display Help");
        System.out.println("(7) Leave Kiosk");
    }

    public static int customerInputCheckInt(){
        int i = 0;
        while (i == 0){
            Scanner scan = new Scanner(System.in);
            System.out.print("Choose an option: ");
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                //System.out.println("Input success");
            } else {
                System.out.println("INVALID ENTRY!");
            }
        }
        return i;
    }


    public static void main(String[] args) {
        customerInputCheckInt();
    }
}
