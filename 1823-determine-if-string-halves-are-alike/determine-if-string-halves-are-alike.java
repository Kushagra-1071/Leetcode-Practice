class Solution {
    public boolean halvesAreAlike(String s) {
       s=s.toLowerCase();
        int c1=0,c2=0;
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        for(int i=0;i<s.length()/2;i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='o'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='u')
            {
                c1++;
            }
            if(b.charAt(i)=='a'||b.charAt(i)=='o'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='u')
            {
                c2++;
            }
        }
        return (c1==c2);
    }
}