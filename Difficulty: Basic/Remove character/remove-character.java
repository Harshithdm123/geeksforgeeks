//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        
         StringBuilder sb = new StringBuilder(string1);

        for (int i = 0; i < string2.length(); i++) {
            char cr = string2.charAt(i);
           
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == cr) {
                    sb.deleteCharAt(j);
                    j--; 
                }
            }
        }
        
        return sb.toString();
    }
}