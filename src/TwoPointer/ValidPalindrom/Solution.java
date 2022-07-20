package TwoPointer.ValidPalindrom;

public class Solution {
    public static void main(String[] args) {

        String s="a";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        if(s.length()<=1)
        {
            return true;
        }

        boolean isPalindrom=false;

        int j=s.length()-1;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(s.length()-1-i))
            {
                isPalindrom=true;
            }
            else
            {
                return false;
            }
        }
        return isPalindrom;
    }

}
