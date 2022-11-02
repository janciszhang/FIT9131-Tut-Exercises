package w4;

public class test {
    public static boolean booleanCalc(boolean a, boolean b)
    {
        if (a && b || (!a && !b))
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(booleanCalc(true, true));
        System.out.println(booleanCalc(true, false));
        System.out.println(booleanCalc(false, true));
        System.out.println(booleanCalc(false, false));
    }
}
