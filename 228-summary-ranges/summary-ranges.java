class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<String>();
        int i=0,start=0;
        while(i<nums.length)
        {
            start=nums[i];
            while(i<nums.length-1 && nums[i+1]==nums[i]+1)
            {
                i+=1;
            }
            if(start!=nums[i])
            {
                ans.add(start+"->"+nums[i]);
            }
            else
            {
                ans.add(Integer.toString(nums[i]));
            }
            i+=1;
        }
        return ans;
    }
}