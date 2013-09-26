package recfun
import common._
import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if (c == 0) 1 else if (c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    @tailrec
    def balanceWithDepth(chars: List[Char], depth: Int): Boolean = {
      /* Border case */
      if (chars.isEmpty)
        depth == 0
      /* Early termination case */
      else if (depth == 0 && chars.head == ')') false
      /* Main Recursion */
      else if (chars.head == '(')
        balanceWithDepth(chars.tail, depth + 1)
      else if (chars.head == ')')
        balanceWithDepth(chars.tail, depth - 1)
      else
        balanceWithDepth(chars.tail, depth)
    }

    balanceWithDepth(chars, 0)

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    if (money <= 0 || coins.isEmpty)
      0
    else if (money == coins.head)
      1  + countChange(money, coins.tail)
    else
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }

}
