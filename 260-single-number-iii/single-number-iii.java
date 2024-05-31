class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int elem:nums)
        {
            if(set.contains(elem))
            {
                set.remove(elem);
            }
            else 
            {
                set.add(elem);
            }
        }
        int[] ans=new int[2];
        int i=0;
        for(int x:set)
        {
            ans[i++]=x;
        }
        return ans;
    }
}