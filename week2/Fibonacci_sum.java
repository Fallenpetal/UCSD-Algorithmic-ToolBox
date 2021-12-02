import java.util.Scanner;

public class Fibonacci_sum{

  public static long sum(long i){
    long[] F=new long[60];          //the cycle time is 60,according to last mod file:Fibonacci_mod.java
    F[0]=0;
    F[1]=1;
    long T_sum1=1;
    long T_sum2=0;
    long T_sum=0;
    long remainder=0;
    long multiple=0;
    for(int j=2;j<=59;j++){
	F[j]=(F[j-1]+F[j-2])%10;
	T_sum1+=F[j];
    }
	remainder=(i+1)%60;
	multiple=(i+1-remainder)/60;
	for(int k=0;k<remainder;k++){
	   T_sum2+=F[k];
	}
	T_sum=T_sum1*multiple+T_sum2;
    return T_sum%10;
}

  public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	long n=in.nextLong();
	System.out.println(sum(n));
}
}
