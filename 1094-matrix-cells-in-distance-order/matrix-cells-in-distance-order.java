class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ar=new int[rows*cols][2];
        int cntr=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                ar[cntr][0]=i;
                ar[cntr++][1]=j;
            }
        }
        insertionSort(ar,rCenter,cCenter);
        return ar;
    }
    public void insertionSort(int[][]arr,int rC,int cC)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if((Math.abs(arr[j][0] - rC) + Math.abs(arr[j][1] - cC)) < (Math.abs(arr[j - 1][0] - rC) + Math.abs(arr[j - 1][1] - cC)))
                {
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public void swap(int[][] ar,int n1,int n2)
    {
        int[] temp=ar[n1];
        ar[n1]=ar[n2];
        ar[n2]=temp;
    }
}