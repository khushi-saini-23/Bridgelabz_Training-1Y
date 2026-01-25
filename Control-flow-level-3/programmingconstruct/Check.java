import java.util.*;
public class Check{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0){
			System.out.println("Postive");	
		}
		else if(a==0){
			System.out.println("Equal");
		}
		else{
			System.out.println("Negetive");
		}
	}
}