package apr2023.apr17.assignment;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class ass_1Dcode3
{
    public static void main(String[] args) {
//        int arr[] ={34,21,54,65,43};//output=54
        int arr[] ={4,3,6,7,1};//output=6
        int max=Integer.MIN_VALUE;
        for (int val:arr)
        {
            max=Math.max(max,val);
        }
        System.out.println("Max value is : "+max);
//          int arr[] ={34,21,54,65,43};
//
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max)
//            {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
    }
}
