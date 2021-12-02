import java.util.Scanner;
public class Fibonacci{
	public static int fibonacci(int i){
		int a=0;
		int b=1;
		int flag=1;
		int temp=0;
		if(i<=1){
			if(i==0)
				return a;
			else
				return b;
		}
		while(true){
			if(flag==i){
				break;
			}
			temp=a;
			a=b;
			b=temp+a;
			flag++;

		}
		return b;
	}

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int n=reader.nextInt();
		System.out.println(fibonacci(n));
	}
}