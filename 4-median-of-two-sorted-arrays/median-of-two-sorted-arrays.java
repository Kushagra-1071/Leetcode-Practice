class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int[] newArr=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                newArr[k++]=nums1[i++];
            }
            else
            {
                newArr[k++]=nums2[j++];
            }
        }
        while(i<n)
        {
            newArr[k++]=nums1[i++];
        }
        while(j<m)
        {
            newArr[k++]=nums2[j++];
        }
        if((n+m)%2==0)
        {
            return (double)(newArr[(n+m)/2]+newArr[((n+m)/2)-1])/2;
        }
        else
        {
            return newArr[(n+m)/2];
        }
    }
}