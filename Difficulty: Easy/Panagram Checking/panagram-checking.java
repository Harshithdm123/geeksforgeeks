//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function template for JAVA

class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // your code here
           HashSet<Character> a = new HashSet<>();
        s = s.toLowerCase();
        
        for(char ch :  s.toCharArray()){
            if(ch>='a' && ch<='z'){
               a.add(ch); 
            }
        }
        
        return a.size()==26 ;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine().trim();

            System.out.println(new Solution().checkPangram(s) == true ? "true"
                                                                      : "false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends