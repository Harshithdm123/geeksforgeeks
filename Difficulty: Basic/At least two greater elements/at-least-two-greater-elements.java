//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            long n = inputLine.length;
            long arr[] = new long[(int)(n)];

            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution obj = new Solution();
            long answer[] = obj.findElements(arr);
            long sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) output.append(answer[i] + " ");
            System.out.println(output);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        Arrays.sort(arr);
        
        long[] res=new long[arr.length-2];
        for(int i=0;i<arr.length-2;i++){
            res[i]=arr[i];
            
        }
        return res;
        
    }
}