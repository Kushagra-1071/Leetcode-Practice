class Solution {
    public int maxProduct(int[] nums) {
        int j=0,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max1)
            {
                max1=nums[i];
                j=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==j)
            {
                continue;
            }
            else
            {
                max2=Math.max(max2,nums[i]);
            }
        }
        return (max1-1)*(max2-1);
    }
}