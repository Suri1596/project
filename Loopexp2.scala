/*Can you rewrite the answer to exercise 5 to fit on one line? It probably won’t be
easier to read, but reducing code to its shortest form is an art, and a good exercise
to learn the language.*/
object Loopexp2 extends App {
  for (i <- 1 to 100) { var s = ""; if (i%3==0) s="type"; if (i%5==0) s+="safe"; if(s.isEmpty) s += i; println(s) }


}
