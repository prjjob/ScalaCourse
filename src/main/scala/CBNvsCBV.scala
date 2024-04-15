object CBNvsCBV extends App{
  def callByValue(num : Long) : Unit = {
    println("Call by value : ");
    println(num);
    println(num);
    println("-----------------")
  }

  def callByName(num : => Long) :Unit ={
    println("Call by name : ");
    println(num);
    println(num);
    println("-----------------")
  }


  callByValue(System.nanoTime());
  callByName(System.nanoTime());


}
