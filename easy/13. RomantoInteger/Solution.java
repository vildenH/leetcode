
//罗马数字转整数
public class Solution {
    public int romanToInt(String s) {
        HashMap <String,Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int now=map.get(s.charAt(i));
            int next=map.get(s.charAt(i));
            if(now<next)
            {
                ans=ans-now;
            }
            else
            {
                ans=ans+now;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        String s="DCXXI";
        Solution ss=new Solution();
        System.out.println(ss.romanToInt(s));
    }
}