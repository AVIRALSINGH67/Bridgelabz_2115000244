import java.util.*;
class Animal{
    String name;
	int age;
    public Animal(String name,int age)
	{
	  this.name=name;
	  this.age=age;
	}
	public void makeSound()
	{
	   System.out.println("Animal sound");
	}
}
class Dog extends Animal{
   public Dog(String name,int age)
   {
	   super(name,age);
   }
   public void makeSound()
   {
      System.out.println("Bho Bho");
   }
}
class Cat extends Animal{
	public Cat(String name,int age)
	{
		super(name,age);
	}
    public void makeSound()
   {
      System.out.println("Mew Mew");
   }
}
class Bird extends Animal{
	public Bird(String name,int age)
	{
		super(name,age);
	}
	 public void makeSound()
   {
      System.out.println("KOO KOO");
   }
}
public class AnimalClass{
    public static void main(String[] args)
	{
	   
	   Dog dog=new Dog("dog",4);
	   Cat cat =new Cat("cat",5);
	   Bird bird=new Bird("bird",8);
	   dog.makeSound();
	   bird.makeSound();
	   cat.makeSound();
	   
	}
}
