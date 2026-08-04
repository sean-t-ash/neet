class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            char[] c1 = strs[i].toCharArray();
            Arrays.sort(c1);
            String sorted = new String(c1);
            List<String> ls = new ArrayList<>();;
            if(hm.containsKey(sorted)) {
                ls = hm.get(sorted);
            }
            ls.add(strs[i]);
            hm.put(sorted, ls);
        }

        for (String key : hm.keySet()) {
            res.add(hm.get(key));
        }
        return res;
    }
}
