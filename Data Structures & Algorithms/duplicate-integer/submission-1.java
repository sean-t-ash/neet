class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> hs = new HashSet<>();
        for(int n : nums) {
            hs.add(n);
        }
        return hs.size() != nums.length;
        
    }
}