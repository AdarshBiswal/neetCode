package ArraysAndHashing.TwoSum;


//THIS IS WHEN THE ARRAY IS NOT SORTED.
//USE THE HASH MAP AND STORE nums[i] as key and i as value
//WHEN COMPARING CHECK IF (TARGET - NUMS[i] is there in the keyset. If present retrive the value
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String args[])
    {
        int nums[]={2,7,11,15};
        int target=9;

        int result[]=twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map =new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {

            if(map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(target-nums[i]),i};
            }
            else
            {
                map.put(nums[i],i);
            }
        }

        return new int[]{-1,-1};
    }


}