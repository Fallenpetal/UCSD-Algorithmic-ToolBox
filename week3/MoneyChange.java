import java.util.Scanner;

public class MoneyChange{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		System.out.println(Change(money));
	}

	public static int Change(int m){
		int a = m/10;
		int b= (m-a*10)/5;
		int c= (m-a*10-b*5);
		return a+b+c;
	}
}