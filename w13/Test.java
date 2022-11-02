package w13;

import java.util.*;
import java.io.*;

public class Test
{
    public static void main(String[] args)
    {
//        int a = 8;
//        a *= a++;
//        a=a++ * a++;
//        System.out.println(a);
//        People[] ps=new People[10];
//        System.out.println(ps[5]);
//        double[] as=new double[10];
//        System.out.println(as[5]);
//        int a=10;
//        a-=2;
//        System.out.println(a);
//        int a =0;
//        System.out.println(a--);
        ArrayList<String> strs=new ArrayList<>();
        strs.add("A");
        strs.add("B");
        strs.get(1);
        strs.size();
        strs.remove(1);
        strs.clear();
        int[] numbers={1,2,3,4,5};
        Iterator<Integer> iterator= Arrays.stream(numbers).iterator();
        while (iterator.hasNext())
        {
            Integer number=iterator.next();
            System.out.println(number);
        }
        int num=10;
        System.out.println((num++)*(--num));
        ArrayList<String> bb=new ArrayList();
        System.out.println(bb);
        String bbb="";
//        bbb.equals()
    }
    class People{}
}
