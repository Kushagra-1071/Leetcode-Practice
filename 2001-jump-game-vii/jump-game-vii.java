class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int left,right,farthest=0;
        Queue<Integer> q=new LinkedList();
        q.add(0);
        while(!q.isEmpty())
        {
            int k=q.remove();
            if(k==s.length()-1) return true;
            left=Math.max(k+minJump,farthest);
            right=Math.min(k+maxJump,s.length()-1);
            for(int i=left;i<=right;i++)
            {
                if(s.charAt(i)=='0') q.add(i);
            }
            farthest=right+1;
        }
        return false;
    }
}