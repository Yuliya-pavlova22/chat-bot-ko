

/* import kotlin.math.abs
//определяем  ход конем
fun main() {

    var (x1, y1) = readLine()!!.split(" ").map { el -> el.toInt() }
    var (x2, y2) = readLine()!!.split(" ").map { el -> el.toInt() }

    val dx = abs(x1 - x2)
    val dy = abs(y1 - y2)

    println(if (dx == 2 && dy == 1 || dx == 1 && dy == 2) "YES" else "NO")
}
//Определяем треугольник по динам трех сторон
fun main (){
    val x = readln()!!.toInt()
    val y = readln()!!.toInt()
    val z = readln()!!.toInt()
   println(if (x + y > z && x + z > y && y + z > x) "YES" else "NO" )
}
//определяем количество оценок
fun main() {
    val count = readln()!!.toInt()
    var countD = 0
    var countC = 0
    var countB = 0
    var countA = 0
    repeat(count) {
        var rez = readln().toInt()
        if (rez == 2) countD++
        if (rez == 3) countC++
        if (rez == 4) countB++
        if (rez == 5) countA++
    }
    println("$countD $countC $countB $countA")
}
//программа вычисляет максисмум из чисел которые деляться на 4
fun main() {
    val count = readln().toInt()
    var max = 0
    repeat(count) {
        val num = readln().toInt()
        if (num > max && num % 4 ==0 ) max = num
    }
    println(max)
}
fun main() {
    val count = readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(count) {
        val x = readln().toInt()
        if (x == 0) perfect++ else
            if (x > 0) larger++ else smaller++
    }
    println("$larger $perfect $smaller")
}
fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val num4 = readln().toInt()
    val num5 = readln().toInt()
    println(num5 in num1..num2 || num5 in num3..num4)
}
fun main() {
    // write your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val num4 = readln().toInt()
    val num5 = readln().toInt()
    println(num5 in num1..num2 || num5 in num3..num4)
}
fun main() {
    // write your code here
    val firstRange: IntRange = readln().toInt()..readln().toInt()
    val secondRange: IntRange = readln().toInt()..readln().toInt()
    val number: Int = readln().toInt()

    println(number in firstRange || number in secondRange)
}
fun main() {
    val x = readln().toInt()
    val y = readln().toInt()

    for (i in x..y) {
        if (i % 3 !== 0 && i % 5 !== 0) println(i)
        else if (i % 3 == 0 && i % 5 !== 0) println("Fizz")
        else  if (i % 3 !== 0 && i % 5 == 0)println("Buzz") else println("FizzBuzz")
    }
}
fun main() {
    val x = readln().toInt()
    val y = readln().toInt()

    for (i in x..y) {
        var s = ""
        if (i % 3 == 0) s = "Fizz"
        if (i % 5 == 0) s += "Buzz"
        if (s == "") s = i.toString()
        println(s)
    }
}
fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    var sum = 0
    for (i in x..y) {
        sum += i
    }
    println(sum)
}
//решение уравнения
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    for (i in 1..1000) {
        if (a * i * i * i +b * i * i + c * i +d == 0) println(i)
    }
}
fun main() {
    val count = readln().toInt()
    var min = 100
    for (i in 1..count) {
        val x = readln().toInt()
        if (x < min) min = x
    }
    println(min)

}var myInt: Int = readln().toInt()
    var sum: Int = 0
    while (myInt !== 0) {
        sum += myInt
        myInt = readln().toInt()
    }
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var count = 0
    for (i in a..b) {
        if (i % n == 0) count++
    }
    println(count)
}
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()

    println((a..b).filter { it % n == 0 }.size)
}
fun main() {
    val count = readln().toInt()
    var sum = 0
    for (i in 1..count) {
        val x = readln().toInt()
        sum += x
    }
    println(sum)
}
fun main() {
    val count = readln().toInt()
    val numbers = MutableList(count) { readln().toInt() }

    var sum = 0
    for (i in 0..numbers.lastIndex) {
        sum += numbers[i]
    }

    print(sum)
}
const val  SIZE = 2
fun main() {
    val (x, y) = MutableList(SIZE) { readln().toInt() }
    var prod: Long = 1
    for (i in x until y) {
        prod *= i
    }
    println(prod)

}
fun main() {
    val count = readln().toInt()
    var sort: Boolean = true
    val numbers = MutableList(count) { readln().toInt() }
    for (i in 0 until numbers.lastIndex) {
        if (numbers[i] > numbers[i + 1]) sort = false
    }
    if (sort == true) println("YES") else println("NO")
}
fun main() {
    val count = readln().toInt()
    if (count < 1) {
        println("NO SOLUTION")
        return
    }
    val numbers = MutableList(count) { readln().toInt() }

    if (count == 1) {
        println(numbers[0])
        return
    }

    var rezult = 1

    for (i in 0..numbers.lastIndex) {
        for (j in i + 1..numbers.lastIndex) {
            if (numbers[i] * numbers[j] > rezult) rezult = numbers[i] * numbers[j]
        }
    }

    println(rezult)
}
fun main() {
    val numbersCount = readLine()!!.toInt()
    val numbers = MutableList(numbersCount) { readln().toInt() }
    var maxNum = 0
    var countNum = 0
    var maxCountNum = 0
    for (i in 0..numbers.lastIndex) {
        if  (numbers[i] >=  maxNum) {
            maxNum = numbers[i]
            countNum++
            print(maxNum)
        } else { maxNum = numbers[i]
        if (countNum > maxCountNum) {
            maxCountNum = countNum
            countNum = 1
        }
        print(" ")
        if (countNum == 1) {
            print(numbers[i])
        }        }


    }
    println()
    println(maxCountNum)

}
fun main() {
    val numbersCount = readLine()!!.toInt()
    val numbers = MutableList(numbersCount) { readln().toInt() }
    var maxNum = 0
    var countNum = 0
    var maxCountNum = 0
    for (i in 0..numbers.lastIndex) {
        if  (numbers[i] >=  maxNum) {
            maxNum = numbers[i]
            countNum++
        } else {
            maxNum = numbers[i]

            countNum = 1

        }
        if (countNum >= maxCountNum) {
            maxCountNum = countNum
        }
    }
    println(maxCountNum)
}
fun main() {

    /*println("Hello! My name is Aid.")
   println("I was created in 2020.")
   println("Please, remind me your name.")

   val name = scanner.nextLine()

   println("What a great name you have, " + name + "!")
   println("Let me guess your age.")
   println("Enter remainders of dividing your age by 3, 5 and 7.")

   val rem3 = scanner.nextInt()
   val rem5 = scanner.nextInt()
   val rem7 = scanner.nextInt()
   val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

   println("Your age is " + age + "; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    // read a number and count to it here
    val myNumber = scanner.nextInt()
    for (i in 1..myNumber) {
        println(i)
    }

    println("Completed, have a nice day!")
}

fun isRightEquation(x: Int, y: Int, z:Int): Boolean = x + y == z
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}

fun isGreater(num1: Int, num2: Int, num3: Int, num4: Int): Boolean = num1 + num2 > num3 + num4

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}

fun square(number: Int) = number * number
fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}

fun getLastDigit(number: Int): Int {
    return kotlin.math.abs(number % 10)
}
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

fun isVowel(letterMy: Char): Boolean {
    val myList = listOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
    return myList.any { it  == letterMy }
}
fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}

fun isVowel(ch: Char): Boolean {
    val vowel = mutableListOf<Char>('a', 'e', 'i', 'o', 'u')
    if (ch.lowercaseChar() in vowel) {
        return true
    } else {
        return false
    }
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
fun divide(x: Long, y: Long) : Float {
    return x.toFloat() / y.toFloat()
}
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var count = 0
    var next = 0
    do {
        val next = scanner.next().toInt()
        count++
    }
    while (next != 0)
    println(count-1)
}

fun main() {
    var myInt: Int = readln().toInt()
    var myCount: Int = 0
    while (myInt !== 0) {
        myCount++
        myInt = readln().toInt()
    }
    println(myCount)
}
fun main() {
    var myInt: Int = readln().toInt()
    var sum: Int = 0
    while (myInt !== 0) {
        sum += myInt
        myInt = readln().toInt()
    }
    println(sum)

fun main() {
    var myInt: Int = readln().toInt()
    var max: Int = 0
    while (myInt !== 0) {
        if (myInt > max) max = myInt
        myInt = readln().toInt()
    }
    println(max)
}}
fun main() {
    var myInt: Int = readln().toInt()
    var i = 1
    var countI = 0
    while (countI < myInt) {
        repeat(i) {
            countI++
            print("$i ")
            if (countI == myInt) return
        }
        i++
    }
    println(countI)
}
fun main() {
    var myInt: Int = readln().toInt()
    var i = 0
    var squar =  1
    while (squar <= myInt) {
        i++
        squar = i * i
        if (squar > myInt) return
        println(squar)
    }
}
fun main() {
    val num = readln().toInt()
    var i = 1
    while (num >= i * i) {
        println(i * i)
        i++
    }
}
fun main() {
    var num = readln().toInt()
    while (num >= 1) {
        if ( num == 1) {
            print(1)
            return
        }
        print("$num ")
        if (num % 2 == 0) {
            num /= 2
        } else num = num * 3 + 1
    }
}
fun main() {
    val scanner = Scanner(System.`in`)
    var myMax = Int.MIN_VALUE
    var maxNum = 1
    var i = 0
    while (scanner.hasNextInt()) {
        val next = scanner.next()
        i++
        if (next.toInt() > myMax) {
            myMax = next.toInt()
            maxNum = i
        }
    }
    print("$myMax $maxNum")
}

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var payment = 1

    while (scanner.hasNextInt()) {
        payment = scanner.next().toInt()
        balance = balance - payment
    }
    if (balance > 0) print("Thank you for choosing us to manage your account! Your balance is $balance.")
    if (balance == 0) print("Thank you for choosing us to manage your account! Your balance is 0.")
    if (balance < 0 ) print("Error, insufficient funds for the purchase. Your balance is ${balance + payment} , but you need $payment.")
}
//проверка наличия баланса rtgrt
fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        //
        val need = scanner.nextInt()

        if (balance < need) {
            print("Error, insufficient funds for the purchase. Your balance is $balance, but you need $need.")
            break
        } else if (scanner.hasNextInt() === false) {
            balance = balance - need
            print("Thank you for choosing us to manage your account! Your balance is $balance.")
        } else {
            balance = balance - need
        }
    }
}

import java.util.Scanner

val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Aid", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    test()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    do {
        val res = scanner.nextInt()
        if (res == 2)
            end()
        else
            println("Please, try again")
    } while (res != 2)
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    val correct = 2
    var indicator = false
    while (!indicator) {
        val answer = scanner.nextInt()
        if (answer == correct) {
            indicator = true
        } else {
            println("Please, try again.")
        }
    }
}*/*/