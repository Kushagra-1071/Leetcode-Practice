class Solution {
    public String freqAlphabets(String s) {
        String s26=s.replace("26#","z");
        String s25=s26.replace("25#","y");
        String s24=s25.replace("24#","x");
        String s23=s24.replace("23#","w");
        String s22=s23.replace("22#","v");
        String s21=s22.replace("21#","u");
        String s20=s21.replace("20#","t");
        String s19=s20.replace("19#","s");
        String s18=s19.replace("18#","r");
        String s17=s18.replace("17#","q");
        String s16=s17.replace("16#","p");
        String s15=s16.replace("15#","o");
        String s14=s15.replace("14#","n");
        String s13=s14.replace("13#","m");
        String s12=s13.replace("12#","l");
        String s11=s12.replace("11#","k");
        String s10=s11.replace("10#","j");
        String s9=s10.replace('9','i');
        String s8=s9.replace('8','h');
        String s7=s8.replace('7','g');
        String s6=s7.replace('6','f');
        String s5=s6.replace('5','e');
        String s4=s5.replace('4','d');
        String s3=s4.replace('3','c');
        String s2=s3.replace('2','b');
        String s1=s2.replace('1','a');
        return s1;
    }
}