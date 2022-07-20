package ArraysAndHashing.EncodeAndDecodeString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */


    public static void main(String[] args) {

        List<String> toBeDecoded = new ArrayList<>();

        toBeDecoded.add("lint");
        toBeDecoded.add("code");
        toBeDecoded.add("love");
        toBeDecoded.add("you");
        String encodedString =encode(toBeDecoded);
        System.out.println(encodedString);
        System.out.println(decode(encodedString));
    }
    public static String encode(List<String> strs) {
        // write your code here
        String encodedString ="";
        String finalEncodedString="";
        for(String S:strs)
        {
            if(encodedString.equals(""))
                encodedString=S;
            else
                encodedString+=":::"+S;
        }

        for(int i=0;i<encodedString.length();i++)
        {
            char coding = encodedString.charAt(i);
            coding +=5;
            finalEncodedString=finalEncodedString+coding;
        }

        return finalEncodedString;
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        // write your code here
        //Decode To -5 first
        String toBeDecided="";
        for (int i=0;i<str.length();i++)
        {
            char coding=str.charAt(i);
            coding-=5;
            toBeDecided+=coding;
        }


        //NOW REPLACE :::
        String decodedString[]=toBeDecided.split(":::");

        return Arrays.stream(decodedString).toList();

    }
}
