package io.turntabl

trait AccessCard{
  val ID: Int
  def gainAccess(day: String): Boolean

}
