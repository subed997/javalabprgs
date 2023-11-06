package leetcodepractise.Arrays;

import java.util.Arrays;

public class hIndex
{
    public static void main(String[] args)
    {
        int[] citations={3,0,6,1,5};
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++)
        {
            if(citations[i]>=n-i){
                System.out.println(n-i);
            break;}
        }
        System.out.println();
    }
}
