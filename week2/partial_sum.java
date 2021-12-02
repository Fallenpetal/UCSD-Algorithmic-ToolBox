import java.util.*;

public class partial_sum{
	public static long sum(long m,long n){
		long sum=0;
		long[] F=new long[60];
		F[0]=0;
		F[1]=1;
		for(int i=2;i<F.length;i++){
			F[i]=(F[i-1]+F[i-2])%10;
		}
		if(n<=59){
			for(long i=m;i<=n;i++){
				sum+=F[(int) i];
			}
		}
		else{
			long sum1=0;
			long sum2=0;
			for(long i=(m+1)%60-1;i<=59;i++){
				sum1+=F[(int)i];
			}
			for(long i=0;i<=(n+1)%60-1;i++){
				sum2+=F[(int)i];
			}
			sum=sum1+sum2;
		}
		return sum%10;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long m=in.nextLong();
		long n=in.nextLong();
		System.out.println(sum(m,n));
	}
}