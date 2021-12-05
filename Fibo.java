import java.util.*;
public class Fibo {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int prev=0;
		int curr=1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(prev+"\t");
				int next = prev+curr;
				prev=curr;
				curr=next;
			}
			System.out.println();
		}
    }
}