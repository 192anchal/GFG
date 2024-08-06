//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        // Write your code here
         int i = 0;
        int c = 0;
        int n = str.length();
        
        if (n < 7 || n > 15) {
            return false;
        }

        while (i < n) {
            int f = i;
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            while (i < n && str.charAt(i) != '.') {
                i++;
            }
            String s = str.substring(f, i);
            
            if (s.length() > 1 && s.startsWith("0") || s.isEmpty()) {
                return false; 
            }
            
            int num = Integer.valueOf(s);
            if (num < 0 || num > 255) {
                return false;
            }
            
            c++;
            if (i < n && str.charAt(i) == '.') {
                i++;
            }
        }
        
        // Must have exactly 4 segments
        return c == 4;
    }
}