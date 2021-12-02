import java.util.Scanner;

public class Car_Fueling{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int distance= in.nextInt();
		int mile = in.nextInt();
		int n = in.nextInt();
		n=n+2;
		int[] stop = new int[n];
		stop[0]=0;
		stop[n-1]=distance;
		for(int i=1;i<n-1;i++){
			stop[i]=in.nextInt();
		}
		int numbRefills=0;
		int currentIndex=0;
		while(currentIndex<n-1){
			int lastIndex=currentIndex;
			while(currentIndex<n-1 && stop[currentIndex+1]-stop[lastIndex]<=mile){
				currentIndex=currentIndex+1;
			}
			if(currentIndex==lastIndex){
				numbRefills=-1;
				break;
			}
			if(currentIndex<n-1){
				numbRefills=numbRefills+1;
			}
		}
		System.out.println(numbRefills);
	}
}