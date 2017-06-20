//判断一个数是否为回文数
public class Solution {
    public boolean isPalindrome(int x) {

        if(x<0)
        {
            return false;
        }
        int a=0;
        int temp=x;
        while(temp!=0)  //这种做法有可能会溢出
        {
            a=a*10;
            a=a+temp%10;
            temp=temp/10;
        }
        return (a==x);
    }
}