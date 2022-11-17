package PracticePrograms;

import java.util.Scanner;

import java.util.Spliterator;

public class Sum_Of_3_Numbers_Nearing_Target_1 {
    public static int outputNum(int[] nums, int target) {
        int minDiff=0;
        int finalNum=0;
        int numsLength = nums.length;
        if (numsLength<3){
            return -1;
        }
        for (int i = 0; i < numsLength - 2; i++) {
            for (int j = i + 1; j < numsLength - 1; j++) {
                for (int k = j + 1; k < numsLength; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (i==0&&j==1&k==2){
                        minDiff=Math.abs(sum-target);
                        finalNum=sum;
                    } else{
                        int diff = Math.abs(sum - target);
                        if (diff<minDiff){
                            finalNum=sum;
                            minDiff=diff;
                        }
                    }
                }
            }
        }

        return finalNum;
    }

    public static void main(String[] args) {
        int[] nums = {-3,-4,-4,3};
        int target = -10;
        int sum=outputNum(nums,target);
        System.out.println("Sum: "+sum);
    }
}
