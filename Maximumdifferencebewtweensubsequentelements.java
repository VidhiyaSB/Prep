class Solution {
    public int maximumGap(int[] nums) {
    int max = 0;
    if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int first = nums[0];
        int second = nums[1];
        for(int i=1;i<nums.length;i++){
                if(nums[i]-nums[i-1]>max){
                        max = nums[i] - nums[i-1];
                }
             }
        return max;
    }
}
