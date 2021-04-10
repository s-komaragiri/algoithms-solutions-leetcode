/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/


class TwoSums {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = IntArray(2)
        var map = HashMap<Int,Int>()
        for(i in nums.indices){
            val remain = target - nums[i]
            if(map.containsKey(remain)){
                result[0] = map.get(remain)!!
                result[1] = i
                break;
            }
            map.put(nums[i],i)
        }
        return result
    }
}
