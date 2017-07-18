
//找到排序数组中 插入target的位置。 二分法。
public class Solution {
    public int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }



    public static void main(String args[])
    {
        int a[]={1,1,1,1,1,1,1,1,1};
        int b[]={1,2,3,4,5,6,7,8,9};
        Solution s=new Solution();
        System.out.println(s.searchInsert(a,1));
    }
}