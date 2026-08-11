class Solution {
    public int removeDuplicates(int[] nums) {
       int officer=0;
       int unique=1;
       int cm=1;
       while(nums.length>cm){
        if(nums[cm]==nums[cm-1]){
            cm++;
            continue;
        }
        else {
            nums[officer+1]=nums[cm];
            officer++;
            unique++;
            cm++;
        }

       }
     return unique;
    }
}