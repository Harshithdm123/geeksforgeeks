//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    
System.out.println("~");
}
		
	}
}

// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
         char []c = str.toCharArray();
        String t = "0";
        long sum = 0;
        for(int  i = 0; i<c.length; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                t = t+ch;
            }
            else{
                sum = sum + Long.parseLong(t);
                t = "0";
            }
        }
        sum = sum + Long.parseLong(t);
        return sum;
    }
    
}