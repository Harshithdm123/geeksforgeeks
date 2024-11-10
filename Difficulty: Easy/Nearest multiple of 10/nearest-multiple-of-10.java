//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    String roundToNearest(String str) {
        // Complete the function
              if(str.charAt(str.length()-1)-'0'<= 5){

            return str.substring(0,str.length()-1)+"0";

        }     

        int pc = 1, m = 10;

        char[] ch = str.toCharArray();

        int i = str.length()-2;

        ch[i+1] = '0';

        while(i >= 0 && pc == 1){

            int cn = ch[i] -'0';

            cn += pc;

            ch[i] = (char)((cn%10)+'0') ;

            if(cn>=10)

              pc = 1;

            else

              pc = 0;

            i--;

        }

        if(pc==1)

        return "1"+new String(ch);

        return new String(ch);
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends