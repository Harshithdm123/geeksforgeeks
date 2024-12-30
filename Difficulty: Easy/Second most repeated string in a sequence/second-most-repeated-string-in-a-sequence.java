//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        
         StringBuilder sb = new StringBuilder();
        Map<String , Integer> hm = new HashMap<>();

        for( int i =0 ; i<arr.length;i++){

            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);

            }
            else{
                hm.put(arr[i],1);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for( String e : hm.keySet()){
            al.add(hm.get(e));

        }
        al.sort(Comparator.reverseOrder());
    
        for( Map.Entry<String, Integer> entry  : hm.entrySet()){
         if( hm.get(entry.getKey()) == al.get(1)){
        
           sb.append(entry.getKey());
            break;

         }
        }
        return sb.toString();
    }
}