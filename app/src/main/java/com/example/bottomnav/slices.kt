// 1. Slicing
///In Kotlin, slicing refers to extracting a subset of elements from a collection (such as a List, Array, or String)
fun main() {
    val numbers = listOf(10, 20, 30, 40, 50, 60)

    // Extracting elements at specific indices
    val slicedList = numbers.slice(listOf(1, 3, 4)) // Indices 1, 3, and 4

    println(slicedList) // Output: [20, 40, 50]


    val arr = arrayOf("A", "B", "C", "D", "E")

    val slicedArray = arr.slice(1..3) // Extracting elements from index 1 to 3

    println(slicedArray) // Output: [B, C, D]

    val numbers1 = listOf(10, 20, 30, 40, 50, 60)

    val subList = numbers1.subList(1, 4) // Extracts elements from index 1 to 3

    println(subList) // Output: [20, 30, 40]

    val text = "KotlinProgramming"

    val slicedText = text.slice(0..5) // Extracting characters from index 0 to 5

    println(slicedText) // Output: Kotlin

    val numbers2 = listOf(1, 2, 3, 4, 5, 6)

    println(numbers2.take(3)) // Output: [1, 2, 3]
    println(numbers2.drop(3)) // Output: [4, 5, 6]
    println(numbers2.takeLast(2)) // Output: [5, 6]
    println(numbers2.dropLast(2)) // Output: [1, 2, 3, 4]
}
