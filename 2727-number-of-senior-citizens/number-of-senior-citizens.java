class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String a:details)
        {
            int age=(a.charAt(11)-'0')*10+(a.charAt(12)-'0');
            if(age>60)
            {
                count++;
            }
        }
        return count;
    }
}