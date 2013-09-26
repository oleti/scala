package example

object currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def arithmetic(operation : (Int,Int) => Int, base:Int)(f:Int => Int)(a:Int, b:Int) : Int =
  	if(a > b) base
  	else
  		operation(f(a), arithmetic(operation,base)(f)(a+1,b))
                                                  //> arithmetic: (operation: (Int, Int) => Int, base: Int)(f: Int => Int)(a: Int,
                                                  //|  b: Int)Int

	arithmetic( (x,y) => x + y, 0)(z => z * z)(1,4)
                                                  //> res0: Int = 30
}