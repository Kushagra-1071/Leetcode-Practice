class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s=0,e=0;
        for(int i=0;i<weights.length;i++)
        {
            s=Math.max(s,weights[i]);
            e+=weights[i];
        }
        while(s<e)
        {
            int mid=s+(e-s)/2;
            int sum=0;
            int subarr=1;
            for(int i=0;i<weights.length;i++)
            {
                if(sum+weights[i]>mid)
                {
                    sum=weights[i];
                    subarr++;
                }
                else
                {
                    sum+=weights[i];
                }
            }
            if(subarr>days) s=mid+1;
            else e=mid;
        }
        return e;
    }
}