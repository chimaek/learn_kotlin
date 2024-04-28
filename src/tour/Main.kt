package tour

//const val name: String = "Kotlin"

fun main(args: Array<String>) {
//    println(args)
//    val name = "MaxMan"
//    val age = 20
//    println("$name is $age years old.")
//    basicList()
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    print(greenNumbers.count() + redNumbers.count())
}

fun basicType() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

fun basicList() {
    val readyOnlyList = listOf("정사각형", "삼각형", "원")
    val mutableList = mutableListOf("정사각형", "삼각형", "원")
    mutableList.add(1, "사다리꼴")
    println(mutableList)
    println("리스트의 갯수는 ${mutableList.size} 입니다.")
    println("리스트의 첫번째 원소는 ${mutableList[0]} 입니다.")
    println("리스트의 마지막 원소는 ${readyOnlyList.count()} 입니다.")
}

fun basicSet() {
    val set = setOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet.add(4)
    mutableSet.remove(2)
    println(mutableSet)
}

fun basicMap() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val mutableMap = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val genericMap = mutableMapOf<String, Int>()
    genericMap["d"] = 4
    genericMap["e"] = 5
    println(genericMap)

}