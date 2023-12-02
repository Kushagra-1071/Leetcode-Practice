class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int lastneg=grid[0].length-1;
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][0]<0)
            {
                c+=grid[0].length;
                continue;
            }
            if(grid[i][grid[0].length-1]>0)
            {
                continue;
            }
            int l=0,r=lastneg;
            while(l<=r)
            {
                int m=l+(r-l)/2;
                if(grid[i][m]<0)
                {
                    r=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
        c+=grid[0].length-l;

        }
        return c;
    }
}