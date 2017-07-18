
//给定一些数字数组，要从这些数组中取两个不同的数组中取两个元素，使得两元素差的绝对值最少。
//要从不同数组中取元素，所以可以不断比较。


public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int result=-1000000;
        for(int i=1;i<arrays.size();i++)
        {
            result=Math.max(result,Math.abs(min-arrays.get(i).get(arrays.get(i).size()-1)));
            result=Math.max(result,Math.abs(max-arrays.get(i).get(0)));
            


            min=Math.min(min,arrays.get(i).get(0));//取第一个
            max=Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));//取第最后一个不断比较大小
        }

        return result;
    }
}