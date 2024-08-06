class Solution {
    public int search(int[] nums, int target) {
        int mid=0;
        int low=0,high=nums.length-1;
        while(high>=low)
        {
            mid=low+(high-low/2);
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
}