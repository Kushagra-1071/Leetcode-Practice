class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        if(s.isEmpty())
        {
            return true;
        }
        if(s.length()>t.length())
        {
            return false;
        }
        for(int k=0;k<t.length();k++)
        {
            if(s.charAt(i)==t.charAt(k))
            {
                i++;
            }
            if(i==s.length())
            {
             return true;   
            }
        }
        return false;
    }
}