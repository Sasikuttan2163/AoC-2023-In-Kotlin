fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf {
            it.filter { ch -> ch.isDigit() }.run {
                (this.first().toString() + this.last()).toInt()
            }
        }
    }

    fun part2(input: List<String>): Int {
        val numMaps = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9, "zero" to 0)
        return input.size
    }

    val input = readInput("Day01")
    part1(input).println()
}
