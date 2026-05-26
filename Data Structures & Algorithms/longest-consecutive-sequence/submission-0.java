class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int res = 1;
        int temp = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == (nums[i-1]+1)) {
                temp++;
                res = Math.max(res, temp);
            } else {
                temp = 1;
            }
        }
        return res;

    }
}
