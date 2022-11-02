package w5;

/**
 * Check a postcode if is valid, print result: state name or Invalid postcode length is 4 first
 * number is valid all char is digit
 *
 * @author Jingmin Zhang
 * @version 1.8.0   31 March 2020
 */
public class Week6Pre1
{
    /**
     * check postcode is valid, print result: state name or Invalid postcode length is 4 first
     * number is valid all char is digit
     *
     * @param postcode a String input
     */
    public void displayStateName(String postcode)
    {
        boolean check = false;
        String state = checkFirstNumber(postcode);
        if (postcode.length() == 4)
            if (state != "")
                for (int i = 0; i < 4; i++)
                {
                    if (i == 3 && Character.isDigit(postcode.charAt(i)))
                        check = true;
                }
        if (check == true)
            System.out.println(state);
        else
            System.out.println("Invalid postcode");
    }

    /**
     * check the first number of postcode is valid, return: state name or "" first number only 2, 3,
     * 4, 5, 6, 7 is known
     *
     * @param postcode a String input
     * @return a String to get the check result
     */
    public String checkFirstNumber(String postcode)
    {
        char x = postcode.charAt(0);
        char[] first = {'2', '3', '4', '5', '6', '7'};
        String[] state = {"NSW", "Victoria", "Queensland", "South Australia", "Western Australia",
                "Tasmania"};
        for (int i = 0; i < first.length; i++)
        {
            if (x == first[i])
                return state[i];
        }
        return "";
    }

    /**
     * =========================== test ===========================
     */
    public static void main(String[] args)
    {
        Week6Pre1 test = new Week6Pre1();
        test.displayStateName("0234");
        test.displayStateName("23456");
        test.displayStateName("238a");
        test.displayStateName("6345");
    }

//    /**
//     * Display all files in collection (for-each loop)
//     */
//    public void displayCollection1()
//    {
//        for (String file : files)
//        {
//            System.out.println(file);
//        }
//        System.out.println("Total number:" + getNumberOfFiles());
//    }
//
//    /**
//     * Display all files in collection (while loop)
//     */
//    public void displayCollection2()
//    {
//        int i = 0;
//        while (i < files.size())
//        {
//            String file = files.get(i);
//            System.out.println(file);
//            i++;
//        }
//        System.out.println("Total number:" + getNumberOfFiles());
//    }


}
