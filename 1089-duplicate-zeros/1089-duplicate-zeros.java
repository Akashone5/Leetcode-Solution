class Solution {
    public void duplicateZeros(int[] arr) {
       ArrayList<Integer> ar=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        ar.add(arr[i]);
       }
       for(int i=0;i<arr.length;i++){
        if(ar.get(i)==0){
            ar.add(i+1,0);
            i++;
        }
       }
      // int arr1[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
            arr[i]=ar.get(i);
       }
      // return arr;   due to void it want nothing type but arr is int[]

       
    }
}