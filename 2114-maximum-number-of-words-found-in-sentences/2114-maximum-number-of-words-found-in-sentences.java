class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++){
            int inCount=1;
            for(int j=0;j<sentences[i].length();j++){
            if(sentences[i].charAt(j)==' '){
                inCount++;
            }
        }
        count=Math.max(inCount,count);
        }
        return count;
    }
}