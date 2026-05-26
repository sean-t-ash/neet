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
            hm.putIfAbsent(arrToString(carr), new ArrayList<>());
        }

        for(int i=0;i<strs.length;i++) {
            char[] carr = strs[i].toCharArray();
            Arrays.sort(carr);
            String s = arrToString(carr);
            hm.get(s).add(strs[i]);
        }
        List<List<String>> res = new ArrayList<>();
        for(String k : hm.keySet()) {
            res.add(hm.get(k));
        }
        return res;

    }

    private static String arrToString(char[] carr) {
        StringBuilder sb = new StringBuilder();
        for(char c:carr) {
            sb.append(c);
        }
        return sb.toString();
    }
}
