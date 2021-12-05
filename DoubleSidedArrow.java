//             1 
//         2 1   1 2 
//     3 2 1       1 2 3 
// 4 3 2 1           1 2 3 4 
//     3 2 1       1 2 3 
//         2 1   1 2 
//             1 

import java.util.*;
public class DoubleSidedArrow {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int space1=n+1;
		int space2=-3;
		int limit=0;
		for(int i=1; i<=n; i++){
			if(i<=(n+1)/2){
				count++;
				space1-=2;
				space2+=2;
				limit++;
			}
			else{
				count--;
				space1+=2;
				space2-=2;
				limit--;
			}
			int c=count;
			int c2=1;
			int s1=space1;
			int s2=space2;

			for(int j=1; j<n*2; j++){
				
				//space1
				if(s1>0){
					System.out.print("  ");
					s1--;
				}
				//number
				else if(c>0){
					System.out.print(c+" ");
					c--;
				}
				//space2
				else if(s2>0){
					System.out.print("  ");
					s2--;
				}
				//number
				else if(c2<=limit){
					if(i==1 || i==n){
						break;
					}
					System.out.print(c2+" ");
					c2++;
				}
			}

			System.out.println();
		}
    }
}