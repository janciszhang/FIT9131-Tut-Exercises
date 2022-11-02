package w6;

import java.util.ArrayList;

public class Car
{
    //Field
    private String name;
    private String brand;
    private String color;
    private String shape;
    private String transmission;
    private int doorNumber;

    //Constructor
    public Car(String name, String brand, String color, String shape, String transmission, int doorNumber)
    {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.shape = shape;
        this.transmission = transmission;
        this.doorNumber = doorNumber;
    }

    //Getter and Setter

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getShape()
    {
        return shape;
    }

    public void setShape(String shape)
    {
        this.shape = shape;
    }

    public String getTransmission()
    {
        return transmission;
    }

    public void setTransmission(String transmission)
    {
        this.transmission = transmission;
    }

    public int getDoorNumber()
    {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber)
    {
        this.doorNumber = doorNumber;
    }
}

class Cars
{
    private ArrayList<Car> cars;

    public Cars()
    {
        cars = new ArrayList<>();
    }

    public ArrayList<Car> getCars()
    {
        return cars;
    }

    public void setCars(Car car)
    {
        this.cars.add(car);
    }

    public void printCars()
    {
        for (Car car : cars)
        {
            System.out.println(car.getName());
        }
    }

    public void printCars2()
    {
        int i = 0;
        while (i < cars.size())
        {
            System.out.println(cars.get(i).getName());
        }
    }

    public void printCars3()
    {
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i).getName());
        }
    }

    private ArrayList<Integer> nums = new ArrayList<>();
}
