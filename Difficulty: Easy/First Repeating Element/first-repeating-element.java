//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.firstRepeated(arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Your code here
        
        int min =arr.length+1;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            //
            if (map.containsKey(arr[i])){
                // storing repeted element index
                int ind = map.get(arr[i]);
                // checking for the minimum index 
                if(min>ind){
                    min=ind;
                }   
            }
            else{
                // put element with there indexes
                map.put(arr[i],i+1);
            }
        }
        // if we have no repeted elements
        if(min>arr.length){
            return -1;
        }
        
        return min;
    }
}
