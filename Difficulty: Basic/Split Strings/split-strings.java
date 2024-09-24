//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
      StringBuilder le=new StringBuilder();
      StringBuilder di=new StringBuilder();
      StringBuilder sp=new StringBuilder();
          char[] ar=S.toCharArray();
        for(int i=0;i<S.length();i++){
        if(Character.isAlphabetic(ar[i])){
            le.append(ar[i]);
            
            
        }
        else if(Character.isDigit(ar[i])){
        di.append(ar[i]);
        }
        else{
            sp.append(ar[i]);
        }
        
    }
    
    ArrayList<String> res=new ArrayList<>();
    
   
      if (le.length() == 0) {
            res.add("-1");
        } else {
             res.add(le.toString());
        }
    
    if (di.length() == 0) {
            res.add("-1");
        } else {
            res.add(di.toString());
        }
        
       
        if (sp.length() == 0) {
            res.add("-1");
        } else {
            res.add(sp.toString());
        }
        
    return res;
    
}

    
}
