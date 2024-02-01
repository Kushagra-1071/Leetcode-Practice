class Solution {
    public String freqAlphabets(String s) {

       
        StringBuilder sb = new StringBuilder();
        // String rs ="";
        int i = s.length() -1;
        while(i>=0)
        {
            int number =0;
            if(s.charAt(i)== '#')
            {
                number = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
                i = i-3;

            }

            else{
                number = (s.charAt(i)-'0');
                i--;
            }

            // rs = (char)(number+96) +rs;
            sb.append((char)(number+96));
        }
       

        return sb.reverse().toString();










        //  int number = 0 ;
        //     if ( s.charAt(i)=='#'){
        //         number =  (s.charAt(i-2)-'0')*10 + ( s.charAt(i-1)-'0');
        //         i -= 2;
        //     }else{
        //         number = s.charAt(i)-'0';
        //     }
        //     ans.append((char) (number+96) );


    //     int i = s.length()-1;
    
    //     char [] c = s.toCharArray();

    //     String rs ="";
    //  while(i>=0)
    //  {
         
    //      if(c[i] == '#')
    //      {
    //          String ss = "";
    //          ss = ss + c[i-2] + c[i-1];
    //          int n = Integer.parseInt(ss);
    //          rs = alpha(n) + rs; 
    //          i = i-3;
    //      }

    //      else{

    //          int t  = c[i] - '0';
            
    //          rs =  alpha(t)+ rs;
    //          i--;
    //      }

    //  }

    //  return rs;

    // }

    // public String alpha(int n)
    // {
    //     if(n == 1)
    //     return "a";
    //      else if(n == 2)
    //     return "b";
    //      else if(n == 3)
    //     return "c";
    //      else if(n == 4)
    //     return "d";
    //      else if(n == 5)
    //     return "e";
    //      else if(n == 6)
    //     return "f";
    //      else if(n == 7)
    //     return "g";
    //     else if(n == 8)
    //     return "h";
    //     else if(n == 9)
    //     return "i";
    //     else if(n == 10)
    //     return "j";
    //     else if(n == 11)
    //     return "k";
    //     else if(n == 12)
    //     return "l";
    //     else if(n == 13)
    //     return "m";
    //     else if(n == 14)
    //     return "n";
    //     else if(n == 15)
    //     return "o";
    //     else if(n == 16)
    //     return "p";
    //     else if(n == 17)
    //     return "q";
    //     else if(n == 18)
    //     return "r";
    //     else if(n == 19)
    //     return "s";
    //     else if(n == 20)
    //     return "t";
    //     else if(n == 21)
    //     return "u";
    //     else if(n == 22)
    //     return "v";
    //     else if(n == 23)
    //     return "w";
    //     else if(n == 24)
    //     return "x";
    //     else if(n == 25)
    //     return "y";

    //     else
    //     return "z";

    }
}