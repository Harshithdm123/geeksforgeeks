//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.transitionPoint(arr));
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int transitionPoint(int arr[]) {
        // code here
         int left, right, mid, n, index;
        
        n = arr.length;
        left = 0;
        right = n-1;
        index = -1;
        
        while(left <= right){
            mid = (left+right)/2;
            
            if(arr[mid] == 1){
                index = mid;
                right = mid-1;
            }
            else if(arr[mid] == 0){
                left = mid+1;
            }
        }
        
        return index;
        
        
    }
}