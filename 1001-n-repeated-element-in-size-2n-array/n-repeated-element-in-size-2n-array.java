class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val)==nums.length/2){
                return val;
            }
        }
        return -1;
    }
}