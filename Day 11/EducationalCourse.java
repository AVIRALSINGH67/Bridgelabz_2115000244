import java.util.*;
class Course{
     String courseName;
	 String duration;
	 Course(String courseName,String duration)
	 {
	      this.courseName=courseName;
		  this.duration=duration;
	 }
	 
}
class OnlineCourse extends Course{
     boolean isRecorded;
	 public OnlineCourse(String courseName,String duration,boolean isRecorded)
	 {
	    super(courseName,duration);
		this.isRecorded=isRecorded;
	 }
}
class PaidOnlineCourse extends OnlineCourse{
     int fee;
	 int discount;
	 public PaidOnlineCourse(String courseName,String duration,boolean isRecorded,int fee,int discount)
	 {
	    super(courseName,duration,isRecorded);
		this.fee=fee;
		this.discount=discount;
	 }
	 public void displayInfo()
	{
	    System.out.println(this.courseName);
		System.out.println(this.duration);
		System.out.println(this.isRecorded);
		
		System.out.println(this.fee);
		System.out.println(this.discount);
		
	}
}
public class EducationalCourse{
     public static void main(String[] args)
	 {
	     PaidOnlineCourse course=new PaidOnlineCourse("DSA","2hrs",true,5000,500);
		 course.displayInfo();
		 
	 }
}

