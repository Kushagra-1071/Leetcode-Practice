class Solution {
    public boolean isLongPressedName(String name, String typed) {
       int idx1=0,idx2=0;
       char prev=name.charAt(0);
       char c2=typed.charAt(0);
       char c1=prev;
       while(idx1<name.length() && idx2<typed.length())
       {
           c1=name.charAt(idx1);
           c2=typed.charAt(idx2);
           if(c1==c2)
           {
               idx1++;
               idx2++;
               prev=c1;
           }
           else if(c2==prev)
           {
               idx2++;
           }
           else
           {
               return false;
           }
       }
       while(idx2<typed.length())
       {
           c2=typed.charAt(idx2);
           if(c2!=c1)
           {
               return false;
           }
           idx2++;
       }
       return idx1==name.length() && idx2==typed.length();
    }
}