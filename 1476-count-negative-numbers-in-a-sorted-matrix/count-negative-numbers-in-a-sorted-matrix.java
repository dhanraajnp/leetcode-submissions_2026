class Solution {
    public int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int result=0;
        while(row<grid.length && col>=0){   //Binary search in 2D array row wise col wise sorted order
            if(grid[row][col]<0){
                result=result+grid.length-row;
                col--;
            }
            else
                row++;
        }
        return result;
    }
}