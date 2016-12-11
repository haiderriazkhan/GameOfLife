/**
  * Author : Haider Riaz Khan
  */
object StartGame {

  def main(args : Array[String]) : Unit  = {

    val seed  = Life(Set((1,2), (2,3), (3,4), (7,8)) , 10 , 10)

    lazy val generations: Stream[Life] = seed #:: generations.map(_.nextGen)
    generations.takeWhile(_.hasLiveCells).foreach(x => println(PrintGameOfLife.printGame(x) + "\n"))

  }


}
