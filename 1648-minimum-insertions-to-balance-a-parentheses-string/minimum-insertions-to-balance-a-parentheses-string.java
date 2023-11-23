class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack=new Stack<>();
        //count is for counting the number of right parenthese
        int count=0;
        int result=0;
        for (char x:s.toCharArray()) {
            if (x == '(') {
                count+=2;
                if(count%2!=0){
                    result++;
                    count--;
                }
            }
            else{
                //we have encountered right paranthese
                count-=1;
                if(count<0){
                    count+=2;
                    result++;
                }
            }
        }
        return result+count;
    }
}