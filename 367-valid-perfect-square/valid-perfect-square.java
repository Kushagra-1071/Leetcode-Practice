class Solution {
    public boolean isPerfectSquare(int num) {
        long start=2,end=num,mid=1;
        if(num==1) return true;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid>num)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return false;
    }
}