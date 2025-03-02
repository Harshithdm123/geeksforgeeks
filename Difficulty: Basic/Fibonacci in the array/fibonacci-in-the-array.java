//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            // Read array input
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            long[] arr = new long[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Long.parseLong(inputArray[i]);
            }

            Solution solution = new Solution();
            System.out.println(solution.countFibonacciNumbers(arr));
            System.out.println("~");
        }

        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    public int countFibonacciNumbers(long[] arr) {
        // code here
        
        
        HashSet<Long> fibonacciSet = new HashSet<>();
        long a = 0, b = 1;
        fibonacciSet.add(a);
        fibonacciSet.add(b);
        
        long maxElement = Long.MIN_VALUE;
        for (long num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        
        while (true) {
            long c = a + b; 
            if (c > maxElement) break;
            fibonacciSet.add(c);
            a = b;
            b = c;
        }
        
    
        int count = 0;
        for (long num : arr) {
            if (fibonacciSet.contains(num)) {
                count++;
            }
        }
        
        return count;
        
    }
}
