class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] original = new int[encoded.length+1];
        for(int i=0;i<encoded.length;i++){
            original[i]=first;
            first=encoded[i]^first;
        }
        original[original.length-1]=first;
        return original;
    }
}