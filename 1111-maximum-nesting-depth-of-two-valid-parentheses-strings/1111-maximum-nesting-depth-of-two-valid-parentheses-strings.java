class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[]=new int[seq.length()];
        int max=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                max++;
                arr[i]=max%2;
            }
            if(seq.charAt(i)==')'){
              
                arr[i]=max%2;
                  max--;
            }
        }
        return arr;
    }
}