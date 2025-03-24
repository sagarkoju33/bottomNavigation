fun main() {

    ///step is used with ranges and progressions to define a step size for iteration. It is commonly used with loops, especially for loops.
    for (i in 1..10 step 5) {
        println(i)
    }
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
//convert the List to a Sequence
    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)
// terminal operation: obtaining the result as a List
    println(lengthsSequence.toList())

    val numbers = listOf("one", "two", "three", "four", "five")

// Groups the strings by their first letter using groupBy()
    val groupedByFirstLetter = numbers.groupBy { it.first().uppercase() }
    println(groupedByFirstLetter)
}

