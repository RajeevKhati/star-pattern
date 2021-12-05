// *  ****
// *  *
// *  *
// *******
//    *  *
//    *  *
// ****  *
//7

import java.util.*;
public class Swastik {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==1){
					if(j>1 && j<(n+1)/2)
						System.out.print("  ");
					else
						System.out.print("* ");
				}else if(i==(n+1)/2){
					System.out.print("* ");
				}else if(i>1 && i<(n+1)/2){
					if(j==1 || j==(n+1)/2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}else if(i>(n+1)/2 && i<n){
					if(j==n || j==(n+1)/2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}else{
					if(j>(n+1)/2 && j<n)
						System.out.print("  ");
					else
						System.out.print("* ");
				}
			}
			System.out.println();
		}
    }
}