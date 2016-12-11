/**
  * Author : Haider Riaz Khan
  */
object PrintGameOfLife {

  private val living = 'X'

  private val dead = '.'

  def printGame(life : Life): String = {

    (0 to (life.yLimit-1)).map(row =>
      (0 to (life.xLimit-1)).map(column => if (life.isLive((column, row))) living else dead).mkString
    ).mkString("\n")

  }

}
