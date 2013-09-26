package recfun
import recfun._


object Sample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  println("Welcome to the Scala worksheet");$skip(168); 

  def main() {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  };System.out.println("""main: ()Unit""");$skip(138); 

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if(c == 0) 1 else if (c == r) 1 else pascal(c - 1,r - 1) + pascal(c,r-1);System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(12); 
 	
 	main()}
  
}
