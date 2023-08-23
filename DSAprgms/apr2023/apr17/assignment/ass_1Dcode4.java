package apr2023.apr17.assignment;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class ass_1Dcode4
{
    public static void main(String[] args)
    {

//        int arr[] ={34,21,54,65,43};
//        int max = 0;
//        int max2=0;
//        for (int i = 0; i < arr.length; i++)
//        {
//        if(arr[i] > max)
//            {
//                max = arr[i];
//            }
//        }
//        for (int j = 0; j < arr.length; j++)
//        {
//          if( arr[j] == max){
//             //System.out.println();
//          }
//          else if( arr[j]> max2){
//              max2=arr[j];
//          }
//        }
//       System.out.println(max2);
        int[] arr = { 34, 21, 54, 65, 43 };
        int arr_size = arr.length;
        int i,largest,second;
        if(arr_size<2)
        {
            System.out.println("Invalid Input");
            return;
        }
        largest = second=Integer.MIN_VALUE;
        for ( i = 0; i < arr_size; i++)
        {
            largest = Math.max(largest,arr[i]);
        }
        for ( i = 0; i < arr_size; i++)
        {
            if(arr[i] != largest)
                second = Math.max(second,arr[i]);
        }
        if(second == Integer.MIN_VALUE)
            System.out.println("their is no second largest element");
        else
            System.out.println("second largest element is : "+second);
    }
}


