import java.util.*;
public class Below100{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive number less than 100");
		int num=sc.nextInt();
		if(num<=0||num>=100){
			System.out.println("invalid");
			return;
		}
		System.out.println("multiple of"+num+" below 100");
		for (int i=100;i>=1;i--){
			if(i%num==0){
				System.out.println(i);
			}
		}
	}
}