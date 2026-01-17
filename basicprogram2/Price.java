import java.util.*;
public class Price{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of unitprice:");
		double unitprice=sc.nextDouble();
		System.out.println("enter the value of quantity:");
		int quantity=sc.nextInt();
		double totalprice=unitprice*quantity;
		System.out.println("total price:"+totalprice);
	}
}