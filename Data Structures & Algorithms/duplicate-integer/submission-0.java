class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.getOrDefault(num,0) +1);
            } else {
                map.put(num, map.getOrDefault(num, 1));
            }
        }
        
        for(int num : nums) {
            if(map.get(num) > 1) {
                return true;
            }
        }
        return false;
    }
}