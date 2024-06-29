class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count =0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            else if(nums[i]!=0){
                if(count>0){
                    temp = nums[i];
                    nums[i]=0;
                    nums[i - count]=temp;

                }
            }
        }
    }
}
