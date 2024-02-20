class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
       int [] allCost=new int[s.length()];
       for(int i=0; i<allCost.length; i++){
           allCost[i]=Math.abs(s.charAt(i) - t.charAt(i));
       } 
       int right;
       int left=0;
       int currCost=0;
       for( right=0;right<allCost.length;right++){
           currCost+=allCost[right];
           if(currCost > maxCost){
               currCost-=allCost[left];
               left++;
           }
       }
       return right-left;
    }
}