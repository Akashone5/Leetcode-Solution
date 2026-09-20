class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n=intervals.length;
        int ar1[]=new int[n];
        int ar2[]=new int[n];
        for(int i=0;i<n;i++){
            ar1[i]=intervals[i][0];
            ar2[i]=intervals[i][1];
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int j=0;
        long ans=0;
        for(int i=0;i<n;i++){
        while(j<n&& ar2[j]<ar1[i]){
            j++;
        }
            ans+=i-j;
        }
        return ans;
    }
}