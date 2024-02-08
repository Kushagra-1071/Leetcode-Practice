class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans=new StringBuilder();
        int index=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                ans.append(word.substring(0,i+1));
                index=i+1;
                break;
            }
        }
        ans.reverse();
        ans.append(word.substring(index,word.length()));
        return ans.toString();
    }
}