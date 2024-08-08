class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res=new int[rows*cols][];
        int k=0;
        res[k++]=new int[]{rStart,cStart};
        int[] direction={0,1,0,-1,0};
        int d=0;
        int len=0;
        while(k<rows*cols)
        {
            if(d==0||d==2)
            {
                len++;
            }
            for(int i=0;i<len;i++)
            {
                rStart+=direction[d];
                cStart+=direction[d+1];

                if(rStart>-1 && rStart<rows && cStart>-1 && cStart<cols)
                {
                    res[k++]=new int[]{rStart,cStart};
                }
            }
                d=++d%4;
        }
            return res;
        
    }
}