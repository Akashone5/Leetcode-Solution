class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        if(n==0) return 0;
        if(n==1) return 1;
        int p=0;
        for(int i=0;i<n;i++){
              HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++){
               set.add(nums.get(j));
               p+=set.size()*set.size();
        }
        }
        return p;
    }
}