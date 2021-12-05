//     *****
//    *   *
//   *   *
//  *   *
// *****

import java.util.*;
public class HollowRhombus {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(n*2)-1; j++){
				if(i==1){
					if(j>=n)
						System.out.print("*");
					else
						System.out.print(" ");
				}else if(i==n){
					if(j<=n)
						System.out.print("*");
				}else{
					if(j==n-(i-1) || j==((n*2)-1)-(i-1))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}