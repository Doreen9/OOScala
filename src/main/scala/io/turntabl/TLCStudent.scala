package io.turntabl

import io.turntabl.grades.Grade

class TLCStudent(fname: String,
                lname: String,
                 val yearStarted: Int,
                 val role_description: String = "developer",
                 val Github_url: String = "https://github.com/turntabl") extends TurnTablEmployee(fname, lname) with AccessCard {

  override def yearsServed: Int = {
    2019 - yearStarted
  }

  def sameService(student1: TLCStudent): Boolean = student1.yearsServed equals yearsServed

  def TopGrade: Grade = {
    Grade("Programming_Fundamentals", "A")
  }

  override def GetWorkLoad: String = "Works super hard"

  override val ID: Int = 56789

  override def gainAccess(day: String): Boolean = day match {
    case "monday" | "tuesday" | "wednesday" | "thursday" | "friday" => true
    case _ => false
  }
}

  object TLCStudent {

    def apply(fname: String, lname: String, yearStarted: Int): TLCStudent = new TLCStudent(fname, lname, yearStarted)

    def unapply(s: TLCStudent) = Some(s.fname, s.lname)

  }









