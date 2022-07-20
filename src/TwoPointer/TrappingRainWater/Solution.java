package TwoPointer.TrappingRainWater;


/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.
 */
public class Solution {

    public static void main(String[] args) {

        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        //int nums[]={4,2,0,3,2,5};

        System.out.println(trap(height));

        System.out.println(trap2(height));

    }

    public static int trap2(int[] height) {
        //POINTS TO REMEMBER
        /*
        * Take two pointer LEFT AND RIGHT. LEFT =pointing to index 0 and Right pointing to index n
        * Take another two pointer maxLeft and maxRight and assign value as index of LEFT and RIGHT
        * Shift the LEFT and right which have smaller max value. if(maxLeft <=maxRight) shift LEFT++ else RIGHT++
        * If the above condition is true then we shifted the LEFT because maxLeft smaller than maxRight
        * So while calculating the water that can be stored at that point of time:
        * if we increase the left then water stored at that point is maxLeft-height[i]
        * else if we decrease Right then maxRight -height[i]
        * */


        int maxWater=0;
        int Left=0;
        int Right=height.length-1;

        int maxLeft=height[Left];
        int maxRight=height[Right];

        while(Left<Right)
        {
            if(maxLeft <=maxRight)
            {
                Left++;


                int water=(maxLeft-height[Left]);
                if(water>0)
                {
                    maxWater+=water;
                }
                if(maxLeft<height[Left])
                {
                    maxLeft=height[Left];
                }
            }
            else
            {
                Right--;

                int water=(maxRight-height[Right]);
                if(water>0)
                {
                    maxWater+=water;
                }

                if(maxRight<height[Right])
                {
                    maxRight=height[Right];
                }
            }
        }


        return maxWater;


        }

    public static int trap(int[] height) {


        //CALCULATE MAX HEIGHT TO LEFT
        //CALCULATE MAX HEIGHT FROM RIGHT
        //CALCULATE MIN (HEIGHT FROM ABOVE HEIGHTS)
        //SUBTRACT THE SAME WITH ORIFINAL HEIGHT

        int maxLeftHeight=0;
        int maxRightHeight=0;

        int maxLeft[]=new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            if(maxLeftHeight < height[i])
                maxLeftHeight=height[i];
            maxLeft[i]=maxLeftHeight;
        }

        int maxRight[]=new int[height.length];
        for(int i=height.length-1;i>=0;i--)
        {
            if(maxRightHeight < height[i])
                maxRightHeight=height[i];
            maxRight[i]=maxRightHeight;
        }

        int minHeight[]=new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            minHeight[i]=Math.min(maxLeft[i],maxRight[i]);
        }

        int maxWater=0;

        for(int i=0;i<height.length;i++)
        {
            int heightWaterCanBeStored = minHeight[i]-height[i];
            if(heightWaterCanBeStored > 0)
            {
                maxWater+=heightWaterCanBeStored;
            }
        }



        return maxWater;
    }
}
