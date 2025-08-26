package Assignment_3.lvl3;

import java.util.Scanner;

public class dayofweek{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in)  ; 
    	System.out.println("ENter month: ") ; 
    	int m = s.nextInt() ; 
    	System.out.println("ENter year: ") ;
    	int y = s.nextInt(); 
    	
    	System.out.println("ENter day: ") ;
    	int d = s.nextInt() ; 

        // Apply formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Map result to day name
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Day of the week: " + days[d0]);
    }
}

