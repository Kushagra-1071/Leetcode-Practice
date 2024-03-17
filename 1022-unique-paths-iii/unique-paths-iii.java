class Solution {
    int path=0;
    public int uniquePathsIII(int[][] grid) {
        int zero=0;
        int x=-1;
        int y=-1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==0)
                {
                    zero++;
                }
                if(grid[i][j]==1)
                {
                    x=i;
                    y=j;
                }
            }
        }
        find(x,y,grid,zero+1);
        return path;
    }
    public void find(int i,int j,int[][] arr,int zero)
    {
        if(i<0||j<0 || i>=arr.length || j>=arr[i].length || arr[i][j]==-1)
        {
            return;
        }
        if(arr[i][j]==2 && zero==0)
        {
            path++;
            return;
        }
        int val=arr[i][j];
        arr[i][j]=-1;
        find(i+1,j,arr,zero-1);
        find(i-1,j,arr,zero-1);
        find(i,j+1,arr,zero-1);
        find(i,j-1,arr,zero-1);
        arr[i][j]=val;
    }
}