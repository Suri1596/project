/* Given a string name , write a match expression that will return the same string if
  nonempty, or else the string “n/a” if it is empty.*/


object Matchexp {
  def fun(str: String): String = {
    var x: String = str.length != 0 match {
      case true => str
      case false => "n/a"
    }
    x
  }
}
object Test extends App{
  println(Matchexp.fun("Surekha"))
  println(Matchexp.fun(""))

}

