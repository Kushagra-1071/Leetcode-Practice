class Solution {
    public int minimumPushes(String word) {
        //Calculating frequency of each letter
        Integer[] sortedFreq=new Integer[26];
        int[] letterFreq=new int[26];
        for(char a:word.toCharArray())
        {
            letterFreq[a-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            sortedFreq[i]=letterFreq[i];
        }
        Arrays.sort(sortedFreq,Collections.reverseOrder());
        int totalPresses=0;
        for(int i=0;i<26;i++)
        {
            if(sortedFreq[i]==0) break;
            totalPresses+=(i/8+1)*sortedFreq[i];
        }
    return totalPresses;
        

    }
}