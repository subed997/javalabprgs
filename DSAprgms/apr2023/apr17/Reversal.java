package apr2023.apr17;
// Time Complexity : O(n)
//Space Complexity : O(1)
public class Reversal
{
    public static void main(String[] args)
    {
        int array[] ={1,3,5,8,10};
        int n = array.length;
        for (int i = 0; i < n/2; i++)
        {
            //swap the elements between array[i] and array[n-i-1]
            int temp = array[i];
            array[i] =array[n-i-1];
            array[n-i-1]=temp;
        }
        System.out.println("Reversal of an array is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
