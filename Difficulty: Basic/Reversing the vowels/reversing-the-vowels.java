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
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here
        
        char[]  charArray=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(isVowel(charArray[i]) && isVowel(charArray[j])){
                char temp=charArray[i];
                charArray[i]=charArray[j];
                charArray[j]=temp;
                i++;
                j--;
            }else if(isVowel(charArray[i])==false){
                i++;
            }else{
                j--;
            }
            
        }
        return new String(charArray);
    }
    
        boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        
        
    }
}