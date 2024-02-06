class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        StringBuilder ans=new StringBuilder();
        ans.append(word);
        while(sequence.contains(ans)==true)
        {
            count++;
            ans.append(word);
        }
        return count;
    }
}