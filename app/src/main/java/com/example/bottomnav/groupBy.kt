data class Person(val name: String, val age: Int)


//1.GroupBy

///In Kotlin, the groupBy function is used to group elements in a collection based on a given key selector function.
// It returns a Map where the keys are the results of the key selector function and the values are lists of elements that share the same key.


fun main() {
    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("Charlie", 25),
        Person("David", 30),
        Person("Eve", 35)
    )
    val groupedByAge = people.groupBy { it.age }
    println(groupedByAge)
    val numbers = listOf("one", "two", "three", "four", "five")

    // Groups the strings by their first letter using groupBy()
    val groupedByFirstLetter = numbers.groupBy { it.first().uppercase() }
    println(groupedByFirstLetter)

///  output
    ///{25=[Person(name=Alice, age=25), Person(name=Charlie, age=25)], 30=[Person(name=Bob, age=30), Person(name=David, age=30)], 35=[Person(name=Eve, age=35)]}
    ///// {O=[one], T=[two, three], F=[four, five]}

}

