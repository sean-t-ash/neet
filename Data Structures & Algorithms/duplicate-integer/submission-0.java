class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            if(!hs.contains(nums[i])) {
                hs.add(nums[i]);
            }
        }
        System.out.println(hs.size());
        System.out.println(nums.length);
        return (hs.size()!=nums.length);
    }
}