//fun whatToDo(dayOfWeek: String) = when (dayOfWeek) {
//    "Saturday" -> "Relax"
//    "Friday" -> "Party"
//    else -> "Work"
//}
//
//println(whatToDo("Saturday"));

//fun isAlive(alive: Boolean, neighbors: Int) = when {
//    neighbors < 2 -> false
//    neighbors > 3 -> false
//    neighbors == 3 -> true
//    else -> alive && neighbors == 2
//}
//
//println(isAlive(true, 1));
//println(isAlive(true, 3));
//println(isAlive(true, 2));


//fun whatToDo(dayOfWeek: String) {
//    when (dayOfWeek) {
//        "Saturday" -> println("Relax")
//        "Friday" -> println("Party")
//    }
//}
//
//whatToDo("Saturday") // Relax
//whatToDo("") //

fun getCoreNum(): Int {
    return 17
}

fun systemInfo(): String = when (val core = getCoreNum()) {
    1 -> "1 core"
    in 2..16 -> "$core cores"
    else -> "$core cores!"
}

systemInfo();