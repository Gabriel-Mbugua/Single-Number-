fun main(){
    val solution = Solution()
    val nums = intArrayOf(3,3,2)
    solution.singleNumber(nums)
}

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var number = 0
        var numbers = nums.groupBy { it }.filter { it.value.size < 2 }
        numbers.forEach { t, u -> number = t }
        numbers
        println(number)
        return number
    }
}