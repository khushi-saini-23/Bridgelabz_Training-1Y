public class Temps{
	public static void main(String[]args){
		System.out.println("ENTER THE VALUE IN CELEIUS");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int feh=(celsius*9/8)+32;
		System.out.println(feh);
	}
}