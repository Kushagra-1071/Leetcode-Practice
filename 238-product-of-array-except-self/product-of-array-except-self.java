class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int leftProduct=1;
        int rightProduct=1;
        int lArray[]=new int[nums.length];
        int rArray[]=new int[nums.length];
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            lArray[i]=leftProduct;
            rArray[j]=rightProduct;
            leftProduct*=nums[i];
            rightProduct*=nums[j];
            j--;
        }
        for(int i=0;i<nums.length;i++)
        {
            answer[i]=lArray[i]*rArray[i];
        }
        return answer;
    }
}