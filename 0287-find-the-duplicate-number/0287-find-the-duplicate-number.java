class Solution {
    public int findDuplicate(int[] nums) {
      int slow=0;
     int fast=0;
      for(int i=0;i<nums.length;i++){
        slow=nums[slow];
        fast=nums[fast];
        fast=nums[fast];
        if(slow==fast){
            slow=0;
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
            return slow;
        }
      }
    return -1;
    }
}