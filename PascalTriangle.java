     //       1
     //     1   1
     //   1   2   1
     // 1   3   3   1

import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
        	for(int j=0, k=0; j<=n*2-1; j++){
				if(j>=n-i && j<=n+i){
					System.out.print(comb(i,k) + " ");
                    System.out.print("  ");
                    j++;
					k++;
				}
				else
					System.out.print("  ");
        	}
        	System.out.println();
        }
    }

    public static int fact(int num){
    	if(num==0)
    		return 1;
    	int fact=1;
    	for(int i=1; i<=num; i++){
    		fact *= i;
    	}
    	return fact;
    }

    public static int comb(int n, int r){
    	int combination = fact(n) / (fact(r) * fact(n-r));
    	return combination;
    }
}