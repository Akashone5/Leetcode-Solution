class Solution {
    public int hIndex(int[] citations) {
        int l=citations.length;
        for(int i=0;i<l;i++){
            if(citations[i]>=(l-i)){
                return l-i;
            }
        }
        return 0;
    }
}