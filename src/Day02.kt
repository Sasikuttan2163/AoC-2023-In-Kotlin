fun main() {
    val colors = listOf("red", "green", "blue")
    val ballCount = listOf(12, 13, 14)
    fun part1(input: List<String>): Int {
        return input
            .map { line ->
                colors.fold (mutableListOf<Int>()) { initial, color ->
                    initial.apply {
                        add(
                            Regex("(\\d*) $color")
                                .findAll(line)
                                .maxOf { it.groupValues[1].toInt() }
                            )
                        }
                }
            }
            .withIndex()
            .filter { it.value[0] <= ballCount[0] && it.value[1] <= ballCount[1] && it.value[2] <= ballCount[2] }
            .sumOf { it.index + 1 }

    }

    fun part2(input: List<String>): Long {
        return input
            .map { line ->
                colors.fold (mutableListOf<Int>()) { initial, color ->
                    initial.apply {
                        add(
                            Regex("(\\d*) $color")
                                .findAll(line)
                                .maxOf { it.groupValues[1].toInt() }
                        )
                    }
                }
            }
            .sumOf {
                it.fold(1L) { power, b ->
                    power * b
                }
            }
    }

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
