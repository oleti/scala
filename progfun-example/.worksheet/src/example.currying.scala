package example

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(180); 
  
  def arithmetic(operation : (Int,Int) => Int, base:Int)(f:Int => Int)(a:Int, b:Int) : Int =
  	if(a > b) base
  	else
  		operation(f(a), arithmetic(operation,base)(f)(a+1,b));System.out.println("""arithmetic: (operation: (Int, Int) => Int, base: Int)(f: Int => Int)(a: Int, b: Int)Int""");$skip(50); val res$0 = 

	arithmetic( (x,y) => x + y, 0)(z => z * z)(1,4);System.out.println("""res0: Int = """ + $show(res$0))}
}
