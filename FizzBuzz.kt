
class Solution {
    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map { num ->
            when {
                num % 15 == 0 -> "FizzBuzz"
                num % 3 == 0 -> "Fizz"
                num % 5 == 0 -> "Buzz"
                else -> num.toString()
            }
        }
    }
}
