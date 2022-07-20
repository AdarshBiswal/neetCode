package TwoPointer.ThreeSum;


/*Given an integer array nums,
return all the triplets
[nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));


    }
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resultList=new ArrayList<>();

        //ARRAY IS SORTED SO THAT WE CAN ELEMINATE THE DUPLICATES
        Arrays.sort(nums);
        int i=0;
        while(i< nums.length-1)
        {
            if(i>0)
            {
                if(nums[i]==nums[i-1])
                {
                    i++;
                    continue;
                }
            }
            int leftPointer=i+1;
            int rightPointer=nums.length-1;

            while(leftPointer<rightPointer)
            {
                if(leftPointer-1 !=i)
                {
                    if(nums[leftPointer-1]==nums[leftPointer])
                    {
                        leftPointer++;
                        continue;
                    }
                }
                if(rightPointer< nums.length-1)
                {
                    //check if duplicate iterated
                    if(nums[rightPointer+1]==nums[rightPointer])
                    {
                        rightPointer--;
                        continue;
                    }
                }
               // System.out.println("i= "+i+" leftPointer="+leftPointer+" rightPointer="+rightPointer);
                //Now check if addition of numbers are 0
                int sum=nums[i]+nums[leftPointer]+nums[rightPointer];
                if(sum==0)
                {
                    List<Integer> list =new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[leftPointer]);
                    list.add(nums[rightPointer]);

                    resultList.add(list);
                    leftPointer++;
                    rightPointer--;

                    continue;
                }
                else if(sum > 0)
                {
                    rightPointer--;
                }
                else
                {
                    leftPointer++;
                }

            }
            i++;

        }
        return resultList;
    }
}
