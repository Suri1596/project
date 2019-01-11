/*Print the numbers 1 to 100, with each line containing a group of five numbers. For
example:*/

object Loopexp1 extends App {
  for (i <- 1 to 100 by 5) {
      for (j <- i to (i + 4))
      { print(s"$j, ") }
    println("")
     }

}
