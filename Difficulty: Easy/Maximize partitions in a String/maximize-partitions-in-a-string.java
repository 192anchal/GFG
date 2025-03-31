//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.maxPartitions(s);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxPartitions(String s) {
        // code here
        List<Integer> partitions = new ArrayList<>();
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndexMap.get(s.charAt(i)));  
            
            if (i == end) { 
                partitions.add(end - start + 1);
                start = i + 1; 
            }
        }
        
        return partitions.size();
    }
}