class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }
        for(var a:hp.keySet())
        {
            if(hp.get(a)==1) return a;
        }
        return -1;
    }
}