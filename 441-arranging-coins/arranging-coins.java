class Solution {
    public int arrangeCoins(int n) {
        long left=0;
        long right=n;
        while(left<=right)
        {
            long pivot=left+(right-left)/2;
            if((pivot*(pivot+1))/2==n)
            {
                return (int)pivot;
            }
            else if((pivot*(pivot+1))/2>n)
            {
                right=pivot-1;
            }
            else 
            {
                left=pivot+1;
            }
        }
        return (int)right;
    }
}