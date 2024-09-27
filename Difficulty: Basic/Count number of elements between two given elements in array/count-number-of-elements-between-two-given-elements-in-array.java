//{ Driver Code Starts
import java.io.IOException;
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends
class Solution {
    // Function to get the count of elements between num1 and num2 in array arr.
    public int getCount(ArrayList<Integer> arr, int num1, int num2) {
        // Your Code goes here.
            int i = arr.indexOf(num1), j = -1;
        for(int k=i+1; k<arr.size(); k++){
            if(arr.get(k)==num2){
                j = k;
            }
        }
        if(j==-1){
            return 0;
        }
        return j-i-1;
        
        
        
    }
}

//{ Driver Code Starts.
public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Read t

        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String[] input = sc.nextLine().split(" ");
            for (String s : input) {
                arr.add(Integer.parseInt(s));
            }
            String[] nums = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);

            Solution ob = new Solution();
            System.out.println(ob.getCount(arr, num1, num2));
            // System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends