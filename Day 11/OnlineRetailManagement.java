import java.util.*;
class Order{
     int orderId;
	 String orderDate;
	 Order(int orderId,String orderDate)
	 {
	      this.orderId=orderId;
		  this.orderDate=orderDate;
	 }
	 
}
class ShippedOrder extends Order{
     int trackingNumber;
	 public ShippedOrder(int orderId,String orderDate,int trackingNumber)
	 {
	    super(orderId,orderDate);
		this.trackingNumber=trackingNumber;
	 }
}
class DeliveredOrder extends ShippedOrder{
     String deliveryDate;
	 public DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate)
	 {
	    super(orderId,orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
	 }
	 public void displayInfo()
	{
	    System.out.println(this.orderId);
		System.out.println(this.orderDate);
		System.out.println(this.trackingNumber);
		
		System.out.println(this.deliveryDate);
	}
}
public class OnlineRetailManagement{
     public static void main(String[] args)
	 {
	     DeliveredOrder order=new DeliveredOrder(1,"2-JAN-2025",234,"8-FEB-2025");
		 order.displayInfo();
		 
	 }
}
