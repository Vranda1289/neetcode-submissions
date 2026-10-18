class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int max=1;
        int len=1;

        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if (nums[i]-nums[i-1]==1){
                len++;
            }
            else{
                len=1;
            }
            max = Math.max(len,max);
        }
        return max;
    }
}