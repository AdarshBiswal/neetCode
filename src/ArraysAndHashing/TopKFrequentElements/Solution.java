package ArraysAndHashing.TopKFrequentElements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {

    public static void main(String[] args) {

        int nums[]={1,1,1,2,2,3};

        int result[]=topKFrequent(nums,2);

        String res="";
        for(int i=0;i<result.length;i++)
        {
            res=res+" "+result[i];
        }
        System.out.println(res.trim());


    }


    public static int[] topKFrequent(int[] nums, int k) {

        int result[]=new int[k];

        //Get Frequency of all numbers
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }

        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));


        for(Integer i:hm.keySet())
        {
            priorityQueue.add(i);
        }

        for(int i=0;i<k;i++)
        {
            result[i]=priorityQueue.remove();
        }
        return result;

    }
}