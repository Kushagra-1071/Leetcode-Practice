class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(letters[mid]>target)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        if(letters[start]<=target)
        {
            return letters[0];
        }
        else
        {
            return letters[start];
        }
    }
}