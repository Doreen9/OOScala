package io.turntabl.student
import io.turntabl.grades.Grade

abstract class TurnTablEmployee{
  def GetWorkLoad : String
  def yearsServed: Int
}

trait AccessCard{
  val ID: Int
  def gainAccess(day: String): Boolean

}


class TLCStudent( val fname: String,
                  val lname: String,
                 yearStarted: Int,
                 val IDnumber: String = "12234",
                 val role_description: String = "developer",
                 val Github_url: String = "https://github.com/turntabl") extends TurnTablEmployee() with AccessCard {


  override def toString: String = s"Name: $fname $lname \n ID: $IDnumber \n Role_description: $role_description"


  override def yearsServed: Int = {
    2019 - yearStarted
  }

  def sameService(student1: TLCStudent) = student1.yearsServed equals yearsServed

  def TopGrade = {
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

    def apply(fname: String, lname: String, year: Int) = new TLCStudent(fname, lname, year)

  }

  class TurnTablManager(val fname: String,
                        val lname: String,
                        val role_description: String = "manager",
                        val Github_url: String = "https://github.com/turntabl") extends TurnTablEmployee with AccessCard {

    override def GetWorkLoad: String = "Works very hard"

    override val yearsServed: Int = 100

    override val ID: Int = 45678

    override def gainAccess(day: String): Boolean = true

}
  object TurnTablManager {

    def apply(fname: String, lname: String) = new TurnTablManager(fname, lname)

  }


  object MyApp extends App {

    val Student1 = TLCStudent("Christiana", "Asare", 2017)
    val Manager = TurnTablManager("Doreen", "Dodoo")
    //
    //  val Student2 = TLCStudent("Franklin", "Luther", 2020)
    //
    //  print(Student1 sameService Student2)
    //
    //  print(Student1.TopGrade)

//    def howHard(employee: TurnTablEmployee) = {
//      print(employee.GetWorkLoad)
//    }
    print(Manager.gainAccess("saturday"))

  }





