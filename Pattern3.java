// 1
// 2 * 2
// 3 * 3 * 3
// 4 * 4 * 4 * 4
// 5 * 5 * 5 * 5 * 5
// 4 * 4 * 4 * 4
// 3 * 3 * 3
// 2 * 2
// 1

import java.util.*;
public class Pattern3 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

        int count = 1;
        int not = 1; //number of things in each row

        int rows = 1;
        while(rows<= (n*2)-1){
            boolean flag = true;
            for(int i=1; i<=not; i++){
                if(flag){
                    System.out.print(count+" ");
                    flag=false;
                }else{
                    System.out.print("* ");
                    flag=true;
                }
                
            }

            System.out.println();
            if(rows<n){
                not+=2;
                count++;
            }else{
                not-=2;
                count--;
            }
            rows++;
            
        }
    }
}