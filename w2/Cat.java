package w2;

import java.util.Scanner;

public class Cat {
    private static String color;
    private static int countWhite;

    public void Cat(){
        countWhite = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountWhite() {
        return countWhite;
    }

    public void setCountWhite(int countWhite) {
        this.countWhite = countWhite;
    }

    public static void isWhite(String color)
    {
        countWhite = color=="white"? countWhite+1:countWhite;
        System.out.println(countWhite+" white cat.");
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
        System.out.println(str);
        color = str;
        System.out.println();
        //color = "white";
        cat1.isWhite(color);
    }
}
