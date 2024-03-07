class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<Integer>();

        for(int i=1;i<=n;i++)
        {
            q.add(i);
        }
        int ans=0;

        while(!q.isEmpty())
        {
            for(int i=0;i<k;i++)
            {
                if(i==k-1)
                {
                    ans=q.poll();
                }
                else 
                {
                    int a=q.poll();
                    q.add(a);
                }
            }
        }
        return ans;
    }
}