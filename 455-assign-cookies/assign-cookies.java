class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //g-> greed factor of each child
        //s-> size of cookie; and size should be more than greed
        Arrays.sort(g);
        Arrays.sort(s);
        int cookiesNums=s.length;
        if(cookiesNums==0) return 0;
        int maxNum=0;
        int cookieIndex=cookiesNums-1;
        int childIndex=g.length-1;
        while(cookieIndex>=0 && childIndex>=0)
        {
            if(s[cookieIndex]>=g[childIndex])
            {
                maxNum++;
                cookieIndex--;
                childIndex--;
            }
            else
            {
                childIndex--;
            }
        }
        return maxNum;

    }
}