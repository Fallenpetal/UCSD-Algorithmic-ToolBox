import java.util.Scanner;
public class last_digit_fibonacci{
	public static int fibonacci(int i){
		int[] F =new int[10000000];
		F[0]=0;
		F[1]=1;
		for(int j=2;j<=i;j++){
			F[j]=(F[j-1]+F[j-2])%10;
		} 
		return F[i];
	}

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int n=reader.nextInt();
		System.out.println(fibonacci(n));
	}
}