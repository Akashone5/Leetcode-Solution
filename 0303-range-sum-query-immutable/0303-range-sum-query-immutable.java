class NumArray {
int[] numss;
    public NumArray(int[] nums) {
        numss=nums;
        for(int i=1;i<numss.length;i++){
            numss[i]+=numss[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return numss[right];
        }
        else return numss[right]-numss[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */