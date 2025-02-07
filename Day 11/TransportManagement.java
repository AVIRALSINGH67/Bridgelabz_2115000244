import java.util.*;
class Vehicle{
 String fuelType;
 int maxSpeed;
 Vehicle(String fuelType,int maxSpeed)
 {
     this.fuelType=fuelType;
     this.maxSpeed=maxSpeed;
 }
}
class Car extends Vehicle{
  int seatCapacity;
  public Car(String fuelType,int maxSpeed,int seatCapacity)
  {
      super(fuelType,maxSpeed);
      this.seatCapacity=seatCapacity;
  }
  public void displayInfo()
  {
      System.out.println(this.fuelType);
      System.out.println(this.maxSpeed);
      System.out.println(this.seatCapacity);
      
  }
}
class Motorcycle extends Vehicle{
    int seatCapacity;
    public Motorcycle(String fuelType,int maxSpeed,int seatCapacity)
    {
      super(fuelType,maxSpeed);
      this.seatCapacity=seatCapacity;
    }
    public void displayInfo()
    {
      System.out.println(this.fuelType);
      System.out.println(this.maxSpeed);
      System.out.println(this.seatCapacity);
      
    }
}
class Truck extends Vehicle{
    int seatCapacity;
    public Truck(String fuelType,int maxSpeed,int seatCapacity)
    {
      super(fuelType,maxSpeed);
      this.seatCapacity=seatCapacity;
    }
    public void displayInfo()
    {
      System.out.println(this.fuelType);
      System.out.println(this.maxSpeed);
      System.out.println(this.seatCapacity);
      
    }
}
public class TransportManagement{
   public static void main(String[] args)
   {
       Car car=new Car("Petrol",80,4);
       car.displayInfo();
       
   }
}
