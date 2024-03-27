class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++)
        {
            int j=0;
            while(true)
            {
                if((arr[i]^j)==encoded[i])
                {
                    arr[i+1]=j;
                    break;
                }
                j++;
            }
        }
        return arr;
    }
}