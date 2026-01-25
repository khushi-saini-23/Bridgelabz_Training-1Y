import java.util.*;
public class Leap2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0 || year%400==0){
			System.out.println("its leap year");
		}else if(year%100==0){
			System.out.println("its not leap year");
		}
	}
}