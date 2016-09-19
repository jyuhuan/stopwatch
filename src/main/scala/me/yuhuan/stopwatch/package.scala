package me.yuhuan

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
package object stopwatch {

  def timed[X](op: => X): Long = {

    val tStart = System.nanoTime()
    op
    val tEnd = System.nanoTime()

    tEnd - tStart
  }

}
