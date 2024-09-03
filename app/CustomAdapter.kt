fun main() {
    val x = 5
    var y = 10
    if (x < y) {
        println("x is less than y")
    }

    for (i in 0..10) {
        if (i % 2 == 0) {
            println(i)
        } else {
            println("Odd number: $i")
        }
    }

    val z: Int = 42
    when (z) {
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other")
    }
}

