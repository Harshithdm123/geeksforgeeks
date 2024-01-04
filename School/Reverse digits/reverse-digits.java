//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.reverse_digit(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long reverse_digit(long num)
    {
      
     long rev_num = 0; 
        while (num > 0) { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev_num; 
      
      
        // Code here
    }
}