//fun greet(name: String, msg: String = "Hello ${name.length.toString()}") = "$msg $name"
//fun max(vararg numbers: Int) = numbers.max()
fun getFullName() = Triple("John", "Quincy", "Adams")

fun main(args: Array<String>){
    val (first, _, last) = getFullName() // 값 추출
    println("$first $last") // John Quicy Adams 출력
}
