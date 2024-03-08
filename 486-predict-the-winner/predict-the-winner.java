class Solution {
    public boolean predictTheWinner(int[] nums) {
        Integer[][][] table=new Integer[nums.length][nums.length][2];
        int maxScore=recurse(true,table,0,nums.length-1,nums);

        int total=Arrays.stream(nums).sum();

        return maxScore*2>=total;
    }

    int recurse(boolean isP1,Integer[][][] table, int start, int end,int[] nums)
    {
        if(start>=end) return isP1? nums[start]:0;
        if(table[start][end][isP1?0:1]!=null)
        {
            return table[start][end][isP1?0:1];
        }

        if(isP1)
        {
            int chooseFirst=recurse(false,table,start+1,end,nums);
            int chooseLast=recurse(false,table,start,end-1,nums);

            table[start][end][0]=Math.max(chooseFirst+nums[start],chooseLast+nums[end]);
            return Math.max(chooseFirst+nums[start], chooseLast+nums[end]);
        }

        else
        {
            int chooseFirst=recurse(true,table,start+1,end,nums);
            int chooseLast=recurse(true,table,start,end-1,nums);
            table[start][end][1]=Math.min(chooseFirst,chooseLast);
            return Math.min(chooseFirst,chooseLast);
        }
    }
}