
public class FirstRepeat {
    public char findFirstRepeat(String A, int n) {
        // write code here
        char str[]=A.toCharArray();
        HashMap<Character, Integer> map= new HashMap<String,Character>;
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(str[i])==true)
            {
                return str[i];
            }
            else
            {
                map.put(str[i],0);
            }
        }
    }
}