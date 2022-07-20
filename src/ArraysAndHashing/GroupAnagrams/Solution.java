package ArraysAndHashing.GroupAnagrams;

import java.util.*;

class Solution {

    public static void main(String[] args) {

        String[] strs ={"eat","tea","tan","ate","nat","bat"} ;
        System.out.println(groupAnagrams(strs));
    }
    public static  List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> result=new ArrayList<>();
        Map<String,List> map= new HashMap<>();
        for (String value : strs) {
            char str[] = value.toCharArray();
            Arrays.sort(str);
            String sortedRes = new String(str);
            if (map.containsKey(sortedRes)) {
                List<String> list = map.get(sortedRes);
                list.add(value);

            } else {
                List<String> list = new ArrayList<>();
                list.add(value);

                map.put(sortedRes, list);
            }
        }

        for(String s:map.keySet())
        {
            result.add(map.get(s));
        }
        return result;
    }
}