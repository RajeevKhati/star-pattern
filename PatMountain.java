// Take N (number of rows), print the following pattern (for N = 4).

//                        1           1
//                        1 2       2 1  
//                        1 2 3   3 2 1
//                        1 2 3 4 3 2 1 

import java.util.*;
public class PatMountain {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			int count=1;
			for(int j=1; j<n*2; j++){
				if(j<=i){
					System.out.print(count+"\t");
					count++;
					if(i==n && j==n)
						count--;
				}
				else if(j>=2*n-i){
					count--;
					System.out.print(count+"\t");
				}
				else
					System.out.print("\t");
				
			}
			System.out.println();
		}
    }
}