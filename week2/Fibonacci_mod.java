import java.util.Scanner;

public class Fibonacci_mod{
	public static long fibonacci(long n,long m){
		long a=0;
		long b=1;
		long flag=1;
		long length=1;
		long temp=1;
		if(n<=1){
			return n;
		}
		while(true){
			if(flag==n){
				break;
			}
			temp=a%m;
			a=b%m;
			b=(temp+a)%m;
			flag++;
			if(temp==0&&a==1&&flag!=2){
				length=flag-2;
				break;
			}

		}
		if(length!=1){
			n=n%length;
			// System.out.println("length is "+length);
			return fibonacci(n,m);
		}
		else{
		  return b;
		}
	}

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		long n=reader.nextLong();
		long m=reader.nextLong();
		System.out.println(fibonacci(n,m));
	}
}