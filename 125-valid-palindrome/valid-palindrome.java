class Solution {

    public boolean isAlnum(char a) {
        return (a >= '0' && a <= '9') || (a >= 'a' && a <= 'z');
    }

    public boolean isPalindrome(String s) {
        int d = 'a' - 'A';

        for (int i = 0, j = s.length() - 1; i < j;) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            if (a >= 'A' && a <= 'Z') {
                a += d;
            }

            if (b >= 'A' && b <= 'Z') {
                b += d;
            }

            if (!isAlnum(a)) {
                i++;
            } else if (!isAlnum(b)) {
                j--;
            } else if (a != b) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;
    }
}