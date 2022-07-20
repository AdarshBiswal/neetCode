package TwoPointer.ContainerWithMostWater;



/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
 */

public class Solution {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));

    }
    public static int maxArea(int[] height) {

        int i=0;
        int j=height.length-1;

        int maxWater=0;

        while(i<j)
        {


          //  System.out.println("i= "+i+" j="+j);
            int minHeightNow=Math.min(height[i],height[j]);
            int area=(j-i)*minHeightNow;
         //   System.out.println(minHeightNow);
            //System.out.println(area);

            if(maxWater<area)
            {
                maxWater=area;
            }


            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        return maxWater;
    }
}
