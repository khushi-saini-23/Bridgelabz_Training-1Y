import java.util.*;
public class Prime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		boolean isPrime=true;
		if(num<=1){
			isPrime=false;
		}else{
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					isPrime=false;
					break;
				}
			}
		}
		if (isPrime){
			System.out.print("Prime Number");
		}else{
			System.out.print("Not a Prime Number");
		}
	}
}