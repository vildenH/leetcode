//罗马数字转整数
public class Solution {
    public int romanToInt(String s) {
        Map <Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            int now=map.get(s.charAt(i));
            int next=0;         //比较的时候注意末尾走到最后的时候没有next值
            if(i!=length-1)
            next=map.get(s.charAt(i+1));
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
    /*
    public static void main(String args[])
    {
        Solution sol=new Solution( );
        String s="DCCCLXXVIII";
        System.out.println(sol.romanToInt(s));
    }*/
    
}