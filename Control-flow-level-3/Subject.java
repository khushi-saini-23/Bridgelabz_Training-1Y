import java.util.*;
public class Subject{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE PHYSICS");
		int phy=sc.nextInt();
		System.out.println("ENTER THE CHEMISTRY");
		int chem=sc.nextInt();
		System.out.println("ENTER THE MATHS");
		int maths=sc.nextInt();
		double sum=phy+chem+maths;
		double total=sum/3;
		if(total>=90){
			System.out.println("excellent");
		}else if(total >=80){
			System.out.println("very good");
		}else if(total>=70){
			System.out.println("good");
		}else if(total>=50){
			System.out.println("fair");
		}else if(total >=40){
			System.out.println("need improvement");
		}
	}

}