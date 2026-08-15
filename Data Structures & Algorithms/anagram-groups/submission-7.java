class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

         for(int i=0;i<strs.length;i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            hm.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);
         }
         return new ArrayList(hm.values());
    }
}
