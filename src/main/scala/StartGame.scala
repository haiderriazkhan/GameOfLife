/**
  * Author : Haider Riaz Khan
  */
object StartGame {

  def main(args : Array[String]) : Unit  = {

    // Toad Oscillator with Period 2
    val seed  = Life(Set((2,2), (3,2), (4,2), (1,3) , (2,3) , (3,3)) , 6 , 6)

    var genCounter = -1

    lazy val generations: Stream[Life] = seed #:: generations.map(_.nextGen)
    generations.takeWhile(_.hasLiveCells).foreach(x => println(PrintGameOfLife.printGame(x) + "\n\n" + s"Generation : ${genCounter+=1; genCounter}" + "\n"))

  }


}
