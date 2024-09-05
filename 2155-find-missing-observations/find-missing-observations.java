class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int required_sum=0,sum=0;
        for(int roll:rolls)
        {
            sum+=roll;
        }
        required_sum=mean*(n+rolls.length)-sum;
        if(required_sum<n || required_sum>6*n)
        {
            return new int[0];
        }
        int base=required_sum/n;
        int remainder=required_sum%n;

        int[] result=new int[n];

    for(int i=0;i<n;i++)
    {
        result[i]=base+(i<remainder?1:0);
    }
    return result;
      
    }
}