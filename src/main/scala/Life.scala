/**
  * Author : Haider Riaz Khan
  */
class Life(liveCells : Set[(Int,Int)] , xLimit : Int , yLimit : Int) {

  private val neighbourOffsets = Set (

      (-1,-1) , (0, -1) , (0, 1),
      (-1, 0)           , (1, 0),
      (-1, 1), (0 , 1) , (1 , 1)

  )

  private def neighbours(cell : (Int, Int)) :  Set[(Int, Int)] =  {

    neighbourOffsets.map(offset => (cell._1 + offset._1 , + cell._2 + offset._2)).filter(isInBounds)

  }


  private def isInBounds(cell : (Int, Int)) :  Boolean  = {

    0 <= cell._1 && cell._1 < xLimit &&
    0 <= cell._2 && cell._2 < yLimit

  }

  def isLive(cell : (Int, Int)) : Boolean = {

    liveCells.contains(cell)

  }

  def nextGen() : Life = {

    val potentialLiveCells = liveCells.flatMap(neighbours).union(liveCells)


  }




}



