package w7;

public class Shoe
{
    private String color;
    private int size;


    public Shoe()
    {
        color = "";
        size=0;
    }

    public Shoe(int size, String color)
    {
        this.color = color;
        this.size = size;
    }

    public String getColor()
    {
        return color;
    }

    public int getSize()
    {
        return size;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public void printShoe()
    {
        System.out.println("The shoe's color is: " + color + ", size is: " + size);
    }

}
