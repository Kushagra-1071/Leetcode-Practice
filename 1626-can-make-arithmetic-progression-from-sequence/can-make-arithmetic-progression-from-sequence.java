class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i+1]-arr[i]!=arr[j]-arr[j-1])
            {
                return false;
            }
        }
        return true;
    }
}