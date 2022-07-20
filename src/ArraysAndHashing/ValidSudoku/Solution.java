package ArraysAndHashing.ValidSudoku;

import java.util.HashSet;

public class Solution {


    public static void main(String[] args) {

       String testCase="[[\".\",\".\",\".\",\"9\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\"3\",\".\",\".\",\".\",\".\",\".\",\"1\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\"1\",\".\",\".\",\".\",\".\",\".\",\"3\",\".\",\".\"],[\".\",\".\",\".\",\".\",\"2\",\".\",\"6\",\".\",\".\"],[\".\",\"9\",\".\",\".\",\".\",\".\",\".\",\"7\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\"8\",\".\",\".\",\"8\",\".\",\".\",\".\",\".\",\".\"]]\n";
       testCase =testCase.replace("[","{");
        testCase=testCase.replaceAll("]","}");
        testCase=testCase.replaceAll("\"","\'");

        System.out.println(testCase);

        char[][] board ={{'.','.','.','9','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','3','.','.','.','.','.','1'},{'.','.','.','.','.','.','.','.','.'},{'1','.','.','.','.','.','3','.','.'},{'.','.','.','.','2','.','6','.','.'},{'.','9','.','.','.','.','.','7','.'},{'.','.','.','.','.','.','.','.','.'},{'8','.','.','8','.','.','.','.','.'}}
                ;

        for (int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println(isValidSudoku(board));


    }

    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> hashSet =new HashSet<>();

        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                if(board[row][col]!='.')
                {
                    //Check for rows
                    if(hashSet.add(board[row][col]+" rowCheck "+ row)==false)
                    {

                        return false;
                    }


                    //Check for cols
                    if(hashSet.add(board[row][col]+" colCheck "+col)==false) {


                        return false;
                    }

                    //Check for Box  box can be represent by row/3 and col/3
                    if(hashSet.add(board[row][col]+ " boxCheck "+row/3+"-"+col/3)==false)
                    {

                        return false;
                    }

                }
            }
        }

        return true;
    }
    //IF WE GO IN THIS APPROCH we see that we are checking the rows ,then cols then checkbox and checkbox takes O(n4) times.
    //So we will go in different approch of HashSet by putting uniqueEntries every time . For example if we put
    // "9 for row 1" -> this is unique String , Again if we encounter the same we will make it false

    /*public static boolean isValidSudoku(char[][] board) {

        //check for valid rows

        for(int i=0;i<board.length-1;i++)
        {
            String rowCheck="";
            for(int j=0;j<board[i].length-1;j++)
            {

                if(board[i][j]=='.')
                    continue;
                else
                {
                    if(rowCheck.contains(board[i][j]+""))
                    {
                        return false;
                    }
                    else
                    {
                        rowCheck+=" "+board[i][j];
                    }
                }
            }
        }


        //Check for columns
        for(int i=0;i<board.length-1;i++)
        {
            String colCheck="";
            for(int j=0;j<board[i].length-1;j++)
            {

                if(board[j][i]=='.')
                    continue;
                else
                {
                    if(colCheck.contains(board[j][i]+""))
                    {
                        return false;
                    }
                    else
                    {
                        colCheck+=" "+board[j][i];
                    }
                }
            }
        }


        //Check For Box


        for(int i=0;i<board.length-1;i+=3)
        {
            for(int j=0;j<board[i].length;j+=3)
            {
                String checkBox="";
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
//
                        if(board[k][l]=='.')
                            continue;
                        else
                        {
                            if(checkBox.contains(""+board[k][l]))
                                return false;
                            else
                                checkBox+=" "+board[k][l];
                        }
                    }

                }

            }

        }

        return true;
    }*/



}
