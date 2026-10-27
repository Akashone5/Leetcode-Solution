class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<Integer> st=new Stack<>();
     int arr[]=new int[temperatures.length];
     for(int i=0;i<temperatures.length;i++){
        while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
            int idx=st.pop();
            arr[idx]=i-idx;
        }
        st.push(i);
     }   
     return arr;
    }
}