class Solution {
    private List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates,target,0,new ArrayList<>());
        return result;
    }
    public void solve(int[] nums,int target, int index,List<Integer> list)
    {
        if(target==0)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j:list)
            {
                temp.add(j);
            }
            result.add(temp);
            return;
        }
        if(index==nums.length || target<nums[index])
        {
            return;
        }
        int temp=nums[index];
        list.add(nums[index]);
        solve(nums,target-nums[index],index+1,list);
        list.remove(list.size()-1);
        int i=1;
        while(index+i<nums.length && nums[index+i]==temp)
        {
            i++;
        }
        solve(nums,target,index+i,list);
        return;
    }

}