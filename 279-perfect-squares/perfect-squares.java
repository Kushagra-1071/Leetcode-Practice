class Solution {
    public int numSquares(int n) {
       int arr[]=new int[n+1];
       Arrays.fill(arr,-1);
       return helper(n,arr);

    }
    public int helper(int n,int[] arr)
    {
        if(arr[n]!=-1) return arr[n];
        if(n<=0)
        {
           return 0;
        }
       int res=0;
       int min=Integer.MAX_VALUE;

       for(int i=1;i<=Math.sqrt(n);i++)
       {
           res=1+helper(n-(i*i),arr);
           min=Math.min(res,min);
       }
        return arr[n]=min;
    }
}