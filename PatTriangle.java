import java.util.*;
public class PatTriangle {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			int count=i;
			for(int j=1; j<n*2; j++){
				if(j<=n-i)
					System.out.print("\t");
				else if(j>n-i && j< n*2-(n-i)){
					System.out.print(count+"\t");
					if(j>=n){
						count--;
						continue;
					}
					count++;
				}
			}
			System.out.println();
		}
    }
}