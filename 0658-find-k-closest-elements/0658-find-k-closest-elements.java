class Solution {
    public static int bs(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else high=mid-1;
        }
        return low >= arr.length ? arr.length - 1 : low;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> all=new ArrayList<>();
        int high=bs(arr,x);
        int idx=high-1;
        while(k>0&&idx>=0&&high<arr.length){
            if(Math.abs(arr[idx]-x)<=Math.abs(arr[high]-x)){
                all.add(arr[idx--]);
            }
            else all.add(arr[high++]);
            k--;
        }
        while(k>0&&high<arr.length){
            all.add(arr[high++]);
            k--;
        }
        while(k>0&&idx>=0){
            all.add(arr[idx--]);
            k--;
        }
        Collections.sort(all);
        return all;
    }
}