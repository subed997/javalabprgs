package apr2023.apr17.assignment;

public class ass_1Dcode5
{
    public static void main(String[] args)
    {
        int arr[] ={1,4,7,3,2,6,5};
//        int arr[] = {1,3,2,6,5};
        for (int i = 1; i < arr.length-1; i++)
        {
            if(arr[i-1]<arr[i]&& arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
