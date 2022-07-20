package ArraysAndHashing.ContainDuplicate;

/*
Given an integer array nums,
return true if any value appears at least twice in the array, and return false if every element is distinct.
Input: nums = [1,2,3,1]
Output: true

 */


import java.util.HashSet;

public class Solution {
    public static void main(String args[])
    {
        int nums[]={1,2,3,4};
        System.out.println(containDuplicate(nums));

    }

    private static boolean containDuplicate(int[] nums) {

        HashSet<Integer> hashSet=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hashSet.add(nums[i])==false)
                return true;
        }
        return false;
    }
}
