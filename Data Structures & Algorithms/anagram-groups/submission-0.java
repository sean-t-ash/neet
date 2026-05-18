class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> hm = new HashMap<>();
        for(String str : strs) {
            char[] carr = str.toCharArray();
            Arrays.sort(carr);
            String sortedS = new String(carr);
            hm.putIfAbsent(sortedS, new ArrayList<>());
            hm.get(sortedS).add(str);
        }
        return new ArrayList<>(hm.values());

    }
}
