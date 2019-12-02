package io.turntabl.manager

import io.turntabl.{AccessCard, TurnTablEmployee}

class TLCManager(fname: String,
                 lname: String,
                 val role_description: String = "manager",
                 val Github_url: String = "https://github.com/turntabl") extends TurnTablEmployee(fname, lname) with AccessCard {

override def GetWorkLoad: String = "Works very hard"

override val yearsServed: Int = 100

override val ID: Int = 45678

override def gainAccess(day: String): Boolean = true

}
object TLCManager {

  def apply(fname: String, lname: String) = new TLCManager(fname, lname)

  def unapply(m: TLCManager) = Some(m.fname, m.lname)
}
