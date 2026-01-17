import java.util.*;
public class QuoMod{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		int que=a/b;
		int mod=a%b;
		System.out.println(que);
		System.out.println(mod);
	}
}