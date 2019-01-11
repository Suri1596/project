/*Write an expression to convert one of the input values cyan , magenta , yellow to
their six-char hexadecimal equivalents in string form. What can you do to handle
error conditions?*/

object Matchexp2 {
  def fun(str:String)={
    str match{
      case "cyan" => "00ffff"
      case "magenta" => "00ff00"
      case "yellow" => "ffff00"
      case other=> {
           println(s"Didn't expect $other !")

        }
       }
  }

}

object Test2 extends App{
  val input = scala.io.StdIn.readLine()
  println(Matchexp2.fun(input))
}