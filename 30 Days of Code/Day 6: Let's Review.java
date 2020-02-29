package day0;
import java.io.*;
import java.util.*;

public class Solution {
    
	private static final Scanner scan = new Scanner(System.in);
   
    public static void main(String[] args) {

        int n = scan.nextInt();              
        String[] strArr = new String[n];
        scan.nextLine();
        
        for (int i = 0; i < n; i++) {
        	strArr[i] = scan.nextLine();
            char[] charArray = strArr[i].toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }       
        scan.close();   
    }   
}
