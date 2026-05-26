class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //map<String,List<String>>
        //key = sorted string
        // for each string, sort and check isAnagram
        // if anagram then add to value list
        // convert map into array of arrays

        Map<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            char[] carr = strs[i].toCharArray();
            Arrays.sort(carr);
            String s = new String(carr);
            hm.putIfAbsent(s, new ArrayList<>());
            hm.get(s).add(strs[i]);
        }
        return new ArrayList<>(hm.values());

    }
}
