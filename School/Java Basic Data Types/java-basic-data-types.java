//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            Solution ob = new Solution();
            System.out.println(ob.javaIntType(sc));
            System.out.println(ob.javaStringType(sc));
            System.out.println(ob.javaFloatType(sc));
        }
    }
}
// } Driver Code Ends


class Solution {

    int javaIntType(Scanner sc) {
        // code here
        
        return sc.nextInt();
        
    }
    
    String javaStringType(Scanner sc) {
        // code here
          sc.nextLine();
        return sc.nextLine();
        
    }
    
    float javaFloatType(Scanner sc) {
        return sc.nextFloat();
        
        
        // code here
    }
};