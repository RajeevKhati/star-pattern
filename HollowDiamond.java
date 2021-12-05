// * * * * *
// * *   * *
// *       *
// * *   * *
// * * * * *

import java.util.*;
public class HollowDiamond {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int half = (n+1)/2;
		int space = 0;
		for(int i=1; i<=n; i++){
			if(i>1 && i<=half){
				space++;
			}else{
				space--;
			}
			for(int j=1; j<=n; j++){
				if(i>1 && i<n){
					if(j>=half-space && j<=half+space){
						System.out.print("  ");
					}else
						System.out.print("* ");
				}else{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
    }
}