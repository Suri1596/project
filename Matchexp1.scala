/*Given a double amount , write an expression to return “greater” if it is more than
zero, “same” if it equals zero, and “less” if it is less than zero. Can you write this with
if..else blocks? How about with match expressions?*/

object Matchexp1{
  def fun(amt:Double)={
   var x:String =amt match {
      case x if x > 0 => "greater"
        case x if x < 0 => "lesser"
        case x => "same"
       }
  x}
}
object Test1 extends App{
  println(Matchexp1.fun(5.0))
  println(Matchexp1.fun(0.0))
  println(Matchexp1.fun(-1.0))
}