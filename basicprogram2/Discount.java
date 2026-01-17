import java.util.*;
public class Discount{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fee");
		int fee=sc.nextInt();
		System.out.println("enter the discount");
		int dis=sc.nextInt();
		int discount=(fee*dis)/100;
		System.out.println(discount);
	}
}
		