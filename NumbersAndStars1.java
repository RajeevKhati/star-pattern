// 1 2 3 4 5
// 1 2 3 4 * 
// 1 2 3 * * *
// 1 2 * * * * *
// 1 * * * * * * *

import java.util.*;
public class NumbersAndStars1 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(n*2)-2; j++){
				if(j<=n-(i-1)){
					System.out.print(j+" ");
				}
				else if(j>=n-(i-2) && j<=n+(i-2)){
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
    }
}