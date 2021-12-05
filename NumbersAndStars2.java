 // 1******
 // 12*****
 // 123****
 // 1234***
 // 12345**
 // 123456*
 // 1234567

import java.util.*;
public class NumbersAndStars2 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(j<=i){
					System.out.print(j);
				}
				else{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
    }
}