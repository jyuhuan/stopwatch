package me.yuhuan.stopwatch

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
object Test extends App {

  val time = timed {
    for (i <- 0 until 1000) {
      println(i)
    }
  }

  val bp = 0

}
