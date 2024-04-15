import scala.annotation.tailrec
import scala.jdk.Accumulator

object TailRecursionAssignment extends App {

  //--------------------------------- String concat N Times with

  def strConcatTimes(str : String, t : Int) : String= {
    @tailrec
    def stringConcatTailRec(s : String, times : Int, accumulator: String) : String = {
      if(times == 1) accumulator
      else stringConcatTailRec(s, times - 1, accumulator + s)
    }

    stringConcatTailRec(str, t, str);
  }

  val str : String = "Cherrisha I love you\n";
  println(strConcatTimes("Prashant", 5))


  //--------------------------------- isPrime with tail recursion

  def isPrime(n : Int): Boolean = {
    @tailrec
    def isPrimeTailRec(num: Int, isP: Boolean): Boolean = {
      if (isP == false) false
      else if (num <= 1) true
      else isPrimeTailRec(num - 1, n%num  != 0 && isP)
    }
    isPrimeTailRec(n/2, true);
  }

  println(isPrime(2003))
  println(isPrime(629))

  //-------------------------------- nTh Fibonacci with tail recursion

  def nthFib(n : Long) : Long = {

    @tailrec
    def nthFibTailRecursion(count : Long, toAdd:Long, accumulator : Long): Long = {
      if (count <= 2) accumulator
      else nthFibTailRecursion(count - 1, accumulator, accumulator + toAdd)
    }

    nthFibTailRecursion(n, 1, 1);
  }
  println(nthFib(31))


}
