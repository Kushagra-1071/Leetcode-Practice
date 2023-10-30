class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int ans=Integer.MIN_VALUE;
        int i=0;
        int g=1;
        while(i<points.length)
        {
            if(g<=i)
            {
                g=i+1;
            }
            for(int j=g;j<points.length;j++)
            {
                if(points[j][0]>points[i][0]+k)
                {
                    break;
                }
            int temp=points[i][1]+points[j][1]+Math.abs(points[j][0]-points[i][0]);
            if(temp>ans)
            {
                ans=temp;
                g=j;
            }
            }
            i++;
        }
        return ans;
    }
}