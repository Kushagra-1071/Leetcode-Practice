class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int j,i=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(i<nums.length)
        {   
            j=nums[i]-1;
            if(nums[i]!=nums[j])
            {
                
                swap(nums,i,j);
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                list.add(nums[i]);
            }
        }
        return list;
    }
    void swap(int[] nums,int i,int j)
    {
         int temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
    }
}