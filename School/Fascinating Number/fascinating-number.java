//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
         String two=Long.toString(n*2);
        String three=Long.toString(n*3);
        String str= Long.toString(n);
        if(str.length()>=3){
            String res=(str.concat(two)).concat(three);
            
            if(res.matches("^(?!.*(.).*\\1)[1-9]+$")) return true;
           
        }
        return false;
    }
}