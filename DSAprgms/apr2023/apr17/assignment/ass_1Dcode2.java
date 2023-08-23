package apr2023.apr17.assignment;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class ass_1Dcode2
{
    public static void main(String[] args)
    {
//        int arr[] = {34,21,54,65,43}; //output=34 54
        int arr[]= {4,3,6,7,1};//output=4 6
        for (int elem:arr)
        {
            if(elem %2 == 0)
                System.out.println(elem);
        }
    }
}
