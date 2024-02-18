class Solution {
    public int numSub(String s) {
        long c=0,ans=0;

        for(int i=0;i<s.length();i++)
        {
            Character ch=s.charAt(i);
            if(ch=='1')
            {
                c++;
            }
            else
            {
                ans+=c*(c+1)/2;
                c=0;
            }
        }
        ans+=c*(c+1)/2;
        return (int)(ans%(Math.pow(10,9)+7));

    }
}