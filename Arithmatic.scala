


object Arth {


  def sum(list: List[Int]): Int = {
    var s: Int = 0
    for (i <- list) {
      s = s + i
    }
    s
  }

  def max(list: List[Int]): Int = {
    var m: Int = 0
    for (i <- list) {
      if (m <= i)
        m = i
    }
    m
  }
}

object TestArth extends App{


  println(Arth.sum(List(1,2,3,3,4,4)))
  println(Arth.max(List(1,2,3,3,4,4)))






}
