class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int res=0;

        for(int i=0;i<nums.length;i++) {
            hs.add(nums[i]);
        }
        // 2 20 4 10 3 5

        for(int val : hs) {
            if(!hs.contains(val - 1)) {
                int count = 1;
                while(hs.contains(val + count)) {
                    count ++;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}


