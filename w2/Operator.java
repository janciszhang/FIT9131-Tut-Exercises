package w2;

public class Operator {
    private int age;

    public Operator(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        String binaryString = Integer.toBinaryString(a);
        System.out.println(binaryString);
        System.out.println(a&b);
        if (a == b) {
            System.out.println(a);
        }
    }
}
