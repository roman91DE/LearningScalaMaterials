def area(radius: Double): Double = {
  math.Pi * math.pow(radius, 2)
}

area(2)



def areaFromString(radius: String): Double = {
    if radius.isEmpty() then 0 else math.Pi * math.pow(radius.toDouble, 2)
}

areaFromString("2.0")

final def printBy5s(): Unit = {
    @scala.annotation.tailrec
    def loop(cur: Int, max: Int = 50): Unit = {
        def innerLoop(n: Int): Unit = {
            val group = (n to n+4).toList
            group.foreach(s => printf(s"$s "))
            println()
        }
        cur match {
            case num if num < max => {
                innerLoop(num)
                loop(num+5)
            }
            case _  => ()
        }
    }
    loop(5)
}

printBy5s()





/*
5) Write a function that calculates the first value raised to the exponent of the second value. 
Try writing this first using +math.pow+, then with your own calculation. Did you implement it with variables? 
Is there a solution available that only uses immutable data? 
Did you choose a numeric type that is large enough for your uses?
*/

def stdlibPow(base: Double, exp: Double): Double = math.pow(base, exp)

val res = stdlibPow(2.0, 4.0)

final def recPow(base: Int, exp: Int): Int = {
    require(exp > 0, "exponent must be positive")
    @scala.annotation.tailrec
    def reduce(base: Int, exp: Int, acc: Int): Int = {
        exp match {
            case 0 => 1
            case 1 => acc
            case _ => reduce(base, exp-1, acc * base)
        }
    }
    reduce(base, exp, base)
}


recPow(2,4)




