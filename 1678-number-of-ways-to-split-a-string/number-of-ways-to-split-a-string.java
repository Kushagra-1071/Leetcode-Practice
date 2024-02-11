class Solution {
    public int numWays(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        long len=s.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                list.add(i);
            }
        }
        if(list.size()%3!=0)
        {
            return 0;
        }
        long mod=1_000_000_007;
        if(list.size()==0)
        {
            return (int)((((len-1)*(len-2))/2)%mod);
        }
        int k=list.size()/3;
        long ways=1;
        for(int i=k-1;i<list.size()-1;i+=k)
        {
            ways*=list.get(i+1)-list.get(i);
        }
        return (int)((ways)%mod);
    }
}