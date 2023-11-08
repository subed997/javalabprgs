package may2023.may5;
// Search in 2D matrix leetcode top150 BINARY SEARCH
public class matrix2DSearch
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        //for rows
        int m = matrix.length;
        if(m==0)
        {
            return false;
        }
        //for columns
        int n= matrix[0].length;
        // binary Search algorithm
        int low=0,high=m*n-1;
        int midIdx,midElement;
        while(low <= high)
        {
            midIdx= low+(high-low)/2;
            midElement =matrix[midIdx/n][midIdx%n];
            if(target == midElement)
            {
                return true;
            }
            else
            {
                if(target < midElement)
                {
                    high= midIdx-1;
                }
                else
                {
                    low = midIdx+1;
                }
            }
        }
        return false;
    }
}
