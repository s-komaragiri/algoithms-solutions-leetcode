/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            result[0] = i;
            int remain = target - nums[i];
            if(map.containsKey(remain) && map.get(remain)!=result[0]){
                result[1] = map.get(remain);
                break;
            }
        }
        return result;
    }
}
