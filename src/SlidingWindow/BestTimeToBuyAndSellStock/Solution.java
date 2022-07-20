package SlidingWindow.BestTimeToBuyAndSellStock;


import javax.swing.*;

public class Solution {

    public static void main(String[] args) {

        int prices[]={7,1,5,3,6,4};

        //System.out.println(maxProfit1(prices));
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        //2 Pointer Approach

        int maxProfit=0;
        int Left=0;
        int Right=Left+1;

        while(Left< Right)
        {
            System.out.println("Left Now="+Left+" Right Now="+Right);
            if(Left < prices.length && Right < prices.length)
            {
                if(prices[Right] < prices[Left])
                {
                    Left=Right;

                }
                else
                {
                    int profit=prices[Right]-prices[Left];


                    System.out.println(profit);
                    if(maxProfit<profit)
                        maxProfit=profit;

                }
                Right++;

            }
            else
            {
                break;
            }

        }

        return maxProfit;

    }
    public static int maxProfit1(int[] prices) {
        //Brute Force Approch
        int maxProfit=0;
        for(int i = 0; i<prices.length; i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                int profit=prices[j]-prices[i];
                if(profit>0)
                {
                    if(maxProfit<profit)
                    {
                        maxProfit=profit;
                    }
                }
            }

        }
        return maxProfit;
    }

}
