package apr2023.apr17.assignment;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class ass_1Dcode1 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
//        int arr[]={3,20,4,6,9}; //output =16
        int arr[] = {4, 3, 6, 7, 1};//output=11
        while (i < arr.length) {
            sum += arr[i];
            i += 2;
        }
        System.out.println(sum);
    }

//        int sum=0;
//        int arr[] ={3,21,4,25,9};
//        for(int i=0;i<arr.length;i=i+2)
//        {
//            sum +=arr[i];
//        }
//        System.out.println(sum);
}
