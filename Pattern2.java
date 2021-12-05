//     1    
//    121   
//   12321  
//  1234321 
// 123454321

import java.util.*;
public class Pattern2 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

        int sp = n-1;
        int non = 1; //number of numbers in each row

        int rows = 1;
        while(rows<=n){
            int count=1;

            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }

            for(int i=1; i<=non; i++){
                System.out.print(count);
                if(i<=non/2)
                    count++;
                else
                    count--;
            }

            System.out.println();
            rows++;
            sp--;
            non+=2;
        }
    }
}