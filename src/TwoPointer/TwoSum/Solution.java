package TwoPointer.TwoSum;

//TWO SUM WHERE THE INPUT ARRAY IS SORTED
public class Solution {

    public static void main(String[] args) {

        int numbers[]={2,7,11,15};
        int target=9;

        int twoSumResult[]=twoSum(numbers,target);
        System.out.println("["+twoSumResult[0]+","+twoSumResult[1]+"]");
    }
    public static int[] twoSum(int[] numbers, int target) {

        int result[]=new int[2];

        int i=0;
        int j=numbers.length-1;


        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }


        return result;
    }
}
