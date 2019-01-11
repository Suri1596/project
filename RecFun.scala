object RecFun extends App {
  def pow(x:Int,n:Int):Long={
    if(n>=1) x*pow(x,n-1)
    else 1
  }
  println("Enter two numbers:")
  val input1 = scala.io.StdIn.readInt()
  val input2 = scala.io.StdIn.readInt()
 println( pow(input1,input2))
  //print(pow(2,2))
}
