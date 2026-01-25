import java.util.*;
public class Palidrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int rem;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev){
			System.out.println("its is palidrome number");
		}else{
			System.out.println("ist not palidrome number");
		}
	}
}
			