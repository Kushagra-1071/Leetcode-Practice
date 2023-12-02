class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int i=0,j=grid[0].length-1;
        while(i<grid.length && j>=0)
        {
            if(grid[i][j]<0)
            {
                c+=grid.length-i;
                j--;
            }
            else
            {
                i++;
            }
        }
               return c;
    }
}