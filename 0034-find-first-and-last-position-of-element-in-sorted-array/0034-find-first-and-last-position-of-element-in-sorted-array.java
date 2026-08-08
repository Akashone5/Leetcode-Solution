class Solution {

    public int[] searchRange(int[] nums, int target) {
                int arr[]=new int[2];
            arr[0]=-1;
            arr[1]=-1;
        if(nums.length<1){
           return arr;
        }
      int low=0;
      int high=nums.length-1;
      int mid=-1;
      int midd=-1;
      while(low<=high){
      mid=low+(high-low)/2;
        if(nums[mid]==target){
             midd=mid;
            break;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else if(nums[mid]>target){
            high=mid-1;
        }
      }
      if(midd==-1){
        return arr;
      }
      //left
      int low1=0;
      int high1=midd;
      
      while(low1<=high1){
      int  mid1=low1+(high1-low1)/2;
        if(nums[mid1]==target){
            arr[0]=mid1;
           high1=mid1-1;
        }
        else if(nums[mid1]<target){
            low1=mid1+1;
        }
        else if(nums[mid1]>target){
            high=mid1-1;
        }
      }
      
      //right
      int low2=midd;
      int high2=nums.length-1;
      while(low2<=high2){
       int mid2=low2+(high2-low2)/2;
        if(nums[mid2]==target){
            arr[1]=mid2;
            low2=mid2+1;
           
        }
        else if(nums[mid2]<target){
            low2=mid2+1;
        }
        else if(nums[mid2]>target){
            high2=mid2-1;
        }
      }
    
      return arr;
    }
}