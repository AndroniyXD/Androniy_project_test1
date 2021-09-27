import java.lang.Math.pow

fun main() {
    println("Вас преветствует Console Calc ver.0.1.1")
    print("Введите первое число")
    var MOT = readLine()!!.toDouble()
    print("Введите второе число")
    var TOM = readLine()!!.toDouble()
    print("Выберете опирацию: ")
    var operation = readLine()
    when(operation)
    {
        "+" -> print("$MOT$operation$TOM=${MOT+TOM}")
        "-" -> print("$MOT$operation$TOM=${MOT-TOM}")
        "*" -> print("$MOT$operation$TOM=${MOT*TOM}")
        "/" -> print("$MOT$operation$TOM=${MOT/TOM}")
        "rt" -> print("$MOT$operation$TOM=${pow(MOT,1/TOM)}")
        "st" -> print("$MOT$operation$TOM=${pow(MOT,TOM)}")
        else -> print("Такой операции не предусмотрено!")
    }
}