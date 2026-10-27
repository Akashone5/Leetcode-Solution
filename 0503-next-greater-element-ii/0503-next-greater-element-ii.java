class Solution {
    public int[] nextGreaterElements(int[] nums) {
    int arr[]=new int[nums.length];
    int n=nums.length;
    Stack<Integer> s1=new Stack<>();
      for(int i=(nums.length*2)-1;i>=0;i--){
        while(!s1.isEmpty()&&s1.peek()<=nums[i%n]){
            s1.pop();
        }
        if(i<n){
            if(s1.isEmpty()){
                arr[i]=-1;
            }
            else arr[i]=s1.peek();
        }
        s1.push(nums[i%n]);
      }
      return arr;
    }
}