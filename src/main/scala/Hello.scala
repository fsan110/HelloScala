object Hello {
  def main(args: Array[String]) = {
    // Scala does not require semi-colons !
    println("Hello, world")
    // Using the calculator cube function
    val a : Int = 3
    val cube3 : Int = Calculator.cube(a)
    println("Cube of " + a.toString + " is " + cube3.toString )



  }
}

