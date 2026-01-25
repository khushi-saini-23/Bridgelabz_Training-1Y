import java.util.*;
public class Factor1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int i=1;
		if(num<=0){
			System.out.println("plz enter a postive integer");
		}else{
			System.out.println("Factors of " + num + " are:");
			while (i<=num){
				if(num%i==0)
					System.out.println(i);
				}
		}
	}
}	