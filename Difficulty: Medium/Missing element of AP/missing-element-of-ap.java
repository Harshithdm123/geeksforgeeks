//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMissing(int[] arr) {
        // code here
        int sum=0;
        
        int n=arr.length;
        int s;
        
        int a=arr[0];
        int l=arr[n-1];
        
        if((a+l)%2==0)
{
    s=(a+l)/2;
    
    s=(n+1)*s;
}   

else{
    
    s=(n+1)/2;
    s=(a+l)*s;
    
}
        
        for (int i=0;i<arr.length;i++){
            
            sum += arr[i];
            
        }
        return s-sum;
        
        
    }
}
