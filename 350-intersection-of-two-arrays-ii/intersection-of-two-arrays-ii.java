class Solution{
public int[] intersect(int[] nums1, int[] nums2) {
	
        int[] ans1=new int[1025];
        int[] ans2=new int[1000];
        for(int i:nums1)
        {
            ans1[i]++;
        }
        int c=0;
        for(int i:nums2)
        {
            if(ans1[i]>0)
            {
                ans2[c++]=i;
                ans1[i]--;
            }
        }
        return Arrays.copyOfRange(ans2,0,c);
    }
}