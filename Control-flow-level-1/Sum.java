import java.util.*;
public class Sum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=sc.nextDouble();
		double total=0.0;
		while(num!=0){
			total=total+num;
			System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();
		}
		System.out.println("TOTAL SUM IS :-"+total);
	}
}
			