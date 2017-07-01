public class Solution {
    
  public String longestCommonPrefix(String[] strs) {
       String pre=strs[0];
       for(int i=1;i<str.length;i++)
       {
           while(strs[i].indexOf(pre)<0)
           {
               pre=pre.subString(0,pre.length-1);
               
           }
       }
    }
}