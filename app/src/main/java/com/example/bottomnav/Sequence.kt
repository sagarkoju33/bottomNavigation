///In Kotlin, sequences (Sequence<T>) are a powerful way to handle large or potentially infinite collections efficiently by using lazy evaluation. Unlike regular collections (List, Set), which process elements eagerly, sequences process elements one-by-one as needed, which improves performance in certain scenarios.

fun main() {
//    // 1. Using sequenceOf
//    val seq = sequenceOf(1, 2, 3, 4, 5)
//    println(seq.toList())
//
//    // 2.converting a collection to a sequence
//    val list = listOf(1, 2, 3, 4, 5)
//    val seq1 = list.asSequence()
//    println(seq1.toList()) // Output: [1, 2, 3, 4, 5]
//
//    // 3. Using generateSequence (Infinite Sequences)
//    val infiniteSeq = generateSequence(1) { it + 1 }
//    println(infiniteSeq.take(5).toList()) // Output: [1, 2, 3, 4, 5]
//
//    // 4. Using sequence {} (Custom Sequences)
//    val customSeq = sequence {
//        yield(1)  // Emit a single value
//        yieldAll(listOf(2, 3, 4)) // Emit multiple values
//        yield(5)
//    }
//    println(customSeq.toList()) // Output: [1, 2, 3, 4, 5]

    /// When to Use Sequences?
    //✅ When dealing with large datasets to improve performance.
    //✅ When working with infinite sequences.
    //✅ When applying multiple transformations (e.g., map, filter) to avoid unnecessary intermediate


    val list1 = listOf(1, 2, 3, 4, 5, 6, 7)
    val res = list1.map { it * 2 }.filter { it > 5 }
    println(res)


}