class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1=-1;
        int index2=-1;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(target-nums[i])) {
                index1 = hm.get(target-nums[i]);
                index2 = i;
                break;
            }
            hm.put(nums[i],i);
        }
        
        int[] res = {index1, index2};
        return res;
    }
}
