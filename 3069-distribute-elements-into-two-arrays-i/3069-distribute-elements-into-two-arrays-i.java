class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
      ArrayList<Integer> arr1=new ArrayList<>();
      ArrayList<Integer> arr2=new ArrayList<>();
     // ArrayList<Integer> result=new ArrayList<>();
      arr1.add(nums[0]);
      arr2.add(nums[1]);
      for(int i=2;i<n;i=i+1){
      
      
      if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
        arr1.add(nums[i]);
      }
      else arr2.add(nums[i]);
      }
      int result[]=new int[n];
      int idx=0;
    for(int num: arr1){
        result[idx]=num;
        idx++;
    }
     for(int num: arr2){
        result[idx]=num;
        idx++;
    }

        return result;


    }
}