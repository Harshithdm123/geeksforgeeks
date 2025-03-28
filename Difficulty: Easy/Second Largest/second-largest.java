//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        // int n=arr.length;
        // if(n<2) return -1;
        
        // Arrays.sort(arr);
        //   int m = arr[n - 1];
        
        
        // for(int x: arr){
        //     System.out.print(m-1);
        // }
        
        // return m-1;
         if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int fir = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > fir) {
                sec = fir;
                fir = num;
            } else if (num > sec && num != fir) {
                sec = num;
            }
        }

        return (sec == Integer.MIN_VALUE) ? -1 : sec;
        
    }
}