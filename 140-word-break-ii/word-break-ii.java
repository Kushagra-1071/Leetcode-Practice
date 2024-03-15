class Solution {
    private int maxLength;
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet=new HashSet<>(wordDict);
        for(String word: wordDict)
        {
            maxLength=Math.max(maxLength,word.length());

        }
        if(!canWordBreak(s,wordSet))
        {
            return new ArrayList<>();
        }
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(s,0,sb,wordSet,result);
        return result;
    }
    private void dfs(String s,int index,StringBuilder sb, Set<String> wordSet,List<String> result)
    {
        int n=s.length();
        if(index==n)
        {
            sb.deleteCharAt(sb.length()-1);
            result.add(sb.toString());
            return;
        }
        int sbLength=sb.length();
        for(int i=index;i<n && i<index+maxLength;i++)
        {
            String prefix=s.substring(index,i+1);
            if(wordSet.contains(prefix))
            {
                sb.append(prefix).append(" ");
                dfs(s,i+1,sb,wordSet,result);
                sb.setLength(sbLength);
            }
        }
    }
    private boolean canWordBreak(String s,Set<String> wordSet)
    {
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=0;i<n;i++)
        {
            if(!dp[i])
            {
                continue;
            }
                for(int j=i;j<n && j<i+maxLength;j++)
        {
            String prefix=s.substring(i,j+1);
            if(wordSet.contains(prefix))
            {
                dp[j+1]=true;
            }
            if(dp[n])
            {
                return true;
            }
        }
        }
        return false;
    }
}