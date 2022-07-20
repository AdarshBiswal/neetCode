package ArraysAndHashing.LongestConsecutiveSequence;

import com.sun.source.util.Trees;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {

        int nums[]={0};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {


        if(nums.length==0)
        {
            return 0;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();

        int result=1;

        for(int i=0;i<nums.length;i++)
        {
            treeSet.add(nums[i]);
        }

        int prev=Integer.MIN_VALUE;
        int longestSubsequence =0;
        int longestTillNow=0;


        for(Integer num : treeSet)
        {
            if(prev==Integer.MIN_VALUE) {
                prev = num;
                longestSubsequence++;
            }
            else if(Math.abs(num -prev)==1)
            {
                prev=num;
                longestSubsequence++;
            }
            else
            {
                prev=num;
                longestSubsequence=1;
            }



            if(longestTillNow < longestSubsequence)
            {
                longestTillNow=longestSubsequence;
            }
        }

        return longestTillNow;
    }
}
