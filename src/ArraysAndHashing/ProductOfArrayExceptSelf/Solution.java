package ArraysAndHashing.ProductOfArrayExceptSelf;

import java.sql.SQLOutput;

class Solution {

    public static void main(String[] args) {

        int nums[]={0,1};
        int result[]=productExceptSelf(nums);
        for(Integer i : result)
        {
            System.out.print(i+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {

        int result[]=new int[nums.length];


        int preArray[]=new int[nums.length];

        int postArray[]=new int[nums.length];

        int beforePreOrderIndex=1;
        int afterPostOrderIndex=1;

        //Construct PreOrder

        for(int i=0;i<preArray.length;i++)
        {
            if(i==0)
            {
                preArray[i]=beforePreOrderIndex*nums[i];
            }
            else
            {
                preArray[i]=preArray[i-1]*nums[i];
            }
        }

        //Construct PostArray

        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==nums.length-1)
            {
                postArray[i]=afterPostOrderIndex*nums[i];
            }
            else
            {
                postArray[i]=nums[i]*postArray[i+1];
            }
        }

        //NOW GET THE RESULT

        //TO GET THE RESULT
        // for nums[i] -> result[i] equals preArray[i]-1 * postArray[i+]; So it wont add nums[i] -> Product without itself

//        System.out.println("PreArray");
//        for (int i=0;i<nums.length;i++)
//        {
//            System.out.print(preArray[i]+" ");
//        }
//        System.out.println();
//        System.out.println("PostArray");
//        for (int i=0;i<nums.length;i++)
//        {
//            System.out.print(postArray[i]+" ");
//        }
//        System.out.println();
       for(int i=0;i<nums.length;i++)
       {
          if(i==0)
          {
              result[i]=beforePreOrderIndex*postArray[i+1];
          }
          else if(i==nums.length-1)
          {
              result[i]=preArray[i-1]*afterPostOrderIndex;
          }
          else
          {
              result[i]=preArray[i-1]*postArray[i+1];
          }
       }
        return result;
    }
}