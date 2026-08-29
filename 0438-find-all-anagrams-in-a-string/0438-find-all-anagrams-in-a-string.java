class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pCount[] = new int[26];
        int sCount[] = new int[26];
        ArrayList<Integer> res = new ArrayList<>();
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.equals(pCount, sCount)) {
                res.add(i - p.length() + 1); //len=high-low+1;
            }
        }
        return res;
    }
}