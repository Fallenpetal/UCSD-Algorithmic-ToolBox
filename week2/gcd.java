import java.util.Scanner;
public class gcd{
	public static int Euclidean_gcd(int a,int b){
		if(b==0) return a;
		else return Euclidean_gcd(b,a%b);
		/**gcd(a,b)=gcd(a',b)=gcd(b,a')*/
		/**a'=a%b*/
	}
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		System.out.println(Euclidean_gcd(a,b));
	}
}