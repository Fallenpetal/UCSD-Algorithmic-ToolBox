import java.util.*;

public class sum_square{
	public static int fibonacci(long n){
		int[] F= new int[60];
		F[0]=0;
		F[1]=1;
		if(n<=1){
			if(n==0)
				return 0;
			else
				return 1;
		}
		for(int i=2;i<F.length;i++){
			F[i]=(F[i-1]+F[i-2])%10;
		}
		n=(n+1)%60-1;
		if(n<=0){
			return 0;
		}
		int a=F[(int)n];
		int b=F[(int)n-1];
		return a*(a+b)%10;

	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(fibonacci(n));
	}
}