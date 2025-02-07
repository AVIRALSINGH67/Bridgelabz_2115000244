import java.util.*;
class Employee{
   String name;
   int id;
   int salary;
   Employee(String name,int id,int salary)
   {
      this.name=name;
	  this.id=id;
	  this.salary=salary;
   }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name,int id,int salary,int teamSize)
	{
	    super(name,id,salary);
		this.teamSize=teamSize;
	}
	public void displayDetails()
	{
	    System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.salary);
		System.out.println(this.teamSize);
		
	}
}
class Developer extends Employee{
      String programmingLanguage;
	  public Developer(String name,int id,int salary,String programmingLanguage)
	   {
	    super(name,id,salary);
		this.programmingLanguage=programmingLanguage;
	   }
	  public void displayDetails()
	   {
	    System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.salary);
		System.out.println(this.programmingLanguage);
		
	   }
}
public class EmployeeManagement{
     public static void main(String[] args)
	 {
	     Developer devp=new Developer("ashish",1,80000,"JAVA");
		 devp.displayDetails();
	 }
}
