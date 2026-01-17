import java.util.*;
public class Avg{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int maths=sc.nextInt();
		int phy=sc.nextInt();
		int chem=sc.nextInt();
		double Avgs=maths+phy+chem/3;
		System.out.println(Avgs);
	}
}
	