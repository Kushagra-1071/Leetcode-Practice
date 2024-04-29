class Solution {
    public int integerBreak(int n) {
        if(n<=3)
        {
            return n-1;
        }
        int m=3;
        int range=n/m;
        int remainder=n%3;
        double product=1;
        if(remainder==1)
        {
            range=range-1;
            remainder=1+m;
        }
        if(remainder==0)
        {
            remainder=1;
        }
        while(range>=10)
        {
            int carry=range-10;
            product=product*Math.pow(3,10);
            range=carry;
        }
        if(range<10)
        {
            product=product*Math.pow(3,range);
        }
        product=product*remainder;
        return (int)product;
    }
}