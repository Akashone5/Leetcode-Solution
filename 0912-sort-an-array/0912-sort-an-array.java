class Solution {
    public void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> a1=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(nums[left]<=nums[right]){
                a1.add(nums[left++]);
            }
            else a1.add(nums[right++]);
        }
        while(left<=mid){
            a1.add(nums[left++]);
        }
        while(right<=high){
            a1.add(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=a1.get(i-low);
        }}
    public void mergeSort(int[] nums, int low, int high) {
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
   

    public int[] sortArray(int[] nums) {
          int n = nums.length;
        int low=0;
        int high=n-1;
        mergeSort(nums, low, high);
return nums; 
   }
}