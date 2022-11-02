package w3;

import java.util.Scanner;
import static java.lang.Math.*;

public class SuperFantasticKiosk {
    //fields
    private String name;
    private int credit;
    //private int option;
    private String oderProduct;
    private int totalCost;
    //private int buyProductID;

    //constructor
    public SuperFantasticKiosk(){}

    public SuperFantasticKiosk(String name, int credit) {
        this.name = name;
        this.credit = credit;
        //option = 0;
        oderProduct = "";
        totalCost = 0;
        //buyProductID = 0;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getCredit() {
        return credit;
    }
    //    public int getOption() {
//        return option;
//    }
    public String getOderProduct(){
        return oderProduct;
    }
    public int getTotalCost() {
        return totalCost;
    }

//    public int getBuyProductID() {
//        return buyProductID;
//    }

    //setter
    //Option 1
    public void setName(String name){
        this.name = name;
    }
    //Option 2
    public void setCredit(int credit){
        this.credit += credit;
    }
//    public void setOption(int option){
//        this.option = option;
//        System.out.println(option);
//    }
//    public void setBuyProductID(int buyProductID) {
//        this.buyProductID = buyProductID;
//    }

    public void setOderProduct(String oderProduct) {
        this.oderProduct = oderProduct;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    //Method

    //Menu
    public void printMenuOption() {
        System.out.println("Welcome to Super Fantastic Kiosk");
        System.out.println("================================");
        System.out.println("(1) Create A New Order");
        System.out.println("(2) Buy More Credit");
        System.out.println("(3) Purchase An Item");
        System.out.println("(4) What Have I Order So Far?");
        System.out.println("(5) Collect My Order");
        System.out.println("(6) Display Help");
        System.out.println("(7) Leave Kiosk");
        System.out.println("Choose an option: ");
    }

    //Product list
    public void printProductList(){
        System.out.println("These are the items available for sale today:");
        System.out.println("---------------------------------------------");
        System.out.println("(1) PEN, worth $10.");
        System.out.println("(2) BOOK, worth $20.");
        System.out.println("(3) DVD, worth $30.");
        System.out.println("(4) MOUSE, worth $40.");
        System.out.println("(5) KEYBOARD, worth $50.");
        System.out.println("(6) Let ME pick a random item for you!!!");
        System.out.println("Pick a number between 1-6: ");
    }

    //Option 3
    public void purchase(){
        printProductList();

        int buyProductID = inputInt();

        int[] productPrice = new int[]{10, 20, 30, 40, 50};
        String[] productName = new String[]{"PEN", "Book", "DVD", "Mouse", "Keyboard"};

        System.out.println(buyProductID);

        if (buyProductID < 1 || buyProductID > 6){
            System.out.println("Error: your choice must be between 1-6");
        }
        else {
            int index;
            if (buyProductID == 6) {
                index = (int) (random() * 5);
            }
            else{
                index = buyProductID -1;
            }
            //System.out.println(buyProductID);
            if (credit >= productPrice[index]) {
                oderProduct += productName[index];
                credit -= productPrice[index];
                totalCost += productPrice[index];
                System.out.println("You have bought a " + productName[index] + ", worth " + productPrice[index]);
                System.out.println("Your new credit balance is now: " + credit);
            } else {
                System.out.println("Sorry, you do not have enough credit to purchase this item!");
                System.out.println("Credit Balance: " + credit + ", Item Cost: " + productPrice[index]);
            }
        }


//        switch (buyProductID){
//            case 1:
//                if (credit >= 10){
//                    oderProduct += "PEN ";
//                    credit -= 10;
//                    totalCost += 10;
//                    System.out.println("You have bought a PEN, worth $10.");
//                    System.out.println("Your new credit balance is now: " + credit);
//                }
//                else{
//                    System.out.println("Sorry, you do not have enough credit to purchase this item!");
//                    System.out.println("Credit Balance: " + credit + ", Item Cost: $50");
//                }
//                break;
//
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            default:
//                System.out.println("Error: your choice must be between 1-6");
//                break;
//        }
    }

    //Option 4
    public void printOrder(){
        System.out.println("Customer " + name + " has purchased these items:");
        System.out.println(oderProduct);
        System.out.println("worth a total of " + totalCost);
        System.out.println("Credit balance: " + credit);
    }

    //Option 5
    public void collectOrder(){
        printOrder();
        System.out.println("Thank you for shopping with us. Please collect your goods (and your balance) at the front desk.");
    }

    //Option 6
    public void printHelp(){
        System.out.println("There 5 products you can buy\n" +
                "If you pick Item #6, the computer will generates a random number between 1 and 5. \n" +
                "and then use that number to pick one of the 5 available items for you.");
    }

    //Option 7
    public void leaveClear(){
        name = "";
        credit = 0;
        oderProduct = "";
        totalCost = 0;
    }

    //OptionSwitch
    public void optionSwitch(int option){
        if (name != ""){
            switch (option){
                case 1:
                    name = inputString();
                    setName(name);
                    break;
                case 2:
                    credit = inputInt();
                    setCredit(credit);
                    break;
                case 3:
                    purchase();
                    break;
                case 4:
                    printOrder();
                    break;
                case 5:
                    collectOrder();
                    break;
                case 6:
                    printHelp();
                    break;
                case 7:
                    leaveClear();
                    break;
                default:
                    System.out.println("Error: your choice must be between 1-7");
            }
        }
    }

    public void buyWholeProcess(){
        int option = 0;
        do{
            printMenuOption();
            option = inputInt();
            optionSwitch(option);
        }while(option !=7);
    }

    //Input int
    public static int inputInt(){
        int inputNumber = 0;
        int i = 0;
        while (inputNumber == 0){
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter a number: ");

            if (scan.hasNextInt()) {
                inputNumber = scan.nextInt();
                System.out.println("Input success");
            } else {
                System.out.println(inputNumber);
                System.out.println("INVALID ENTRY!");
            }

            //scan.close();
        }
        return inputNumber;
    }

    //Input String
    public static String inputString(){
        String inputString = "";
        while (inputString == ""){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a string：");
            // 判断是否还有输入
            if (scan.hasNext()) {
                inputString = scan.next();
                //System.out.println("Input success");
            }else {
                System.out.println("INVALID ENTRY!");
            }
            scan.close();
        }
        return inputString;
    }


    //Test
    public static void main(String[] args) {
        int x = inputInt();
        //String y = inputString();


        //SuperFantasticKiosk customer = new SuperFantasticKiosk();
        //customer.buyWholeProcess();



//        customer.printMenuOption();
//        customer.setOption(3);
//        customer.setBuyProductID(6);
//        customer.optionSwitch();
//        customer.setCredit(20);
//        customer.optionSwitch();
    }

}
