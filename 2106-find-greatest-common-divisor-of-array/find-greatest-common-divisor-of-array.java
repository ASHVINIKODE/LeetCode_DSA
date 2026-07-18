class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
       for(int num:nums){
        if(max<num){
            max=num;
        }
        if(min>num){
            min=num;
        }
       }
       
       while(max%min!=0){
          int rem= max%min;
          max=min;
          min=rem;
       } 
       return min;
       }
}
