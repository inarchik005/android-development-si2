
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]

            if (seen.containsKey(complement)) {
                return intArrayOf(seen[complement]!!, i)
            }

            seen[nums[i]] = i
        }

        return intArrayOf()
    }
}
