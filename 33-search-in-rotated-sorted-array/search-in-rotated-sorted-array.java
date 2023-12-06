class Solution { //find pivot and apply separate binary searches
    public int search(int[] nums, int target) 
    {
        int k=search(nums);
        int a=search(nums,target,0,k);
        if(a==-1)
        {
            a=search(nums,target,k+1,nums.length-1);
        }
        return a;
    }

    public int search(int[] a) {
      int mid=0,start=0,end=a.length-1;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(mid< end && a[mid]>a[mid+1])
			{
				return mid;
			}
			else if(mid> start && a[mid]<a[mid-1])
			{
				return mid-1;
			}
			else if(a[mid]<=a[start]){
				end=mid-1;
			}
			else 
			{
				start=mid+1;
			}
			
		}

		return -1;
	}
	public int search(int[] a,int target,int start,int end)
	{
		int mid=0;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(a[mid]>target)
			{
				end=mid-1;
			}
			else if(a[mid]<target)
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}