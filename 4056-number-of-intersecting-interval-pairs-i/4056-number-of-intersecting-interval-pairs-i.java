class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (Math.min(intervals[i][1], intervals[j][1]) >= Math.max(intervals[i][0], intervals[j][0])) {
                    count++;
                }
            }
        }
        return count;
    }
}