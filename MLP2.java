import java.util.*;

//Manmohan loves pattern
public class MLP2 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(1);
		for(int i=2; i<=n; i++){
			for(int j=1; j<=i; j++){
				if(j==1||j==i)
					System.out.print(i-1);
				else
					System.out.print(0);
				
			}
			System.out.println();
		}
    }
}