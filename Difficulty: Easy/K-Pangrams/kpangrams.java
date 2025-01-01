//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        
          Set<Character> s=new HashSet<>();
        StringBuffer sb=new StringBuffer();
        for(int i =0;i<str.length();i++){
           if(str.charAt(i)!=' '){ 
               s.add(str.charAt(i));
               sb.append(str.charAt(i));
           };
        }
        if(s.size()>=26  ||  (sb.length()>=26 && k>=26-(s.size())) ){
            return true;
        }
        return false;
        
        
    }
}