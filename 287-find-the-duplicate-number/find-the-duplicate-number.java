class Solution {
    static void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;){
            if(nums[i]!=nums[nums[i]-1]) swap(nums,i,nums[i]-1);
            else i++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1) return nums[i];
        }
        
        
    
        
        int slow=nums[0],fast=nums[0];
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast) break;
        }
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}