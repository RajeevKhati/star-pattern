// *       *
// **     **
// ***   ***
// **** ****
// *********

import java.util.*;
public class Pattern1 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

        int rows = 1;
        int nst = 1;
        int sp = (n*2)-3;
        while(rows<=n){
            for(int i=1; i<=nst; i++){
                if(i==n)
                    continue;
                System.out.print("*");
            }

            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }

            for(int i=1; i<=nst; i++){
                System.out.print("*");
            }

            System.out.println();
            rows++;
            sp-=2;
            nst++;
        }
    }
}