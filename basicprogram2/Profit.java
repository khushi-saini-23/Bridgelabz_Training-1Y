import java.util.*;
public class Profit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("sell");
		int sell=sc.nextInt();
		System.out.println("cost");
		int cost=sc.nextInt();
		int a=sell-cost;
		int pp=(a/cost)*100;
		System.out.println(a);
		System.out.println(pp);
	}
}
		