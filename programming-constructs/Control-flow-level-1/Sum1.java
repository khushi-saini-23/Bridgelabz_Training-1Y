import java.util.*;
public class Sum1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double total=0.0;
		while (true){
			System.out.println("enter the number[at zero or negative is stop]");
			double num=sc.nextDouble();
			if(num<=0){
				break;
			}
			total=total+num;
		}
		System.out.println("total sum="+total);
	}
}
			