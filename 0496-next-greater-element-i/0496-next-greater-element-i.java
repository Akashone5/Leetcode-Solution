class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int arr[]=new int[nums1.length];
      Deque<Integer> st=new ArrayDeque<>();
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=nums2.length-1;i>=0;i--){
        int num=nums2[i];
        while(!st.isEmpty()&&st.peek()<=nums2[i]){
            st.pop();
        }
        if(!st.isEmpty()){
           map.put(num,st.peek());
        }
        else{
            map.put(num,-1);
            }
        st.push(num);
      }
      for(int i=0;i<nums1.length;i++){
        arr[i]=map.getOrDefault(nums1[i],-1);
      }
      return arr;
    }
}