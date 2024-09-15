package Solutions


final class chapter3$u002Eworksheet$_ {
def args = chapter3$u002Eworksheet_sc.args$
def scriptPath = """Solutions/chapter3.worksheet.sc"""
/*<script>*/
def excercise1(in: String): String = {
    in match {
        case "" => "n/a"
        case s => s
    }
}
excercise1("hello")
excercise1("")



def excercise2(d: Double): String = {
    d match {
        case gtZero if d > 0.0 => s"${gtZero} is greater than 0"
        case ltZero if d < 0.0 => s"${ltZero} is smaller than 0"
        case _ => "zero"
    }
}
excercise2(1.0)
excercise2(-1.0)
excercise2(0)

def excercise3(s: String): String = {
    s match  {
        case "magenta" => "00ff00"
        case _ => {
            println("ERROR: Invalid color!")
            "n/a"
        }
    }
}

excercise3("magenta")
excercise3("was das???")

def excercise4(): Unit = {
    for (i <- 1 to 100)  {
            i match {
                case a if a % 5 == 0 => println(s"$a")
                case b => printf(s"$b,")
            }
    }
}

excercise4()


def excercise5(): Unit = {
    for (i <- 1 to 100) {
        i match {
            case a if a % 3 == 0 && a % 5 == 0 => println("typesafe")
            case a if a %3 == 0 => println("type")
            case a if a %5 == 0 => println("safe")
            case a => println(s"$a")
        }
    }
}

excercise5()


/*</script>*/ /*<generated>*//*</generated>*/
}

object chapter3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new chapter3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export chapter3$u002Eworksheet_sc.script as `chapter3.worksheet`

