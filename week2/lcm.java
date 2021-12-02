import java.util.Scanner;
public class lcm{
	public static long gcd(long a,long b){
		if(b==0) return a;
		else return gcd(b,a%b);
		/**gcd(a,b)=gcd(a',b)=gcd(b,a')*/
		/**a'=a%b*/
	}
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		long a=reader.nextInt();
		long b=reader.nextInt();
		System.out.println(a/gcd(a,b)*b);
	}
}