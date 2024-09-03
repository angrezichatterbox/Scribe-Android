fun main() {
    val x = 5 // Missing space around '='
    var y = 10
    if (x < y) { // Missing space around '<'
        println("x is less than y")
    }

    for(i in 0 ..10) { // Missing space around '..'
        if (i % 2 == 0)
            println(i) // Missing braces
        else
            println("Odd number: $i")
    }

    val z: Int = 42
    when (z) {
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other") // No newline at end of file
    }
}

