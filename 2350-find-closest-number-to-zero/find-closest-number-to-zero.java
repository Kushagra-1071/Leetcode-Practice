class Solution {
    public int findClosestNumber(int[] nums) {
        int closest=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])<Math.abs(closest))
            {
                closest=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if (Math.abs(closest)==nums[i])
            {
                closest=nums[i];
            }
        }
        return closest;
        
    }
}