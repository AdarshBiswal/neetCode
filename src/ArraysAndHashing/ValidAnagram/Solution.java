package ArraysAndHashing.ValidAnagram;

import java.util.Arrays;

class Solution {

    public static void main(String args[])
    {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static  boolean isAnagram(String s, String t)
    {

        char sArray[]=s.toCharArray();
        char tArray[]=t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        System.out.println(new String(sArray));

        System.out.println(new String(tArray));

        if( new String(sArray).equals(new String(tArray)))
        {
            return true;
        }
        return false;
    }
}