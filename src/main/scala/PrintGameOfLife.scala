/**
  * Author : Haider Riaz Khan
  */
object PrintGameOfLife {

  private val living = 'X'

  private val dead = '.'

  def printGame(life : Life): String = {

    (0 to life.yLimit).map(row =>
      (0 to life.xLimit).map(column => if (life.isLive((row, column))) living else dead).mkString
    ).mkString("\n")

  }

}
