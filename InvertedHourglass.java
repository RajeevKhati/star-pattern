// 5                   5 
// 5 4               4 5 
// 5 4 3           3 4 5 
// 5 4 3 2       2 3 4 5 
// 5 4 3 2 1   1 2 3 4 5 
// 5 4 3 2 1 0 1 2 3 4 5 
// 5 4 3 2 1   1 2 3 4 5 
// 5 4 3 2       2 3 4 5 
// 5 4 3           3 4 5 
// 5 4               4 5 
// 5                   5 

import java.util.*;
public class InvertedHourglass {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int space=((n*2)-1)+2;//9
		int limit=0;
		for(int i=1; i<=(n*2)+1; i++){
			if(i<=n+1){
				space-=2;
				limit++;
			}else{
				space+=2;
				limit--;
			}
			int c1=n;
			int s=space;
			for(int j=1; j<=(n*2)+1; j++){
				//number
				if(j<=limit){
					System.out.print(c1+" ");
					if(c1==0)
						continue;
					c1--;
				}
				//space
				else if(s>0){
					System.out.print("  ");
					s--;
				}
				//number
				else{
					c1++;
					System.out.print(c1+" ");
				}
			}
			System.out.println();
		}
    }
}