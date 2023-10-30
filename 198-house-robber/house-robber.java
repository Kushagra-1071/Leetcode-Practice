class Solution {
    public int rob(int[] nums) {
        int[] max_val=new int[nums.length];
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        max_val[0]=nums[0];
        max_val[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            max_val[i]=Math.max(max_val[i-1],max_val[i-2]+nums[i]);
        }
        return max_val[nums.length-1];
    }
}