package leetcodepractise.Arrays;

import java.util.Arrays;

public class removeElement {

    public static void main(String[] args)
    {
        int nums[]= {0,1,2,2,3,0,4,2};
        int val=2;

        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == val){
                nums[i]= -1;
            }
        }
        int k=0;
        int m=n-1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i] != -1){
                k++;
            }
            else{
                nums[i] = nums[m];
                m--;
            }
        }
        System.out.println(k);
    }
}
